/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.beanx;

import com.jms.dacmotos.enums.TipoCombustivel;
import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author MOISES
 */
@ManagedBean
@ApplicationScoped
public class BeanTipoCombustivel implements Serializable{

    private TipoCombustivel[] tipoCombustivel;

    public BeanTipoCombustivel() {
    }

    public TipoCombustivel[] getTipos() {
        return TipoCombustivel.values();
    }

}
