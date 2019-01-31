package ir.co.sadad.eb.domain;

import org.joda.time.LocalDate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "INVOICE",schema = "PUSH")
public class Invoice {

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
    @ManyToOne(targetEntity = ShippingCompany.class)
    private ShippingCompany shippingCompany;

    @ManyToOne(targetEntity = OwnerCompany.class)
    //شرکت بازرگانی
    private OwnerCompany ownerCompany;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ShippingCompany getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(ShippingCompany shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getProcessKindCode() {
        return processKindCode;
    }

    public void setProcessKindCode(String processKindCode) {
        this.processKindCode = processKindCode;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
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
