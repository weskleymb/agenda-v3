package br.senac.rn.agenda.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AgendaDataBase {

    private static AgendaDataBase singleton = new AgendaDataBase();
    private static EntityManager manager;

    private AgendaDataBase() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AgendaPU");
        manager = factory.createEntityManager();
    }

    public static AgendaDataBase getInstance() {
        return singleton;
    }

    public EntityManager getEntityManager() {
        return manager;
    }

}
