package ir.co.sadad.eb.domain;

import lombok.Data;
import org.eclipse.microprofile.metrics.annotation.Counted;

import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@Table(name = "LADING_OF_BILL")
public class LadingOfBill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long ladingBillId;


    //تاریخ بارنامه
    @Column(name = "LADING_BILL_DATE")
    private LocalDate ladingBillDate;

    @Column(name = "LADING_BILL_NO")
    //شماره بارنامه
    private String ladingBillNo;

    @Column(name = "LADING_BILL_SERIAL")
    //سریال بارنامه
    private String ladingBillSerial;

    @Column(name = "ORDER_NO")
    //شماره حواله
    private String orderNo;

    @Column(name = "SOURCEP_ROVINCE")
    //استان مبدا
    private String sourceProvince;

    @Column(name = "DESTINATION_PROVINCE")
    //استان مقصد
    private String destinationProvince;

    @Column(name = "SOURCE_CITY")
    //شهر مبدا
    private String sourceCity;

    @Column(name = "DESTINATION_CITY")
    //شهر مقصد
    private String destinationCity;

    @Column(name = "FREIGHT_AMOUNT")
    //مبلغ کرایه
    private Double freightAmount;

    @Column(name = "PAYABLE_AMOUNT")
    //مبلغ قابل پرداخت
    private Double payableAmount;

    @Column(name = "DRIVER_CONTRIBUTION")
    //سهم راننده
    private Double driverContribution;

    @Column(name = "SHIPPING_COMPANY_CONTRIBUTION")
    //سهم شرکت حمل
    private Double shippingCompanyContribution;
   @ManyToMany(cascade = {
           CascadeType.PERSIST,
           CascadeType.MERGE
   })
   @JoinTable(name = "LADING_OF_BILL_DRIVER",
           joinColumns = @JoinColumn(name = "LADING_OF_BILL_ID", referencedColumnName="ID"),
           inverseJoinColumns = @JoinColumn(name = "DRIVER_ID", referencedColumnName="ID")
   )
    private List<Driver> drivers;

   @OneToOne(targetEntity = Cargo.class, fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
   @JoinColumn(name = "CARGO_ID")
    // محموله
    private Cargo cargo;
}
