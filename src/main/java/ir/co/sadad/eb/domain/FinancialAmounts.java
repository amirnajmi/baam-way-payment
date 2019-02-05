package ir.co.sadad.eb.domain;

import javax.persistence.*;

//مقادیر مالی بارنامه
@Entity
@Table(name = "FINANCIAL_AMOUNTS", schema = "PUSH")
public class FinancialAmounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    //مبلغ کرایه
    @Column(name = "FREIGHT_AMOUNT")
    private Double freightAmount;
    //مبلغ قابل پرداخت
    @Column(name = "PAYABLE_AMOUNT")
    private Double payableAmount;
    //سهم راننده
    @Column(name = "DRIVER_CONTRIBUTION")
    private Double driverContribution;
    //سهم شرکت حمل
    @Column(name = "SHIPPING_COMPANY_CONTRIBUTION")
    private Double shippingCompanyContribution;
    //عوارض
    @Column(name = "RECEIPT")
    private Double toll;
    //کسری مجاز
    @Column(name = "ALLOWED_DEFICIT")
    private Double allowedDeficit;
    //کسری غیرمجاز
    @Column(name = "ILLEGAL_DEFICIT")
    private Double illegalDeficit;
    //نرخ کرایه حمل
    @Column(name = "CARRIAGE_RATE")
    private Double carriageRate;
    //کرایه حمل
    @Column(name = "CARRIAGE_FARE")
    private Double carriageFare;
    //حق مدیریت
    @Column(name = "MANAGER_SALARY")
    private Double managerSalary ;
    //حق بیمه
    @Column(name = "PREMIUM")
    private Double premium;
    // مقدار غرامت دستی :|
    @Column(name = "AMOUNT_OF_HANDY_INDEMNITY")
    private Double amountOfHandyIndemnity;
    // مبلغ غرامت دستی :|
    @Column(name = "FEE_OF_HANDY_INDEMNITY")
    private Double feeOfHandyIndemnity;
    // مقدار غرامت نرسیده :|
    @Column(name = "AMOUNT_OF_NOT_ARRIVED_INDEMNITY")
    private Double amountOfNotArrivedIndemnity;
    // مبلغ غرامت نرسیده :|
    @Column(name = "FEE_OF_NOT_ARRIVED_INDEMNITY")
    private Double feeOfNotArrivedIndemnity;

    @OneToOne(targetEntity = InvoiceDetail.class)
    @JoinColumn(name = "INVOICE_DETAIL_ID")
    private InvoiceDetail invoiceDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(Double freightAmount) {
        this.freightAmount = freightAmount;
    }

    public Double getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(Double payableAmount) {
        this.payableAmount = payableAmount;
    }

    public Double getDriverContribution() {
        return driverContribution;
    }

    public void setDriverContribution(Double driverContribution) {
        this.driverContribution = driverContribution;
    }

    public Double getShippingCompanyContribution() {
        return shippingCompanyContribution;
    }

    public void setShippingCompanyContribution(Double shippingCompanyContribution) {
        this.shippingCompanyContribution = shippingCompanyContribution;
    }

    public Double getToll() {
        return toll;
    }

    public void setToll(Double toll) {
        this.toll = toll;
    }

    public Double getAllowedDeficit() {
        return allowedDeficit;
    }

    public void setAllowedDeficit(Double allowedDeficit) {
        this.allowedDeficit = allowedDeficit;
    }

    public Double getIllegalDeficit() {
        return illegalDeficit;
    }

    public void setIllegalDeficit(Double illegalDeficit) {
        this.illegalDeficit = illegalDeficit;
    }

    public Double getCarriageRate() {
        return carriageRate;
    }

    public void setCarriageRate(Double carriageRate) {
        this.carriageRate = carriageRate;
    }

    public Double getCarriageFare() {
        return carriageFare;
    }

    public void setCarriageFare(Double carriageFare) {
        this.carriageFare = carriageFare;
    }

    public Double getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(Double managerSalary) {
        this.managerSalary = managerSalary;
    }

    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }

    public Double getAmountOfHandyIndemnity() {
        return amountOfHandyIndemnity;
    }

    public void setAmountOfHandyIndemnity(Double amountOfHandyIndemnity) {
        this.amountOfHandyIndemnity = amountOfHandyIndemnity;
    }

    public Double getFeeOfHandyIndemnity() {
        return feeOfHandyIndemnity;
    }

    public void setFeeOfHandyIndemnity(Double feeOfHandyIndemnity) {
        this.feeOfHandyIndemnity = feeOfHandyIndemnity;
    }

    public Double getAmountOfNotArrivedIndemnity() {
        return amountOfNotArrivedIndemnity;
    }

    public void setAmountOfNotArrivedIndemnity(Double amountOfNotArrivedIndemnity) {
        this.amountOfNotArrivedIndemnity = amountOfNotArrivedIndemnity;
    }

    public Double getFeeOfNotArrivedIndemnity() {
        return feeOfNotArrivedIndemnity;
    }

    public void setFeeOfNotArrivedIndemnity(Double feeOfNotArrivedIndemnity) {
        this.feeOfNotArrivedIndemnity = feeOfNotArrivedIndemnity;
    }

    public InvoiceDetail getInvoiceDetail() {
        return invoiceDetail;
    }

    public void setInvoiceDetail(InvoiceDetail invoiceDetail) {
        this.invoiceDetail = invoiceDetail;
    }
}

