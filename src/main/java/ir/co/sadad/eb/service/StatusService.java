package ir.co.sadad.eb.service;

import ir.co.sadad.eb.domain.Status;
import ir.co.sadad.eb.repository.api.IStatusRepository;
import ir.co.sadad.eb.util.qualifier.TransactionDebugger;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;


@Stateless
@TransactionDebugger
public class StatusService {

    @Inject
    private IStatusRepository statusRepository;

    public Status getStatusByCode(Short statusCode) {
        return statusRepository.findByStatusCode(statusCode);
    }

    public Optional<Status> getStatusByTitle1(String title) {
        return statusRepository.findByTitle1(title);
    }
    public List<Status> findAll() {
        return statusRepository.findAll(0, 0);
    }

    public Status createStatus(Status status){
        return statusRepository.save(status);
    }

    public void deleteStatus(Status status){
        statusRepository.remove(status);
    }

}
