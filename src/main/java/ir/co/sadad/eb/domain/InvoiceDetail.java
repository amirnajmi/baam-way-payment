package ir.co.sadad.eb.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INVOICE_DETAIL", schema = "PUSH")
public class InvoiceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LADING_OF_BILL_SERIES")
    private String ladingOfBillSeries;

    //  شماره بارنامه
    @Column(name = "LADING_OF_BILL_CODE")
    private String ladingOfBillCode;

    @ManyToOne(targetEntity = Invoice.class)
    private Invoice invoice;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLadingOfBillSeries() {
        return ladingOfBillSeries;
    }

    public void setLadingOfBillSeries(String ladingOfBillSeries) {
        this.ladingOfBillSeries = ladingOfBillSeries;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getLadingOfBillCode() {
        return ladingOfBillCode;
    }

    public void setLadingOfBillCode(String ladingOfBillCode) {
        this.ladingOfBillCode = ladingOfBillCode;
    }


}
