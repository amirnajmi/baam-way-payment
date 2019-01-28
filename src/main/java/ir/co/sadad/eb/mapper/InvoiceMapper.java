package ir.co.sadad.eb.mapper;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.service.dto.InvoiceDTO;
import org.mapstruct.Mapper;

@Mapper
public interface InvoiceMapper {

    Invoice invoiceDtoToInvoice(InvoiceDTO invoiceDTO);
    InvoiceDTO invoiceToInvoiceDto(Invoice invoice);

}
