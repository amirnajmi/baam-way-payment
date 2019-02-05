package ir.co.sadad.eb.repository.api;

import ir.co.sadad.eb.domain.LadingOfBill;
import org.apache.deltaspike.data.api.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LadingOfBillRepository extends IRepository<LadingOfBill, Long>{

    Optional<LadingOfBill> findByTrackingCode(Long trackingCode);
}
