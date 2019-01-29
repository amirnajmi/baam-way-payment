package ir.co.sadad.eb.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "INVOICE_DETAIL")
public class InvoiceDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    //  شماره ورود
    @Column(name = "LOAD_CODE")
    private String loadCode;
    //  شماره خروح
    @Column(name = "DEPARTURE_CODE")
    private String departureCode;
    //  نام وسیله حمل کننده اولیه بار(کشتی)
    @Column(name = "SOURCE_VEHICLE_NAME")
    private String sourceVehicleName;
    //  انبار مبدا
    @Column(name = "SOURCE_STORE_HOUSE")
    private String sourceStoreHouse;
    //  انبار مقصد
    @Column(name = "DESTINATION_STORE_HOUSE")
    private String destinationStoreHouse;
    //  کد استان مبدا
    @Column(name = "SOURCE_PROVINCE_CODE")
    private String sourceProvinceCode;
    //  کد استان مقصد
    @Column(name = "DESTINATION_PROVINCE_CODE")
    private String destinationProvinceCode;
    //  عوارض
    @Column(name = "RECEIPT")
    private Double receipt;
    //قبوض
    @Column(name = "BILLS")
    private Double bills;
    //  پلاک یا شماره وسیله نقلیه حامل
//    @Column(name = "VEHICLE_TAG")
//    private String vehicleTag;
    //  شماره بارنامه
    @Column(name = "LANDING_OF_BILL_CODE")
    private String landigOfBillCode;
    //  وزن خروج از مبدا
    @Column(name = "DEPARTURE_WEIGHT")
    private Double departureWeight;
    //  وزن ورود به مقصد
    @Column(name = "LOAD_WEIGHT")
    private Double loadWeight;
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
    @Column(name = "DISTANCE")
    private Double distance ;
    @ManyToOne()
    private Invoice invoice;

}
