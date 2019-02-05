package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

//todo don't use lombok in dtos
@Schema(name = "LadingOfBill", description = "بارنامه")
public class LadingOfBillDto implements Serializable {

    public LadingOfBillDto() {
    }

    @Schema(description = "شناسه")
    private Long id;
    @Schema(required = true , example = "512689700" , description = "کد پیگیری بارنامه")
    private Long trackingCode;
    @Schema(required = true , example = "2019-02-15" , description = "تاریخ بارنامه")
    private LocalDate date;
    @Schema(required = true , example = "12345" , description = "شماره بارنامه")
    private String no;
    @Schema(required = true , example = "12345" , description = "سریال بارنامه")
    private String serial;
    @Schema(required = true , example = "123" , description = "شماره حواله")
    private String orderNo;
    @Schema(required = true , example = "بندر عباس" , description = "استان مبدا")
    private String sourceProvince;
    @Schema(required = true , example = "تهران" , description = "استان مقصد")
    private String destinationProvince;
    @Schema(required = true , example = "100000" , description = "شهر مبدا")
    private String sourceCity;
    @Schema(required = true , example = "99000" , description = "شهر مقصد")
    private String destinationCity;
    @Schema(required = true , example = "0.0" , description = "مبلغ کرایه")
    private Double freightAmount;
    @Schema(required = true , example = "0.0" , description = "مبلغ قابل پرداخت")
    private Double payableAmount;
    @Schema(required = true , example = "0.0" , description = "سهم راننده")
    private Double driverContribution;
    @Schema(required = true , example = "0.0" , description = "سهم شرکت حمل")
    private Double shippingCompanyContribution;
    @Schema(required = true , example = "0.0" , description = "عوارض")
    private Double toll;
    @Schema(required = true , example = "0.0" , description = "کسری مجاز")
    private Double allowedDeficit;
    @Schema(required = true , example = "0.0" , description = "کسری غیرمجاز")
    private Double illegalDeficit;
    @Schema(required = true , example = "0.0" , description = "نرخ کرایه حمل")
    private Double carriageRate;
    @Schema(required = true , example = "0.0" , description = "کرایه حمل")
    private Double carriageFare;
    @Schema(required = true , example = "0.0" , description = "حق مدیریت")
    private Double managerSalary ;
    @Schema(required = true , example = "0.0" , description = "حق بیمه")
    private Double premium;
    @Schema(required = true , example = "0.0" , description = "مقدار غرامت دستی")
    private Double amountOfHandyIndemnity;
    @Schema(required = true , example = "0.0" , description = "مبلغ غرامت دستی")
    private Double feeOfHandyIndemnity;
    @Schema(required = true , example = "0.0" , description = "مقدار غرامت نرسیده")
    private Double amountOfNotArrivedIndemnity;
    @Schema(required = true , example = "0.0" , description = "مبلغ غرامت نرسیده")
    private Double feeOfNotArrivedIndemnity;
    @Schema(required = true , example = "136.4" , description = "مسافت")
    private Double distance ;
    @Schema(required = true , description = "راننده ها")
    private List<DriverDto> drivers;
    @Schema(required = true , description = "محموله")
    private CargoDto cargo;
    @Schema(required = true , description = "خودرو")
    private VehicleDto vehicle;

    @Schema(required = true , description = "شرکت حمل" )
    private ShippingCompanyDto shippingCompany;
    @Schema(required = true , description = "شرکت کارفرما" )
    private OwnerCompanyDto ownerCompany;


    public ShippingCompanyDto getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(ShippingCompanyDto shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public OwnerCompanyDto getOwnerCompany() {
        return ownerCompany;
    }

    public void setOwnerCompany(OwnerCompanyDto ownerCompany) {
        this.ownerCompany = ownerCompany;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSourceProvince() {
        return sourceProvince;
    }

    public void setSourceProvince(String sourceProvince) {
        this.sourceProvince = sourceProvince;
    }

    public String getDestinationProvince() {
        return destinationProvince;
    }

    public void setDestinationProvince(String destinationProvince) {
        this.destinationProvince = destinationProvince;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
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

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<DriverDto> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<DriverDto> drivers) {
        this.drivers = drivers;
    }

    public CargoDto getCargo() {
        return cargo;
    }

    public void setCargo(CargoDto cargo) {
        this.cargo = cargo;
    }

    public VehicleDto getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDto vehicle) {
        this.vehicle = vehicle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
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

    public Long getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(Long trackingCode) {
        this.trackingCode = trackingCode;
    }
}
