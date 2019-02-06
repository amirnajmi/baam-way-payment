package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.domain.metamodel.Invoice_;
import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.mapper.InvoiceMapper;
import ir.co.sadad.eb.repository.api.InvoiceDetailRepository;
import ir.co.sadad.eb.repository.api.InvoiceRepository;
import ir.co.sadad.eb.service.api.IInvoiceService;
import ir.co.sadad.eb.service.dto.InvoiceDto;
import ir.co.sadad.eb.util.HttpStatusCode;
import org.apache.deltaspike.data.api.criteria.Criteria;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Stateless
public class InvoiceService extends AbstractGenericService<Invoice, Long> implements IInvoiceService {

    @Inject
    private InvoiceDetailRepository invoiceDetailRepository;
    @Inject
    private InvoiceMapper invoiceMapper;

    private InvoiceRepository invoiceRepository;

    public InvoiceService() {
    }

    @Inject
    public InvoiceService(InvoiceRepository genericRepository) {
        super(genericRepository);
        this.invoiceRepository = genericRepository;
    }

    public InvoiceDto createInvoice(InvoiceDto invoiceDTO) {

        return invoiceMapper.invoiceToInvoiceDto(save(invoiceMapper.invoiceDtoToInvoice(invoiceDTO)));

    }

    @Override
    public InvoiceDto findByInvoiceNumber(String invoiceNumber) throws BusinessException {
        Optional<Invoice> invoice = invoiceRepository.findByInvoiceNumber(invoiceNumber);
        if (invoice.isPresent()) {
            return invoiceMapper.invoiceToInvoiceDto(invoice.get());
        }
        throw new BusinessException(HttpStatusCode.BAD_REQUEST, "INVOICE_NOT_FOUND");
    }
    @Override
    public List<InvoiceDto> findByFilters(LocalDate from , LocalDate to) {

        Criteria<Invoice, Invoice> criteria = invoiceRepository.criteria();

        if (from != null) {
            criteria.gtOrEq(Invoice_.invoiceDate, from);
        }
        if (to != null) {
            criteria.ltOrEq(Invoice_.invoiceDate, to);
        }
        return invoiceMapper.invoicesToInvoiceDtos(criteria.getResultList());

    }

}
