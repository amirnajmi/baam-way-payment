package ir.co.sadad.eb.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "LADING_OF_BILL", schema = "PUSH")
public class LadingOfBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    //تاریخ بارنامه
    @Column(name = "LADING_BILL_DATE")
    private LocalDate date;
    //شماره بارنامه
    @Column(name = "LADING_BILL_NO")
    private String no;
    //سریال بارنامه
    @Column(name = "LADING_BILL_SERIAL")
    private String serial;
    //شماره حواله
    @Column(name = "ORDER_NO")
    private String orderNo;
    //استان مبدا
    @Column(name = "SOURCEP_ROVINCE")
    private String sourceProvince;
    //استان مقصد
    @Column(name = "DESTINATION_PROVINCE")
    private String destinationProvince;
    //شهر مبدا
    @Column(name = "SOURCE_CITY")
    private String sourceCity;
    //شهر مقصد
    @Column(name = "DESTINATION_CITY")
    private String destinationCity;
    //نام وسیله حمل کننده اولیه بار(کشتی)
    @Column(name = "SOURCE_VEHICLE_NAME")
    private String sourceVehicleName;
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
    private Double receipt;
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
    private Double managerSalary;
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
    // مسافت
    @Column(name = "DISTANCE")
    private Double distance;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "LADING_OF_BILL_DRIVER",
            joinColumns = @JoinColumn(name = "LADING_OF_BILL_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "DRIVER_ID", referencedColumnName = "ID")
    )
    private List<Driver> drivers;

    @OneToOne(targetEntity = Cargo.class, fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CARGO_ID")
    // محموله
    private Cargo cargo;

    @ManyToOne(targetEntity = Vehicle.class)
    @JoinColumn(name = "VEHICLE_ID", referencedColumnName = "ID")
    private Vehicle vehicle;
}
