package ir.co.sadad.eb.repository.api;

import ir.co.sadad.eb.domain.Invoice;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface InvoiceRepository extends IRepository<Invoice,Long> {
}
