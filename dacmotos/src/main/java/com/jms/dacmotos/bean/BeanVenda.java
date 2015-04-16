/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.enums.TipoVenda;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author MOISES
 */
@ManagedBean
@ViewScoped
public class BeanVenda {
    private final List<TipoVenda> tipoVenda;

    public BeanVenda() {
        tipoVenda = new ArrayList<>();
    }

    public TipoVenda[] getTipoVenda() {
        return TipoVenda.values();
    }
    
    
}
