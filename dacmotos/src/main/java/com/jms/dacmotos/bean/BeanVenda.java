/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author MOISES
 */
@ManagedBean
@ViewScoped
public class BeanVenda {
    private String tipoDeOrcamento;
    

    public BeanVenda() {
       
    }

    public String getTipoDeOrcamento() {
        return tipoDeOrcamento;
    }

    public void setTipoDeOrcamento(String tipoDeOrcamento) {
        this.tipoDeOrcamento = tipoDeOrcamento;
    }

    
    
    
    
}
