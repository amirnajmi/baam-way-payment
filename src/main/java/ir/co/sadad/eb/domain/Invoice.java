package ir.co.sadad.eb.domain;

import lombok.Data;
import org.joda.time.LocalDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "INVOICE")
public class Invoice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    // تاریخ صورتحساب
    @Column(name = "INVOICE_DATE")
    private LocalDate invoiceDate;
    // تاریخ
    @Column(name = "DATE")
    private LocalDate date;
    // شرکت حمل
    @Column(name = "SHIPPING_COMPANY")
    private ShippingCompany shippingCompany;
    // کد نوع فرآیند
    @Column(name = "PROCESS_KIND_CODE")
    private String processKindCode;
    // شماره قرارداد
    @Column(name = "CONTRACT_NUMBER")
    private String contractNumber;
    // شماره صورتحساب
    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;
    // لاین های صورتحساب
    @OneToMany(targetEntity = InvoiceDetail.class , mappedBy = "invoice" , cascade = {CascadeType.REMOVE,CascadeType.PERSIST},fetch = FetchType.LAZY)
    private List<InvoiceDetail> invoiceDetails;

}
