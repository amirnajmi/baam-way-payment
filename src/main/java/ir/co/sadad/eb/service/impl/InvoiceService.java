package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.mapper.InvoiceMapper;
import ir.co.sadad.eb.repository.api.InvoiceDetailRepository;
import ir.co.sadad.eb.repository.api.InvoiceRepository;
import ir.co.sadad.eb.service.api.IInvoiceService;
import ir.co.sadad.eb.service.dto.InvoiceDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;
@Stateless
public class InvoiceService extends AbstractGenericService<Invoice,Long> implements IInvoiceService {

    @Inject
    private InvoiceDetailRepository invoiceDetailRepository;
    @Inject
    private InvoiceMapper invoiceMapper;

    public InvoiceService() {
    }

    @Inject
    public InvoiceService(InvoiceRepository genericRepository) {
        super(genericRepository);
    }

    public InvoiceDTO createInvoice(InvoiceDTO invoiceDTO) {
        Invoice invoice = invoiceMapper.invoiceDtoToInvoice(invoiceDTO);
        System.out.println("test");
        return null;
    }

}
