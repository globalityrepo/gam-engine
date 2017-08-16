package br.com.globality.gam.engine.web.api.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe de inicialização do projeto.
 */
@ApplicationScoped
public class Producer {

	@Produces
	public Logger getLooger(InjectionPoint injectionPoint) {
		return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	}
	
	@PersistenceUnit(unitName="br.com.globality.gam")
    private EntityManagerFactory factory;
	
	@Produces
	public EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
	// cleaup method
	public void closeEntityManager(@Disposes EntityManager manager) {
        if (manager.isOpen()) {
            manager.close();
        }
    }
	
}
