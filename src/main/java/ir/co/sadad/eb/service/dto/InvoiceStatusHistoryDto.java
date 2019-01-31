package ir.co.sadad.eb.service.dto;



import java.io.Serializable;
import java.time.LocalDate;

public class InvoiceStatusHistoryDto implements Serializable {
    private Long id;
    private InvoiceDTO invoice;
    private InvoiceStatusDto invoiceStatus;
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

    public InvoiceStatusDto getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatusDto invoiceStatus) {
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
