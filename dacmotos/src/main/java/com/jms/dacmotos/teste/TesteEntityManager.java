/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Moises
 */
public class TesteEntityManager {
    private static  EntityManagerFactory factory = Persistence.createEntityManagerFactory("DACPU");
     public static void main(String[] args) {
         EntityManager manager = factory.createEntityManager();
         manager.getTransaction().begin();
         Query q = manager.createQuery("SELECT F  FROM Usuario F");
         Query q2 = manager.createQuery("SELECT F FROM  UsuarioAcesso F");
         q2.getResultList();
         manager.getTransaction().commit();
         manager.close();
         
         System.exit(0);
         
        
    }
    
}
