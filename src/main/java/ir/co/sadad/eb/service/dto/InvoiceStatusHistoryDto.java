package ir.co.sadad.eb.service.dto;

import org.joda.time.LocalDate;

import java.io.Serializable;

public class InvoiceStatusHistoryDto implements Serializable {
    private Long id;
    private InvoiceDTO invoice;
    private InvoiceStatusHistoryDto invoiceStatus;
    private String description;
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InvoiceDTO getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceDTO invoice) {
        this.invoice = invoice;
    }

    public InvoiceStatusHistoryDto getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatusHistoryDto invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
