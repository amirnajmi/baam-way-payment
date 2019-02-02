package ir.co.sadad.eb.service.api;

import ir.co.sadad.eb.domain.InvoiceStatusHistory;
import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.service.dto.InvoiceStatusHistoryDto;

public interface IInvoiceStatusHistoryService extends IService<InvoiceStatusHistory, Long>{

    InvoiceStatusHistoryDto createInvoiceStatusHistory(InvoiceStatusHistoryDto invoiceStatusHistoryDto) throws BusinessException;


}
