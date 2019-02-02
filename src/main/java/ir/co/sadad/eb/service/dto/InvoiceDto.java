package ir.co.sadad.eb.service.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Schema(name = "InvoiceDto", description = "جزئیات صورتحساب")
public class InvoiceDto implements Serializable {


    public InvoiceDto() {
    }
    @Schema(example = "0", description = "شناسه" )
    private Long id;
    @Schema(required = true ,example = "2019-02-15", description = "تاریخ صورتحساب" )
    private LocalDate invoiceDate;
    @Schema(required = true , description = "شرکت حمل" )
    private ShippingCompanyDto shippingCompany;
    @Schema(required = true , description = "شرکت کارفرما" )
    private OwnerCompanyDto ownerCompany;
    @Schema(required = true ,example = "1111", description = "شماره قرارداد" )
    private String contractNumber;
    @Schema(required = true ,example = "0", description = "شماره صورتحساب" )
    private String invoiceNumber;
    @Schema(required = true , description = "جزئیات صورتجساب" )
    private List<InvoiceDetailDto> invoiceDetails;

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

    public List<InvoiceDetailDto> getInvoiceDetails() {
        return invoiceDetails;
    }

    public void setInvoiceDetails(List<InvoiceDetailDto> invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }

    public ShippingCompanyDto getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(ShippingCompanyDto shippingCompany) {
        this.shippingCompany = shippingCompany;
    }
}
