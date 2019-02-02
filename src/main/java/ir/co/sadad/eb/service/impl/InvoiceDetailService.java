package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.InvoiceDetail;
import ir.co.sadad.eb.repository.api.InvoiceDetailRepository;
import ir.co.sadad.eb.service.api.IInvoiceDetailService;
import ir.co.sadad.eb.service.dto.InvoiceDetailDto;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class InvoiceDetailService extends AbstractGenericService<InvoiceDetail,Long> implements IInvoiceDetailService {

    private InvoiceDetailRepository invoiceDetailRepository;

    @Inject
    public InvoiceDetailService(InvoiceDetailRepository genericRepository) {
        super(genericRepository);
        this.invoiceDetailRepository=genericRepository;
    }

    public InvoiceDetailService() {

    }

    public void createInvoiceDetail(InvoiceDetailDto invoiceDetailDTO){
        save(new InvoiceDetail());

    }

}
