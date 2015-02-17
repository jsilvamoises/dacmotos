/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.produces;

import com.jms.dacmotos.util.HibernateUtil;
import javax.enterprise.inject.Produces;
import org.hibernate.Session;

/**
 *
 * @author Moises
 */
public class HibernateSessionProdutor {
    @Produces
    private Session getSession(){
        return HibernateUtil.getSessionFactory().getCurrentSession();
    }
}
