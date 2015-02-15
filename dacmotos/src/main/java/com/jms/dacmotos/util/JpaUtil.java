/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Moises
 */
public class JpaUtil {

    private static final String PERSISTENCE_UNIT = "DACPU";
    private static ThreadLocal<EntityManager> threadLocal = new ThreadLocal<>();
    private static EntityManagerFactory emf;

    public JpaUtil() {
    }

    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }

        EntityManager em = threadLocal.get();

        if (em == null || !em.isOpen()) {
            em = emf.createEntityManager();
            JpaUtil.threadLocal.set(em);
        }

        return em;
    }

    public static void closeEntityManager() {
        EntityManager em = threadLocal.get();

        if (em != null) {
            EntityTransaction transaction = em.getTransaction();
            if (transaction.isActive()) {
                transaction.commit();
            }

            em.close();

            threadLocal.set(null);
        }
    }
    
    public static void closeEntityManagerFactory() {
        closeEntityManager();
        emf.close();
    }
}
