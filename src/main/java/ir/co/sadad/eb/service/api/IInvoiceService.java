package ir.co.sadad.eb.service.api;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.service.dto.InvoiceDto;

import java.time.LocalDate;
import java.util.List;

public interface IInvoiceService {

    InvoiceDto createInvoice(InvoiceDto invoiceDTO);

    InvoiceDto findByInvoiceNumber(String invoiceNumber) throws BusinessException;
    List<InvoiceDto> findByFilters(LocalDate fromDate , LocalDate toDate,String shippingCompanyLegalCode , String invoiceStatusCode);
}
