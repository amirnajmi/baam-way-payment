package ir.co.sadad.eb.restclient.restclientmodel.moneytransferbatch;

import ir.co.sadad.eb.restclient.restclientmodel.moneytransfer.MoneyTransferResponseDto;

import java.util.List;

public class BatchInnerResponse {

    private List<MoneyTransferResponseDto> innerResponse;
    private Metadata metadata;

    public List<MoneyTransferResponseDto> getInnerResponse() {
        return innerResponse;
    }

    public void setInnerResponse(List<MoneyTransferResponseDto> innerResponse) {
        this.innerResponse = innerResponse;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
