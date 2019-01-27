package ir.co.sadad.eb.repository.api;

import org.apache.deltaspike.data.api.FullEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Optional;

public interface IRepository<E,Id extends Serializable> extends FullEntityRepository<E,Id>  {
}
