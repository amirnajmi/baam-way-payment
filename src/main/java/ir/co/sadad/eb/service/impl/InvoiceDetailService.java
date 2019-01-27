package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.InvoiceDetail;
import ir.co.sadad.eb.repository.api.IRepository;
import ir.co.sadad.eb.repository.api.InvoiceDetailRepository;
import ir.co.sadad.eb.service.dto.InvoiceDetailDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class InvoiceDetailService extends AbstractGenericService<InvoiceDetail,Long> {

    @Inject
    public InvoiceDetailService(InvoiceDetailRepository genericRepository) {
        super(genericRepository);
    }

    public InvoiceDetailService() {

    }

    public void createInvoiceDetail(InvoiceDetailDTO invoiceDetailDTO){

    }

}
