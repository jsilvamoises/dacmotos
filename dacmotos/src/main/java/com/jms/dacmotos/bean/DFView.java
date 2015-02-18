/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class DFView {
    public void showProdutoMarca(){
        System.out.println("ProdutoMarca");
     //   RequestContext.getCurrentInstance().openDialog("/restrict/marcaproduto");
    }
}
