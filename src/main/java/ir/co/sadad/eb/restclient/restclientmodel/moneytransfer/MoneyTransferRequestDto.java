package ir.co.sadad.eb.restclient.restclientmodel.moneytransfer;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
public class MoneyTransferRequestDto {

    private String id;
    private String alias;
    private String accountId;
    private Double instructedAmount;
    private String instructedCurrency;
    private String counterpartyName;
    private String counterpartyAccount;
    private String paymentReference;
    private String paymentDescription;
    //private LocalDateTime onDate;
    private Long onDate;
    @JsonIgnore
    private String responseString;
    @JsonIgnore
    private String accessToken;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Double getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(Double instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public String getInstructedCurrency() {
        return instructedCurrency;
    }

    public void setInstructedCurrency(String instructedCurrency) {
        this.instructedCurrency = instructedCurrency;
    }

    public String getCounterpartyName() {
        return counterpartyName;
    }

    public void setCounterpartyName(String counterpartyName) {
        this.counterpartyName = counterpartyName;
    }

    public String getCounterpartyAccount() {
        return counterpartyAccount;
    }

    public void setCounterpartyAccount(String counterpartyAccount) {
        this.counterpartyAccount = counterpartyAccount;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    public void setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }

    public Long getOnDate() {
        return onDate;
    }

    public void setOnDate(Long onDate) {
        this.onDate = onDate;
    }

    public String getResponseString() {
        return responseString;
    }

    public void setResponseString(String responseString) {
        this.responseString = responseString;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
