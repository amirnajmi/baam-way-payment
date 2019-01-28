package ir.co.sadad.eb.service;


import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.mapper.InvoiceMapper;
import ir.co.sadad.eb.repository.api.IRepository;
import ir.co.sadad.eb.repository.api.InvoiceDetailRepository;
import ir.co.sadad.eb.repository.api.InvoiceRepository;
import ir.co.sadad.eb.service.dto.InvoiceDTO;
import ir.co.sadad.eb.service.impl.AbstractGenericService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class InvoiceService extends AbstractGenericService<Invoice,Long> {

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

    public InvoiceDTO createInvoice(InvoiceDTO invoiceDTO){
        Invoice invoice = invoiceMapper.asInvoice(invoiceDTO);
        System.out.println("test");
        return null;
    }
}
