package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.restclient.restclientapi.MoneyTransferRestClient;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransfer.MoneyTransferRequestDto;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransfer.MoneyTransferResponseDto;
import ir.co.sadad.eb.util.HttpStatusCode;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class MoneyTransferService {

    @Inject
    @RestClient
    private MoneyTransferRestClient moneyTransferRestClient;

    @Inject
    private HttpServletRequest httpServletRequest;

    public MoneyTransferResponseDto createMoneyTransfer(String sourceAccount, String destinationAccount, Double amount, String counterpartyName) throws BusinessException {
        BusinessException businessException = new BusinessException(HttpStatusCode.BAD_REQUEST);
        if (sourceAccount == null || sourceAccount.isEmpty()) {
            businessException.add("createMoneyTransfer.sourceAccount.isNullOrEmpty");
        }

        if(destinationAccount == null || destinationAccount.isEmpty()){
            businessException.add("createMoneyTransfer.destinationAccount.isNullOrEmpty");
        }

        if(amount == null || amount == 0){
            businessException.add("createMoneyTransfer.amount.isNullOrZero");
        }

        if(counterpartyName == null || counterpartyName.isEmpty()){
            businessException.add("createMoneyTransfer.counterpartyName.isNullOrEmpty");
        }

        if(!businessException.messageIsEmpty()){
            throw businessException;
        }

        String authorizationToken = httpServletRequest.getHeader("Authorization");
        Boolean submit = true;
        Boolean ignoreHints = true;
        String channel = "ISC_MB";
        String uuid = UUID.randomUUID().toString();

        MoneyTransferRequestDto moneyTransferRequestDto = new MoneyTransferRequestDto();
        moneyTransferRequestDto.setAccountId(sourceAccount);
        moneyTransferRequestDto.setCounterpartyAccount(destinationAccount);
        moneyTransferRequestDto.setInstructedAmount(amount);
        moneyTransferRequestDto.setAlias("BAAM.RAAH");
        moneyTransferRequestDto.setId(uuid);
        moneyTransferRequestDto.setInstructedCurrency("IRR");
        moneyTransferRequestDto.setCounterpartyName(counterpartyName);
        moneyTransferRequestDto.setPaymentReference("");
        moneyTransferRequestDto.setPaymentDescription("");
        moneyTransferRequestDto.setOnDate(new Date());

        return moneyTransferRestClient.createMoneyTransfer(authorizationToken, submit, ignoreHints, channel, moneyTransferRequestDto);
    }

    public MoneyTransferResponseDto inquiryMoneyTransfer(String uuid) throws BusinessException {
        if (uuid == null || uuid.isEmpty()) {
            throw new BusinessException(HttpStatusCode.BAD_REQUEST, "inquiryMoneyTransfer.uuid.isNullOrEmpty");
        }

        String authorizationToken = httpServletRequest.getHeader("Authorization");
        return moneyTransferRestClient.inquiryMoneyTransfer(authorizationToken, uuid);
    }

}
