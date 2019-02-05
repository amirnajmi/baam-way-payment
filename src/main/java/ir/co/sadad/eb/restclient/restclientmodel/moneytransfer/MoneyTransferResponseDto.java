package ir.co.sadad.eb.restclient.restclientmodel.moneytransfer;

import java.util.List;

public class MoneyTransferResponseDto {

    private ResultSet resultSet;

    private Metadata metaData;

    private List<Notification> notifications;

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public Metadata getMetaData() {
        return metaData;
    }

    public void setMetaData(Metadata metaData) {
        this.metaData = metaData;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
