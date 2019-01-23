package ir.co.sadad.eb.service;

import ir.co.sadad.eb.repository.AbstractGenericRepository;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;


public abstract class AbstractGenericService<T, Id extends Serializable> {

//    @Inject
//    private EntityManager entityManager;
//    private AbstractGenericRepository<T, Id> genericRepository;
//
//    public AbstractGenericService(AbstractGenericRepository<T, Id> genericRepository) {
//        this.genericRepository = genericRepository;
//    }
//
//    public T findById(Id id) {
//        return genericRepository.findBy(id);
//    }
//
//    public List<T> findAll(){
//        return genericRepository.findAll();
//    }
//
//    public T update(T t){
//        return genericRepository.merge(t);
//    }

}
