package br.senac.rn.agenda.repository;

import br.senac.rn.agenda.model.Contato;

import javax.persistence.EntityManager;

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

}
