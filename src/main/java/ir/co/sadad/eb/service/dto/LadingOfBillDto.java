package ir.co.sadad.eb.service.dto;

import ir.co.sadad.eb.domain.LadingOfBill;

import java.io.Serializable;
import java.time.LocalDate;

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
    //راننده اول
    private DriverDto firstDriver;
    // راننده دوم
    private DriverDto secondDriver;
    // محموله
    private CargoDto cargo;


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

    public DriverDto getFirstDriver() {
        return firstDriver;
    }

    public void setFirstDriver(DriverDto firstDriver) {
        this.firstDriver = firstDriver;
    }

    public DriverDto getSecondDriver() {
        return secondDriver;
    }

    public void setSecondDriver(DriverDto secondDriver) {
        this.secondDriver = secondDriver;
    }

    public CargoDto getCargo() {
        return cargo;
    }

    public void setCargo(CargoDto cargo) {
        this.cargo = cargo;
    }
}
