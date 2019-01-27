package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.repository.api.IRepository;
import ir.co.sadad.eb.service.api.IService;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;


public abstract class AbstractGenericService<E, Id extends Serializable> implements IService<E,Id> {

    private IRepository<E,Id> repository;

    public AbstractGenericService(IRepository<E ,Id> genericRepository){
        this.repository = genericRepository;
    }

    public AbstractGenericService() {
    }

    public E findById(Id id) {
        return repository.findBy(id);
    }
    public List<E> findAll(int pageNumber , int objectsNumberPerPage){
        return repository.findAll(pageNumber,objectsNumberPerPage);
    }
    public List<E> findBy(E var1, SingularAttribute... var2){
        return repository.findBy(var1 , var2);
    }
    public E update(E e){
        return repository.merge(e);
    }
    public E save(E entity){
        return repository.save(entity);
    }
    public E saveAndFlush(E entity){
        return repository.saveAndFlush(entity);
    }
    public void remove(E entity){
        repository.remove(entity);
    }
    public void removeAndFlush(E entity){
        repository.removeAndFlush(entity);
    }
    public void flush(){
        repository.flush();
    }

    @Override
    public E findByCode(String code) {
        return null;
    }

}
