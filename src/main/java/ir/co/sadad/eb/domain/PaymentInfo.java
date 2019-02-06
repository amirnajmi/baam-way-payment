package ir.co.sadad.eb.domain;

import java.time.LocalDate;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PAYMENT_INFO", schema = "BAMWAY")
public class PaymentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(targetEntity = InvoiceDetail.class)
    @JoinColumn(name = "INVOICE_DETAIL_ID", referencedColumnName = "ID")
    private InvoiceDetail invoiceDetail;

    @Basic
    @Column(name = "GUID", nullable = false)
    //شناسه یکتای درخواست
    private String guid;

    @Basic
    @Column(name = "SOURCE_ACCOUNT_NO", nullable = false)
    //شماره حساب مبدأ
    private String sourceAccountNo;

    @Basic
    @Column(name = "INSTRUCTED_AMOUNT", nullable = false)
    //مبلغ
    private BigDecimal instructedAmount;

    @Basic
    @Column(name = "COUNTERPARTY_NAME")
    //نام صاحب حساب مقصد
    private String counterpartyName;

    @Basic
    @Column(name = "COUNTERPARTY_ACCOUNT", nullable = false)
    //شماره حساب مقصد
    private String counterpartyAccount;

    @Basic
    @Column(name = "PAYMENT_REFERENCE")
    //شناسه واریز
    private String paymentReference;

    @Basic
    @Column(name = "INITIATION_DATE_TIME")
    //تاریخ ثبت تراکنش
    private LocalDate initiationDateTime;

    @Basic
    @Column(name = "UPDATE_DATE_TIME")
    //تاریخ آخرین بروزرسانی
    private LocalDate updateDateTime;

    @Basic
    @Column(name = "CONFIRMATION_DATE_TIME")
    //تاریخ و زمان تأیید تراکنش
    private LocalDate confirmationDateTime;

    @Basic
    @Column(name = "ON_DATE")
    //تاریخ و زمان سررسید انجام درخواست
    private LocalDate onDate;

    @Basic
    @Column(name = "TRACE_NO")
    //شماره پیگیری
    private String traceNo;

    @Basic
    @Column(name = "RESPONSE_CODE")
    //کد پاسخ
    private String responseCode;

    @Basic
    @Column(name = "RESPONSE_MESSAGE")
    //پیغام پاسخ
    private String responseMessage;

    @Column(name = "PAYMENT_STATUS")
    @Enumerated(EnumType.STRING)
    //وضعیت انتقال پول
    private PaymentStatus paymentStatus;

    @Column(name = "PAYMENT_METHOD")
    @Enumerated(EnumType.STRING)
    //نوع انتقال پول
    private PaymentMethod paymentMethod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InvoiceDetail getInvoiceDetail() {
        return invoiceDetail;
    }

    public void setInvoiceDetail(InvoiceDetail invoiceDetail) {
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

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
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

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


}
