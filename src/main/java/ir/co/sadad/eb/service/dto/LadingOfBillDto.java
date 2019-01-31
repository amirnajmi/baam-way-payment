package ir.co.sadad.eb.service.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

//todo don't use lombok in dtos

public class LadingOfBillDto implements Serializable {

    public LadingOfBillDto() {
    }

    private Long id;
    //تاریخ بارنامه
    private LocalDate date;
    //شماره بارنامه
    private String no;
    //سریال بارنامه
    private String serial;
    //شماره حواله
    private String orderNo;
    //استان مبدا
    private String sourceProvince;
    //استان مقصد
    private String destinationProvince;
    //شهر مبدا
    private String sourceCity;
    //شهر مقصد
    private String destinationCity;
    //مبلغ کرایه
    private Double freightAmount;
    //مبلغ قابل پرداخت
    private Double payableAmount;
    //سهم راننده
    private Double driverContribution;
    //سهم شرکت حمل
    private Double shippingCompanyContribution;
    //عوارض
    private Double toll;
    //کسری مجاز
    private Double allowedDeficit;
    //کسری غیرمجاز
    private Double illegalDeficit;
    //نرخ کرایه حمل
    private Double carriageRate;
    //کرایه حمل
    private Double carriageFare;
    //حق مدیریت
    private Double managerSalary ;
    //حق بیمه
    private Double premium;
    // مقدار غرامت دستی :|
    private Double amountOfHandyIndemnity;
    // مبلغ غرامت دستی :|
    private Double feeOfHandyIndemnity;
    // مقدار غرامت نرسیده :|
    private Double amountOfNotArrivedIndemnity;
    // مبلغ غرامت نرسیده :|
    private Double feeOfNotArrivedIndemnity;
    // مسافت
    private Double distance ;
    //راننده ها
    private List<DriverDto> drivers;
    // محموله
    private CargoDto cargo;
    //خودرو
    private VehicleDto vehicle;

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


}
