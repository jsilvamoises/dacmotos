/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.suport;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Aplicacao;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Moises
 */
public class AplicacaoSuport {

    private InterfaceDao<Aplicacao> Dao() {
        InterfaceDao<Aplicacao> dao = new Dao<>(Aplicacao.class);
        return dao;
    }

    public boolean validaAplicacaoSalvar(Aplicacao aplicacao) {
        Session session = Dao().getSession();
        try {
            System.out.println("Passou aqui");
            Dao().begin(session);
            Query query = session.createQuery("SELECT A FROM Aplicacao A WHERE A.modelo =:MODELO AND A.anoAplicacao =:ANO");
            query.setParameter("MODELO", aplicacao.getModelo());
            query.setParameter("ANO", aplicacao.getAnoAplicacao());
            if (query.list().size() > 0) {
                 System.out.println("Passou aqui 2");
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        } finally {
             System.out.println("Passou aqui 3");
            Dao().commit(session);
        }

    }
}
