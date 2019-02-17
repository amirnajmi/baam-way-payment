package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.repository.api.IRepository;
import ir.co.sadad.eb.service.api.IService;
import org.apache.deltaspike.data.api.criteria.Criteria;

import javax.persistence.criteria.JoinType;
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

    @Override
    public E findById(Id id) {
        return repository.findBy(id);
    }
    @Override
    public List<E> findAll(int pageNumber , int objectsNumberPerPage){
        return repository.findAll(pageNumber,objectsNumberPerPage);
    }
    @Override
    public List<E> findBy(E var1, SingularAttribute... var2){
        return repository.findBy(var1 , var2);
    }
    @Override
    public E update(E e){
        return repository.merge(e);
    }
    @Override
    public E save(E entity){
        return repository.save(entity);
    }
    @Override
    public E saveAndFlush(E entity){
        return repository.saveAndFlush(entity);
    }
    @Override
    public void remove(E entity){
        repository.remove(entity);
    }
    @Override
    public void removeAndFlush(E entity){
        repository.removeAndFlush(entity);
    }
    @Override
    public void flush(){
        repository.flush();
    }
    @Override
    public <T> Criteria<T, T> where(Class<T> aclass){
       return repository.where(aclass);
    }
    @Override
    public <T> Criteria<T, T> where(Class<T> aclass , JoinType joinType){
        return repository.where(aclass , joinType);
    }
    @Override
    public E findByCode(String code) {
        return null;
    }

    @Override
    public Criteria<E, E> criteria() {
        return repository.criteria();
    }
}
