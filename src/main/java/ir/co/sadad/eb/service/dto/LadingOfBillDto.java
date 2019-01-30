package ir.co.sadad.eb.service.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

//todo don't use lombok in dtos

public class LadingOfBillDto implements Serializable {

    public LadingOfBillDto() {
    }

    private int ladingBillId;
    //تاریخ بارنامه
    private LocalDate ladingBillDate;
    //شماره بارنامه
    private String ladingBillNo;
    //سریال بارنامه
    private String ladingBillSerial;
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
    private Double shippingComponyContribution;
    //راننده ها
    private List<DriverDto> drivers;
    // محموله
    private CargoDto cargo;
    //خودرو
    private VehicleDto vehicle;
    //عوارض
    private Double receipt;
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

    public int getLadingBillId() {
        return ladingBillId;
    }

    public void setLadingBillId(int ladingBillId) {
        this.ladingBillId = ladingBillId;
    }

    public LocalDate getLadingBillDate() {
        return ladingBillDate;
    }

    public void setLadingBillDate(LocalDate ladingBillDate) {
        this.ladingBillDate = ladingBillDate;
    }

    public String getLadingBillNo() {
        return ladingBillNo;
    }

    public void setLadingBillNo(String ladingBillNo) {
        this.ladingBillNo = ladingBillNo;
    }

    public String getLadingBillSerial() {
        return ladingBillSerial;
    }

    public void setLadingBillSerial(String ladingBillSerial) {
        this.ladingBillSerial = ladingBillSerial;
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

    public Double getShippingComponyContribution() {
        return shippingComponyContribution;
    }

    public void setShippingComponyContribution(Double shippingComponyContribution) {
        this.shippingComponyContribution = shippingComponyContribution;
    }




    public Double getReceipt() {
        return receipt;
    }

    public void setReceipt(Double receipt) {
        this.receipt = receipt;
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
}
