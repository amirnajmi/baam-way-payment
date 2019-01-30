package ir.co.sadad.eb.repository.api;

import ir.co.sadad.eb.domain.Account;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface AccountRepository extends IRepository<Account ,Long> {
}
