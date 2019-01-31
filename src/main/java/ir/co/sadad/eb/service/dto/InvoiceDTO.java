package ir.co.sadad.eb.service.dto;

import ir.co.sadad.eb.domain.OwnerCompany;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

//todo don't use lombok in dtos

public class InvoiceDTO implements Serializable {


    public InvoiceDTO() {
    }
    private Long id;
    //    تاریخ صورتحساب
    private LocalDate invoiceDate;
    // تاریخ
    private LocalDate date;
    //شرکت حمل
    private ShippingCompanyDto shippingCompany;
    // شرکت کارفرما
    private OwnerCompanyDto ownerCompany;
    //    شماره قرارداد
    private String contractNumber;
    //    شماره صورتحساب
    private String invoiceNumber;
    private List<InvoiceDetailDTO> invoiceDetails;

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

    public OwnerCompanyDto getOwnerCompany() {
        return ownerCompany;
    }

    public void setOwnerCompany(OwnerCompanyDto ownerCompany) {
        this.ownerCompany = ownerCompany;
    }

    public List<InvoiceDetailDTO> getInvoiceDetails() {
        return invoiceDetails;
    }

    public void setInvoiceDetails(List<InvoiceDetailDTO> invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ShippingCompanyDto getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(ShippingCompanyDto shippingCompany) {
        this.shippingCompany = shippingCompany;
    }
}
