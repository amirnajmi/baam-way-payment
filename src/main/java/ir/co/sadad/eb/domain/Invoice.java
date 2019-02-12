package ir.co.sadad.eb.domain;

import java.time.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "INVOICE",schema = "BAMWAY")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    // تاریخ صورتحساب
    @Column(name = "INVOICE_DATE")
    private LocalDate invoiceDate;
    // شرکت حمل
    @ManyToOne(targetEntity = ShippingCompany.class , cascade = CascadeType.PERSIST)
    private ShippingCompany shippingCompany;

    @ManyToOne(targetEntity = OwnerCompany.class , cascade = CascadeType.PERSIST)
    //شرکت بازرگانی
    private OwnerCompany ownerCompany;
    // شماره صورتحساب
    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;

    // لاین های صورتحساب
    @OneToMany(targetEntity = InvoiceDetail.class , mappedBy = "invoice" , cascade = {CascadeType.REMOVE,CascadeType.PERSIST},fetch = FetchType.LAZY)
    private List<InvoiceDetail> invoiceDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public ShippingCompany getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(ShippingCompany shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public OwnerCompany getOwnerCompany() {
        return ownerCompany;
    }

    public void setOwnerCompany(OwnerCompany ownerCompany) {
        this.ownerCompany = ownerCompany;
    }

    public List<InvoiceDetail> getInvoiceDetails() {
        return invoiceDetails;
    }

    public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }


}
