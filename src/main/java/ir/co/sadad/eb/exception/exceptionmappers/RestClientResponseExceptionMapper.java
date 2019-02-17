package ir.co.sadad.eb.exception.exceptionmappers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ir.co.sadad.eb.exception.BaseRestClientException;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransfer.MoneyTransferResponseDto;
import ir.co.sadad.eb.util.HttpStatusCode;
import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;


import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class RestClientResponseExceptionMapper implements ResponseExceptionMapper<BaseRestClientException> {


    @Override
    public BaseRestClientException toThrowable(Response response) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            MoneyTransferResponseDto moneyTransferResponseDto = objectMapper.readValue(response.readEntity(String.class), new TypeReference<MoneyTransferResponseDto>() {
            });

            if (response.getStatus() == 200) {
                return null;
            }

            if (moneyTransferResponseDto != null) {
                if (moneyTransferResponseDto.getNotifications() != null && !moneyTransferResponseDto.getNotifications().isEmpty()) {
                    if (moneyTransferResponseDto.getNotifications().get(0).getMessage() != null) {
                        return new BaseRestClientException(HttpStatusCode.getEnum(response.getStatus()), moneyTransferResponseDto.getNotifications().get(0).getMessage());
                    } else {
                        return new BaseRestClientException(HttpStatusCode.getEnum(response.getStatus()), HttpStatusCode.getEnum(response.getStatus()).getDescription());
                    }
                } else if(moneyTransferResponseDto.getCode() != null && !moneyTransferResponseDto.getCode().isEmpty()){
                    return new BaseRestClientException(HttpStatusCode.BAD_REQUEST, moneyTransferResponseDto.getCode(), moneyTransferResponseDto.getType(), moneyTransferResponseDto.getMessage());
                } else{
                    return new BaseRestClientException(HttpStatusCode.getEnum(response.getStatus()), "MONEY_TRANSFER_NOT_OK_AND_NOTIFICATIONS_IS_NULL");
                }
            } else {
                return new BaseRestClientException(HttpStatusCode.getEnum(response.getStatus()), "MONEY_TRANSFER_NOT_OK_AND_RESPONSE_IS_NULL");
            }

        } catch (Exception e) {
            return new BaseRestClientException(HttpStatusCode.INTERNAL_SERVER_ERROR, "MONEY_TRANSFER_UNKNOWN_WEB_SERVICE_ERROR", e.getMessage());
        }
    }

}
