package ir.co.sadad.eb.repository.api;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.domain.metamodel.Invoice_;
import ir.co.sadad.eb.service.dto.InvoiceDto;
import org.apache.deltaspike.data.api.Repository;
import org.apache.deltaspike.data.api.criteria.Criteria;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface InvoiceRepository extends IRepository<Invoice,Long> {

    Optional<Invoice> findByInvoiceNumber(String invoiceNumber);

    Optional<Invoice> findByDateBetweenFromDateAndToDate(LocalDate fromDate , LocalDate toDate);


    default List<Invoice> findByFilters(LocalDate from , LocalDate to) {

        Criteria<Invoice, Invoice> criteria = criteria();

        if (from != null) {
            criteria.like(Invoice_.invoiceNumber, "66");
        }
//        if (to != null) {
//            criteria.ltOrEq(Invoice_.invoiceDate, to);
//        }
        return criteria.getResultList();

    }


}
