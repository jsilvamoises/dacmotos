/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.enums.TipoCombustivel;
import com.jms.dacmotos.model.VeiculoCor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author moises
 */
@ManagedBean
@ViewScoped
public class BeanVeiculo implements Serializable{
   private TipoCombustivel[] tipoCombustivel;
   private List<VeiculoCor> cores;
   private BeanVeiculoCor bvc;  

    public BeanVeiculo() {
        cores = new ArrayList<>();
        bvc = new BeanVeiculoCor();
    }

    
   public TipoCombustivel[] getTipos(){
       return TipoCombustivel.values();
   }

    public List<VeiculoCor> getCores() {
        cores = bvc.getCores();
        return cores;
    }
   
    
}
