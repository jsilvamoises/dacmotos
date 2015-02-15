/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.teste;

import com.jms.dacmotos.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Moises
 */
public class TestaConexaoHibernate {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();
        session.getTransaction().commit();
    }
    
}
