package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.LocalDate;

import java.io.Serializable;

@Schema(name = "InvoiceStatusHistoryDto", description = "تاریخچه وضعیت صورتحساب")
public class InvoiceStatusHistoryDto implements Serializable {
    @Schema(example = "0", description = "کد" )
    private Long id;
    @Schema(required = true , description = "صورتحساب" )
    private InvoiceDto invoice;
    @Schema(required = true , description = "وضعیت صورتحساب" )
    private InvoiceStatusDto invoiceStatus;
    @Schema(required = true ,example = "", description = "توضیحات" )
    private String description;
    @Schema(required = true ,example = "2019-02-15", description = "تاریخ" )
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InvoiceDto getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceDto invoice) {
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
