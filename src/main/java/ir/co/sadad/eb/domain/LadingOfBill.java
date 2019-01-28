package ir.co.sadad.eb.domain;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class LadingOfBill {

    private int ladingBillId;

    private LocalDate ladingBillDate;
    private String ladingBillNo;
    private String ladingBillSerial;
    //شماره حواله
    private String orderNo;
    //استان مبدا
    private String sourceProvince;
    //استان مقصد
    private String destinationProvince;
    private String sourceCity;
    private String destinationCity;
    //مبلغ کرایه
    private Double freightAmount;
    //مبلغ قابل پرداخت
    private Double payableAmount ;

//    driverContribution  سهم راننده
//    shippingComponyContribution   سهم شرکت حمل

}
