package ir.co.sadad.eb.domain;

import lombok.Data;
import org.joda.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Invoice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //    تاریخ صورتحساب
    private LocalDate invoiceDate;
    //    تاریخ
    private LocalDate date;
    //    شرکت حمل
    private ShippingCompany shippingCompany;
    //    کد نوع فرآیند
    private String processKindCode;
    //    شماره قرارداد
    private String contractNumber;
    //    شماره صورتحساب
    private String invoiceNumber;

}
