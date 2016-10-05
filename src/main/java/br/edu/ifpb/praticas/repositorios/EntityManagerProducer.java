package br.edu.ifpb.praticas.repositorios;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by diogomoreira on 15/08/16.
 */
public class EntityManagerProducer {

    @Produces
    @ApplicationScoped
    public EntityManagerFactory createEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("manager");
    }

    @Produces
    @RequestScoped
    public EntityManager createEntityManager(EntityManagerFactory emf) {
        return emf.createEntityManager();
    }

}
