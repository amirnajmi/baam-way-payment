package ir.co.sadad.eb.repository.api;

import ir.co.sadad.eb.domain.Invoice;
import org.apache.deltaspike.data.api.Repository;

import java.util.Optional;

@Repository
public interface InvoiceRepository extends IRepository<Invoice,Long> {

    Optional<Invoice> findByInvoiceNumberLike(String invoiceNumber);
}
