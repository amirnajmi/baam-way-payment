package ir.co.sadad.eb.restclient.restclientmodel.moneytransferbatch;


public class BatchPerTransferResponseDto {

    private BatchInnerResponse resultSet;
    private Metadata metadata;

    public BatchInnerResponse getResultSet() {
        return resultSet;
    }

    public void setResultSet(BatchInnerResponse resultSet) {
        this.resultSet = resultSet;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
