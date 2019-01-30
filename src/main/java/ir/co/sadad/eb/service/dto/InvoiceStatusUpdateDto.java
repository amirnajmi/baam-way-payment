package ir.co.sadad.eb.service.dto;

import java.io.Serializable;

public class InvoiceStatusUpdateDto implements Serializable {
    //    شماره حقوقی
    private String legalNo;
    //    شماره صورتحساب
    private String invoiceNumber;
    //     وضعیت
    private Integer invoiceStatus;

    public String getLegalNo() {
        return legalNo;
    }

    public void setLegalNo(String legalNo) {
        this.legalNo = legalNo;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
}
