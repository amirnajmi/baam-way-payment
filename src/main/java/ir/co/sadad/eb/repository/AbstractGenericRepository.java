package ir.co.sadad.eb.repository;

import ir.co.sadad.eb.repository.api.IRepository;
import org.apache.deltaspike.data.api.FullEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;

import java.io.Serializable;


public abstract class AbstractGenericRepository<E, ID extends Serializable> implements IRepository<E,ID>{

    private final Class<E> entityClass;

    public AbstractGenericRepository(Class<E> entityClass) {
        this.entityClass = entityClass;
    }


}
