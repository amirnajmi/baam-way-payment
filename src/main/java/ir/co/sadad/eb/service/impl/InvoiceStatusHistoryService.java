package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.InvoiceStatusHistory;
import ir.co.sadad.eb.mapper.InvoiceStatusHistoryMapper;
import ir.co.sadad.eb.repository.api.InvoiceStatusHistoryRepository;
import ir.co.sadad.eb.service.api.IInvoiceStatusHistoryService;
import ir.co.sadad.eb.service.dto.InvoiceStatusHistoryDto;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;

import javax.inject.Inject;

public class InvoiceStatusHistoryService extends AbstractGenericService<InvoiceStatusHistory, Long> implements IInvoiceStatusHistoryService {

    @Inject
    private InvoiceStatusHistoryMapper invoiceStatusHistoryMapper;

    @Inject
    public InvoiceStatusHistoryService(InvoiceStatusHistoryRepository genericRepository) {
        super(genericRepository);
    }

    public InvoiceStatusHistoryService() {
    }

    public InvoiceStatusHistoryDto createInvoiceStatusHistory(InvoiceStatusHistoryDto invoiceStatusHistoryDto ){
        InvoiceStatusHistory invoiceStatusHistory = invoiceStatusHistoryMapper.InvoiceStatusHistoryDtoToInvoiceStatusHistory(invoiceStatusHistoryDto);
        return invoiceStatusHistoryMapper.InvoiceStatusHistoryToInvoiceStatusHistoryDto(save(invoiceStatusHistory));
    }
}
