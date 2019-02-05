package ir.co.sadad.eb.service.dto;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import java.io.Serializable;

@Schema(name = "FinancialAmountsDto", description = "مقادیر مالی آیتم صورتحساب")
public class FinancialAmountsDto implements Serializable {
    @Schema(description = "شناسه")
    private Long id;
    //مبلغ کرایه
    @Schema(required = true , example = "0.0" , description = "مبلغ کرایه")
    private Double freightAmount;
    //مبلغ قابل پرداخت
    @Schema(required = true , example = "0.0" , description = "مبلغ قابل پرداخت")
    private Double payableAmount;
    //سهم راننده
    @Schema(required = true , example = "0.0" , description = "سهم راننده")
    private Double driverContribution;
    //سهم شرکت حمل
    @Schema(required = true , example = "0.0" , description = "سهم شرکت حمل")
    private Double shippingCompanyContribution;
    //عوارض
    @Schema(required = true , example = "0.0" , description = "عوارض")
    private Double toll;
    //کسری مجاز
    @Schema(required = true , example = "0.0" , description = "کسری مجاز")
    private Double allowedDeficit;
    //کسری غیرمجاز
    @Schema(required = true , example = "0.0" , description = "کسری غیرمجاز")
    private Double illegalDeficit;
    //نرخ کرایه حمل
    @Schema(required = true , example = "0.0" , description = "نرخ کرایه حمل")
    private Double carriageRate;
    //کرایه حمل
    @Schema(required = true , example = "0.0" , description = "کرایه حمل")
    private Double carriageFare;
    //حق مدیریت
    @Schema(required = true , example = "0.0" , description = "حق مدیریت")
    private Double managerSalary ;
    //حق بیمه
    @Schema(required = true , example = "0.0" , description = "حق بیمه")
    private Double premium;
    // مقدار غرامت دستی :|
    @Schema(required = true , example = "0.0" , description = "مقدار غرامت دستی")
    private Double amountOfHandyIndemnity;
    // مبلغ غرامت دستی :|
    @Schema(required = true , example = "0.0" , description = "مبلغ غرامت دستی")
    private Double feeOfHandyIndemnity;
    // مقدار غرامت نرسیده :|
    @Schema(required = true , example = "0.0" , description = "مقدار غرامت نرسیده")
    private Double amountOfNotArrivedIndemnity;
    // مبلغ غرامت نرسیده :|
    @Schema(required = true , example = "0.0" , description = "مبلغ غرامت نرسیده")
    private Double feeOfNotArrivedIndemnity;
    // آیتم صورتحصاب
    @Schema(required = true , description = "آیتم صورتحساب" )
    private InvoiceDetailDto invoiceDetail;

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

    public InvoiceDetailDto getInvoiceDetail() {
        return invoiceDetail;
    }

    public void setInvoiceDetail(InvoiceDetailDto invoiceDetail) {
        this.invoiceDetail = invoiceDetail;
    }
}
