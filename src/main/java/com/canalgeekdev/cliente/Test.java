package com.canalgeekdev.cliente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {

        entityManager.getTransaction().begin();

        int idCliente = 4;

        entityManager.createQuery("delete from Cliente c where id = :idCliente").setParameter("idCliente", idCliente)
                .executeUpdate();

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
