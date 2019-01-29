package ir.co.sadad.eb.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class LadingOfBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Double payableAmount ;
    //سهم راننده
    private Double driverContribution ;
    //سهم شرکت حمل
    private Double shippingComponyContribution ;
    //راننده اول
    private Driver firstDriver;
    // راننده دوم
    private Driver secondDriver;
    // محموله
    private Cargo cargo;
}
