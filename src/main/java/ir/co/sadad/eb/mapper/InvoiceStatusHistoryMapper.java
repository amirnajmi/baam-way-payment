package ir.co.sadad.eb.mapper;


import ir.co.sadad.eb.domain.InvoiceStatusHistory;
import ir.co.sadad.eb.service.dto.InvoiceStatusHistoryDto;

public interface InvoiceStatusHistoryMapper {

    InvoiceStatusHistory InvoiceStatusHistoryDtoToInvoiceStatusHistory(InvoiceStatusHistoryDto invoiceStatusHistoryDto);
    InvoiceStatusHistoryDto InvoiceStatusHistoryToInvoiceStatusHistoryDto(InvoiceStatusHistory invoiceStatusHistory);

}
