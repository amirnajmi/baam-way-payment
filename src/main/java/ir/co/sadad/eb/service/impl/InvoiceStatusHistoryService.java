package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.domain.InvoiceStatusHistory;
import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.mapper.InvoiceStatusHistoryMapper;
import ir.co.sadad.eb.repository.api.InvoiceStatusHistoryRepository;
import ir.co.sadad.eb.service.api.IInvoiceService;
import ir.co.sadad.eb.service.api.IInvoiceStatusHistoryService;
import ir.co.sadad.eb.service.dto.InvoiceDto;
import ir.co.sadad.eb.service.dto.InvoiceStatusHistoryDto;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import ir.co.sadad.eb.util.HttpStatusCode;

import javax.inject.Inject;

public class InvoiceStatusHistoryService extends AbstractGenericService<InvoiceStatusHistory, Long> implements IInvoiceStatusHistoryService {

    @Inject
    private InvoiceStatusHistoryMapper invoiceStatusHistoryMapper;

    @Inject
    private IInvoiceService iInvoiceService;

    @Inject
    public InvoiceStatusHistoryService(InvoiceStatusHistoryRepository genericRepository) {
        super(genericRepository);
    }

    public InvoiceStatusHistoryService() {
    }

    public InvoiceStatusHistoryDto createInvoiceStatusHistory(InvoiceStatusHistoryDto invoiceStatusHistoryDto ) throws BusinessException {
        if(invoiceStatusHistoryDto.getInvoice().getInvoiceNumber() == null || invoiceStatusHistoryDto.getInvoice().getInvoiceNumber().isEmpty()){
            throw new BusinessException(HttpStatusCode.BAD_REQUEST, "INVOICE_NUMBER_IS_EMPTY");
        }
        if(invoiceStatusHistoryDto.getInvoiceStatus() == null ){
            throw new BusinessException(HttpStatusCode.BAD_REQUEST, "INVOICE_STATUS_IS_EMPTY");
        }
        InvoiceDto invoiceDto = iInvoiceService.findByInvoiceNumber(invoiceStatusHistoryDto.getInvoice().getInvoiceNumber());
        invoiceStatusHistoryDto.setInvoice(invoiceDto);
        InvoiceStatusHistory invoiceStatusHistory = invoiceStatusHistoryMapper.InvoiceStatusHistoryDtoToInvoiceStatusHistory(invoiceStatusHistoryDto);
        return invoiceStatusHistoryMapper.InvoiceStatusHistoryToInvoiceStatusHistoryDto(save(invoiceStatusHistory));
    }
}
