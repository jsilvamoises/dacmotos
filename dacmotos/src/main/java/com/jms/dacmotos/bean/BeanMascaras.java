/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;



/**
 *
 * @author MOISES
 */
@ManagedBean
@ApplicationScoped
public class BeanMascaras implements Serializable {
    private String mascaraCelNoveDigitos;
    private String mascaraCelOitoDigitos;
    private String mascaraTel;

    public String getMascaraCelNoveDigitos() {
        return "(99) 9.9999-9999";
    }

    public String getMascaraCelOitoDigitos() {
        return "(99) 9999-9999";
    }

    public String getMascaraTel() {
        return "(99) 9999-9999";
    }

  
}
