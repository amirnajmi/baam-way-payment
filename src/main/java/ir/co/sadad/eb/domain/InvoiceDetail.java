package ir.co.sadad.eb.domain;

import javax.persistence.*;


@Entity
@Table(name = "INVOICE_DETAIL", schema = "PUSH")
public class InvoiceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    //کد پیگیری بارنامه
    @Column(name = "TRACKING_CODE")
    private String trackingCode;

    @ManyToOne(targetEntity = Invoice.class)
    private Invoice invoice;
    //
    @Column(name = "FINAL_AMOUNT")
    private Double finalAmount;

    @OneToOne(targetEntity = FinancialAmounts.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FINANCIAL_AMOUNTS_ID")
    private FinancialAmounts financialAmounts;

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

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public FinancialAmounts getFinancialAmounts() {
        return financialAmounts;
    }

    public void setFinancialAmounts(FinancialAmounts financialAmounts) {
        this.financialAmounts = financialAmounts;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }
}
