package br.senac.rn.agenda.repository;

import br.senac.rn.agenda.model.Contato;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ContatoRepository {

    private static EntityManager manager;

    protected static EntityManager getEm() {
        if (manager == null || !manager.isOpen()) {
            manager = AgendaDataBase.getInstance().getEntityManager();
        }
        return manager;
    }

    public void save(Contato contato) {
        getEm().getTransaction().begin();
        getEm().persist(contato);
        getEm().getTransaction().commit();
    }

    public List<Contato> findAll() {
        String jpql = "FROM Contato c";
        TypedQuery<Contato> query = getEm().createQuery(jpql, Contato.class);
        return query.getResultList();
    }

}
