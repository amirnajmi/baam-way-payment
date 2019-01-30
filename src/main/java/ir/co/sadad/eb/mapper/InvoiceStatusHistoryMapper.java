package ir.co.sadad.eb.mapper;


import ir.co.sadad.eb.domain.InvoiceStatusHistory;
import ir.co.sadad.eb.service.dto.InvoiceStatusHistoryDto;
import org.mapstruct.Mapper;

@Mapper
public interface InvoiceStatusHistoryMapper {

    InvoiceStatusHistory InvoiceStatusHistoryDtoToInvoiceStatusHistory(InvoiceStatusHistoryDto invoiceStatusHistoryDto);
    InvoiceStatusHistoryDto InvoiceStatusHistoryToInvoiceStatusHistoryDto(InvoiceStatusHistory invoiceStatusHistory);

}
