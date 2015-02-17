///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.jms.dacmotos.produces;
//
//import javax.enterprise.context.ApplicationScoped;
//import javax.enterprise.context.RequestScoped;
//import javax.enterprise.inject.Disposes;
//import javax.enterprise.inject.Produces;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
///**
// *
// * @author Moises
// */
//@ApplicationScoped
//public class EntityManagerProducer {
//    private final EntityManagerFactory factory;
//    
//    private EntityManagerProducer(){
//        factory = Persistence.createEntityManagerFactory("DACPU");
//    }
//    @Produces @RequestScoped 
//    private EntityManager createEntityManager(){
//        return factory.createEntityManager();
//    }
//    
//    private void closeEntityManager(@Disposes EntityManager manager){
//        System.out.println("Fechando entity manager");
//        manager.close();
//    }
//    
//}
