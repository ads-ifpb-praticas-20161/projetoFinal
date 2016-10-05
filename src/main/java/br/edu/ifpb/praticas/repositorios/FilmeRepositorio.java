package br.edu.ifpb.praticas.repositorios;

import br.edu.ifpb.praticas.entidade.Filme;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

/**
 *  Created by diogomoreira on 04/09/16.
 */
public class FilmeRepositorio implements Repositorio<Filme>, Serializable {

    @Inject
    private EntityManager em;

    @Override
    public void salvar(Filme f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
       
    }

    @Override
    public void atualizar(Filme f) {
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();

    }

    @Override
    public void remover(Filme f) {
        em.getTransaction().begin();
        em.remove(f);
        em.getTransaction().commit();
    }

    @Override
    public Filme consultar(Long id) {
        return em.find(Filme.class, id);
    }

    @Override
    public List<Filme> listarTodos() {
        Query q = em.createQuery("SELECT f FROM Filme f");
        return q.getResultList();
    }
}
