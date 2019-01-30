package ir.co.sadad.eb.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INVOICE_DETAIL")
public class InvoiceDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    //  شماره ورود
//    @Column(name = "LOAD_CODE")
//    private String loadCode;
    //  شماره خروح
//    @Column(name = "DEPARTURE_CODE")
//    private String departureCode;
    //  نام وسیله حمل کننده اولیه بار(کشتی)
//    @Column(name = "SOURCE_VEHICLE_NAME")
//    private String sourceVehicleName;
    //  انبار مبدا
//    @Column(name = "SOURCE_STORE_HOUSE")
//    private String sourceStoreHouse;
    //  انبار مقصد
//    @Column(name = "DESTINATION_STORE_HOUSE")
//    private String destinationStoreHouse;
    //  کد استان مبدا
//    @Column(name = "SOURCE_PROVINCE_CODE")
//    private String sourceProvinceCode;
    //  کد استان مقصد
//    @Column(name = "DESTINATION_PROVINCE_CODE")
//    private String destinationProvinceCode;
    //  عوارض
//    @Column(name = "RECEIPT")
//    private Double receipt;
    //قبوض
//    @Column(name = "BILLS")
//    private Double bills;
    //  پلاک یا شماره وسیله نقلیه حامل
//    @Column(name = "VEHICLE_TAG")
//    private String vehicleTag;
    //  شماره بارنامه
    @Column(name = "LADING_OF_BILL_CODE")
    private String ladingOfBillCode;
    @Column(name = "LADING_OF_BILL_SERIES")
    private String ladingOfBillSeries;
    //  وزن خروج از مبدا
//    @Column(name = "DEPARTURE_WEIGHT")
//    private Double departureWeight;
    //  وزن ورود به مقصد
//    @Column(name = "LOAD_WEIGHT")
//    private Double loadWeight;
    //  کسری مجاز
    @Column(name = "ALLOWED_DEFICIT")
    private Double allowedDeficit;
    // کسری غیرمجاز
    @Column(name = "ILLEGAL_DEFICIT")
    private Double illegalDeficit;
    //  نرخ کرایه حمل
    @Column(name = "CARRIAGE_RATE")
    private Double carriageRate;
    //  کرایه حمل
    @Column(name = "CARRIAGE_FARE")
    private Double carriageFare;
    //  حق مدیریت
    @Column(name = "MANAGER_SALARY")
    private Double managerSalary ;
    // حق بیمه
    @Column(name = "PREMIUM")
    private Double premium;
    // مقدار غرامت دستی :|
    @Column(name = "AMOUNT_OF_HANDY_INDEMNITY")
    private Double amountOfHandyIndemnity;
    // مبلغ غرامت دستی :|
    @Column(name = "FEE_OFF_HANDY_INDEMNITY")
    private Double feeOfHandyIndemnity;
    // مقدار غرامت نرسیده :|
    @Column(name = "AMOUNT_OF_NOT_ARRIVED_INDEMNITY")
    private Double amountOfNotArrivedIndemnity;
    // مبلغ غرامت نرسیده :|
    @Column(name = "FEE_OF_NOT_ARRIVED_INDEMNITY")
    private Double feeOfNotArrivedIndemnity;
    // مسافت
//    @Column(name = "DISTANCE")
//    private Double distance ;
    @ManyToOne()
    private Invoice invoice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLadingOfBillCode() {
        return ladingOfBillCode;
    }

    public void setLadingOfBillCode(String ladingOfBillCode) {
        this.ladingOfBillCode = ladingOfBillCode;
    }

    public String getLadingOfBillSeries() {
        return ladingOfBillSeries;
    }

    public void setLadingOfBillSeries(String ladingOfBillSeries) {
        this.ladingOfBillSeries = ladingOfBillSeries;
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

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
