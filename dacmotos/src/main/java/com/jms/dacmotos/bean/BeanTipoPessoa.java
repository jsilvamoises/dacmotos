/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.enums.TipoPessoa;
import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author MOISES
 */
@ManagedBean
@ApplicationScoped
public class BeanTipoPessoa implements Serializable{
    private TipoPessoa tpPessoa;
    private TipoPessoa[] tipoPessoa;

    public BeanTipoPessoa() {
    }

    public TipoPessoa[] getTipos() {
        return TipoPessoa.values();
    }

    public TipoPessoa getTpPessoa() {
        return tpPessoa;
    }

    public void setTpPessoa(TipoPessoa tpPessoa) {
        this.tpPessoa = tpPessoa;
    }

    public TipoPessoa[] getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa[] tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

}
