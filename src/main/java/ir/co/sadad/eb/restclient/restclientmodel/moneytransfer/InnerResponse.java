package ir.co.sadad.eb.restclient.restclientmodel.moneytransfer;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;

public class InnerResponse {

    @JsonIgnore
    private Object[] items;

    @JsonIgnore
    private String scheduledTransfer;

    private String id;
    private String alias;
    private String accountId;
    private BigDecimal instructedAmount;
    private String instructedCurrency;
    private String counterpartyName;
    private String counterpartyAccount;
    private String paymentReference;
    private String paymentDescription;
    private String method;
    private String mode;

    @JsonIgnore
    private BigDecimal totalAmount;

    @JsonIgnore
    private Integer totalCount;

    private String creatorName;
    private String status;
    private String initiationDateTime;
    private String updateDateTime;
    private String onDate;
    private String confirmationDateTime;
    private String traceNo;
    private String responseCode;
    private String responseMessage;
    private Boolean archived;
    private String creatorSSN;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(BigDecimal instructedAmount) {
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

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInitiationDateTime() {
        return initiationDateTime;
    }

    public void setInitiationDateTime(String initiationDateTime) {
        this.initiationDateTime = initiationDateTime;
    }

    public String getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public String getOnDate() {
        return onDate;
    }

    public void setOnDate(String onDate) {
        this.onDate = onDate;
    }

    public String getConfirmationDateTime() {
        return confirmationDateTime;
    }

    public void setConfirmationDateTime(String confirmationDateTime) {
        this.confirmationDateTime = confirmationDateTime;
    }

    public String getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getCreatorSSN() {
        return creatorSSN;
    }

    public void setCreatorSSN(String creatorSSN) {
        this.creatorSSN = creatorSSN;
    }

    public Date getInitiationDateTimeEpochAsDate(){
        if(initiationDateTime != null){
            return new Date(Long.parseLong(initiationDateTime));
        }else{
            return null;
        }
    }

    public Date getUpdateDateTimeEpochAsDate(){
        if(updateDateTime != null){
            return new Date(Long.parseLong(updateDateTime));
        }else{
            return null;
        }
    }

    public Date getOnDateEpochAsDate(){
        if(onDate != null){
            return new Date(Long.parseLong(onDate)) ;
        }else{
            return null;
        }
    }

    public Date getConfirmationDateTimeEpochAsDate(){
        if(confirmationDateTime != null){
            return new Date(Long.parseLong(confirmationDateTime)) ;
        }else{
            return null;
        }
    }

    public Object[] getItems() {
        return items;
    }

    public void setItems(Object[] items) {
        this.items = items;
    }

    public String getScheduledTransfer() {
        return scheduledTransfer;
    }

    public void setScheduledTransfer(String scheduledTransfer) {
        this.scheduledTransfer = scheduledTransfer;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
