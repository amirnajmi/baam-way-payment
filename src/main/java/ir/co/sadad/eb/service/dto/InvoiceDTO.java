package ir.co.sadad.eb.service.dto;

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
    //    شرکت حمل
    private String shippingCompanyCode;
    //    کد نوع فرآیند
    private String processKindCode;
    //    شماره قرارداد
    private String contractNumber;
    //    شماره صورتحساب
    private String invoiceNumber;
    private List<InvoiceDetailDTO> invoiceDetailDTOList;

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

    public List<InvoiceDetailDTO> getInvoiceDetailDTOList() {
        return invoiceDetailDTOList;
    }

    public void setInvoiceDetailDTOList(List<InvoiceDetailDTO> invoiceDetailDTOList) {
        this.invoiceDetailDTOList = invoiceDetailDTOList;
    }
}
