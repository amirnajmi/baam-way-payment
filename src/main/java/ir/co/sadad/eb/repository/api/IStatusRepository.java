package ir.co.sadad.eb.repository.api;

import ir.co.sadad.eb.domain.Status;
import ir.co.sadad.eb.domain.metamodel.Status_;
import ir.co.sadad.eb.util.qualifier.TransactionDebugger;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.QueryParam;
import org.apache.deltaspike.data.api.Repository;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import java.util.Optional;

@Repository(forEntity = Status.class)
public interface IStatusRepository extends IRepository<Status,Short> {


    Optional<Status> findByTitle(String title);

    @Query(named = "Status.findByTitle")
    Optional<Status> findByTitle1(@QueryParam("title") String title);

//    default Status findByCriteria(String title){
//        return criteria()
//                .like(Status_.title,"%"+title+"%")
//                .getOptionalResult();
//    }
    default Status findByStatusCode(Short statusCode){
        return criteria()
                .eq(Status_.statusCode,statusCode)
                .getOptionalResult();
    }
}
