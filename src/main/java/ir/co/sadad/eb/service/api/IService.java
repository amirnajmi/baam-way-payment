package ir.co.sadad.eb.service.api;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;

public interface IService<E , Id extends Serializable> {

    List<E> findAll(int var1, int var2);
    List<E> findBy(E var1, SingularAttribute... var2);
    E findById(Id id);
    E findByCode(String code);
    E save(E var1);
    E saveAndFlush(E var1);
    E update(E e);
    void remove(E var1);
    void removeAndFlush(E var1);
    void flush();

}
