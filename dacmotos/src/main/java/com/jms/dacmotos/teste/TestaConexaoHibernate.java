/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.teste;

import javax.inject.Inject;
import org.hibernate.Session;

/**
 *
 * @author Moises
 */
public class TestaConexaoHibernate {
    @Inject
    Session session;
    
    private void Teste(){
        session.getTransaction().begin();
        session.getTransaction().commit();
    }
    public static void main(String[] args) {
        //Session session;// = HibernateUtil.getSessionFactory().getCurrentSession();
        new TestaConexaoHibernate().Teste();
    }
    
}
