package ir.co.sadad.eb.mapper;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.service.dto.InvoiceDto;
import org.mapstruct.Mapper;

@Mapper
public interface InvoiceMapper {

    Invoice invoiceDtoToInvoice(InvoiceDto invoiceDTO);
    InvoiceDto invoiceToInvoiceDto(Invoice invoice);

}
