/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import org.hibernate.Session;

/**
 *
 * @author Moises
 */
public class PhaseListener implements javax.faces.event.PhaseListener {

    //Antes da fase

    @Override
    public void beforePhase(PhaseEvent event) {
        System.out.println("Antes da fase "+ getPhaseId().getName());
        if (event.getPhaseId().equals(PhaseId.RESTORE_VIEW)) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            FacesContextUtil.setRequestSession(session);
        }
        
    }

    //depois da fase
    @Override
    public void afterPhase(PhaseEvent event) {
        System.out.println("Depois da fase "+ getPhaseId().getName());
        if (event.getPhaseId().equals(PhaseId.RENDER_RESPONSE)) {
            Session session = FacesContextUtil.getRequestSession();
            try {
                session.getTransaction().commit();
            } catch (Exception e) {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            }finally{
                if( session.isOpen()){
                    session.close();
                }
                
            }
        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

}
