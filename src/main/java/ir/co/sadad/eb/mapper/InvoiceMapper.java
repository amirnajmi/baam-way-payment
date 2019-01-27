package ir.co.sadad.eb.mapper;

import fr.xebia.extras.selma.Mapper;
import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.service.dto.InvoiceDTO;


public interface InvoiceMapper {

    Invoice asInvoice(InvoiceDTO invoiceDTO);
    InvoiceDTO asDto(Invoice invoice);

}
