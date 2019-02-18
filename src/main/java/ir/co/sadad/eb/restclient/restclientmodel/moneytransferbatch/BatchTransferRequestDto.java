package ir.co.sadad.eb.restclient.restclientmodel.moneytransferbatch;

import ir.co.sadad.eb.restclient.restclientmodel.moneytransfer.MoneyTransferRequestDto;

import java.util.List;

public class BatchTransferRequestDto {

    private String id;
    private Long onDate;
    private Double totalAmount;
    private Integer totalCount;
    private String accountId;
    private List<MoneyTransferRequestDto> items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getOnDate() {
        return onDate;
    }

    public void setOnDate(Long onDate) {
        this.onDate = onDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<MoneyTransferRequestDto> getItems() {
        return items;
    }

    public void setItems(List<MoneyTransferRequestDto> items) {
        this.items = items;
    }
}
