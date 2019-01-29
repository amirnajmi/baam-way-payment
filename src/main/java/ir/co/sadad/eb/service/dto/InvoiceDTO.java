package ir.co.sadad.eb.service.dto;

import java.io.Serializable;
import java.time.LocalDate;

//todo don't use lombok in dtos

public class InvoiceDTO implements Serializable {


    public InvoiceDTO() {
    }

    //    تاریخ صورتحساب

    private LocalDate invoiceDate;
    //    تاریخ

    private LocalDate date;
    //    شرکت حمل
    private String shippingCompanyCode;
    //    کد نوع فرآیند
    private String processKindCode;
    //    شماره قرارداد
    private String contractNumber;
    //    شماره صورتحساب
    private String invoiceNumber;

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

    public String getShippingCompanyCode() {
        return shippingCompanyCode;
    }

    public void setShippingCompanyCode(String shippingCompanyCode) {
        this.shippingCompanyCode = shippingCompanyCode;
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
}
