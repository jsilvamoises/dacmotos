/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.teste;



import com.jms.dacmotos.model.Unidade;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Moises
 */
public class TestaDaoGenerico {
    @Inject 
    private EntityManager manager;
    @Inject
    private Unidade unidade;
    
   
    
    
    public void testar(){
        
        
       // PersistenceDao<Unidade> dao = new PersistenceDao(Unidade.class, manager);
       // manager.getTransaction().begin();
        unidade = new Unidade();
        unidade.setSigla("ME");
        unidade.setDescricao("METRON");
       // new UnidadeController().salvar(unidade);
       // manager.getTransaction().commit();
        
    }
    
    public static void main(String[] args) {
        new TestaDaoGenerico().testar();
    }
}
