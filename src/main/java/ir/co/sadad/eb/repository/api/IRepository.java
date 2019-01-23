package ir.co.sadad.eb.repository.api;

import org.apache.deltaspike.data.api.FullEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;

import java.io.Serializable;

public interface IRepository<T,Id extends Serializable> extends FullEntityRepository<T,Id>  {
}
