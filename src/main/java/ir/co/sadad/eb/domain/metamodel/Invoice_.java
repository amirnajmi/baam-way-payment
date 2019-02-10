package ir.co.sadad.eb.domain.metamodel;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.domain.InvoiceDetail;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Invoice.class)
public class Invoice_ {

    public static volatile SingularAttribute<Invoice, LocalDate> invoiceDate;
    public static volatile SingularAttribute<Invoice, String> invoiceNumber;
//    private Long id;
//    private LocalDate invoiceDate;
//    private ShippingCompany shippingCompany;
//    private OwnerCompany ownerCompany;
//    private String contractNumber;
//    private String invoiceNumber;

}
