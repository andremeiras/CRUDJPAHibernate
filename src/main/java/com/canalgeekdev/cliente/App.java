package com.canalgeekdev.cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.canalgeekdev.cliente.model.Cliente;

public class App 
{

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main( String[] args )
    {
        // FIND
        /*
         Cliente clienteFind = entityManager.find(Cliente.class, 1);
         System.out.println("Cliente: " + clienteFind.getNome()); 
         */

        // INSERT 
        /*
        Cliente clienteInsert = new Cliente();
        clienteInsert.setNome("FACEBOOK");
        */
        
        // para o INSERT é necessário criar uma transação
        /*
        entityManager.getTransaction().begin();
        entityManager.persist(clienteInsert);
        entityManager.getTransaction().commit();
        */

        // DELETE
        /*
        Cliente clienteDelete = entityManager.find(Cliente.class, 2);
        entityManager.getTransaction().begin();
        entityManager.remove(clienteDelete);
        entityManager.getTransaction().commit();
        */

        // MODIFY
        Cliente clienteModify = new Cliente();
        clienteModify.setId(1);
        clienteModify.setNome("TWITTER");
        entityManager.getTransaction().begin();
        entityManager.merge(clienteModify);
        entityManager.getTransaction().commit();
    }
}
