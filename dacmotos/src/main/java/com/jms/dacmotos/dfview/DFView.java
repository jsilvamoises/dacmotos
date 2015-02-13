/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.dfview;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Moises
 */
@Named(value = "dFView")
@SessionScoped
public class DFView implements Serializable{

    public DFView() {
    }
    
   public void viewVeiculos(String nome){
       System.err.println("passou aqui");
       RequestContext.getCurrentInstance().openDialog("/restrict/template/"+nome);
   } 
   
   public void viewForm820_400(String nome) {
        Map<String,Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", false);
        options.put("resizable", false);
        options.put("contentHeight", 400);
         options.put("contentWidth", 820);
          
         // options.put("parent", "/template/menu.xhtml");
         System.err.println("passou aqui");
        RequestContext.getCurrentInstance().openDialog("/restrict/"+nome, options, null);
        //RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage("Tu e foda"));
        System.err.println("passou aqui");
    }
}
