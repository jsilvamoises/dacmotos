/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class BeanBanner implements Serializable{
    private static final Long serialVersionUID=1L;
    
    public String getBanner(){
        return "banner_04.jpg";
    }
    
}
