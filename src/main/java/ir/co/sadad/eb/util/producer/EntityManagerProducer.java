package ir.co.sadad.eb.util.producer;

import org.apache.deltaspike.jpa.api.transaction.TransactionScoped;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * Producer for injectable EntityManager
 *
 */

public class EntityManagerProducer {

    @PersistenceUnit(unitName = "BAAMWAY_PU")
    private EntityManagerFactory entityManagerFactory;

    @Produces
    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
    public void close(@Disposes EntityManager em)
    {
        if (em.isOpen())
        {
            em.close();
        }
    }
}
