package ir.co.sadad.eb.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentInfoDto implements Serializable {

    private Long id;
    private InvoiceDetailDto invoiceDetail;

    //شناسه یکتای درخواست
    private String guid;

    //شماره حساب مبدأ
    private String sourceAccountNo;

    //مبلغ
    private BigDecimal instructedAmount;

    //نام صاحب حساب مقصد
    private String counterpartyName;

    //شماره حساب مقصد
    private String counterpartyAccount;

    //شناسه واریز
    private String paymentReference;

    //تاریخ ثبت تراکنش
    private LocalDate initiationDateTime;

    //تاریخ آخرین بروزرسانی
    private LocalDate updateDateTime;

    //تاریخ و زمان تأیید تراکنش
    private LocalDate confirmationDateTime;

    //تاریخ و زمان سررسید انجام درخواست
    private LocalDate onDate;

    //شماره پیگیری
    private String traceNo;

    //کد پاسخ
    private String responseCode;

    //پیغام پاسخ
    private String responseMessage;

    //وضعیت انتقال پول
    private PaymentStatusDto paymentStatus;

    //نوع انتقال پول
    private PaymentMethodDto paymentMethod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InvoiceDetailDto getInvoiceDetail() {
        return invoiceDetail;
    }

    public void setInvoiceDetail(InvoiceDetailDto invoiceDetail) {
        this.invoiceDetail = invoiceDetail;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getSourceAccountNo() {
        return sourceAccountNo;
    }

    public void setSourceAccountNo(String sourceAccountNo) {
        this.sourceAccountNo = sourceAccountNo;
    }

    public BigDecimal getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(BigDecimal instructedAmount) {
        this.instructedAmount = instructedAmount;
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

    public LocalDate getInitiationDateTime() {
        return initiationDateTime;
    }

    public void setInitiationDateTime(LocalDate initiationDateTime) {
        this.initiationDateTime = initiationDateTime;
    }

    public LocalDate getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDate updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public LocalDate getConfirmationDateTime() {
        return confirmationDateTime;
    }

    public void setConfirmationDateTime(LocalDate confirmationDateTime) {
        this.confirmationDateTime = confirmationDateTime;
    }

    public LocalDate getOnDate() {
        return onDate;
    }

    public void setOnDate(LocalDate onDate) {
        this.onDate = onDate;
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

    public PaymentStatusDto getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatusDto paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMethodDto getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodDto paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
