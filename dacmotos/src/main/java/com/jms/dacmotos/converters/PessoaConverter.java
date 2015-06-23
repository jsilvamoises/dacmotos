/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.converters;

import com.jms.dacmotos.beanx.BeanPessoa;
import com.jms.dacmotos.bean.pessoa.CadastroPessoaBean;

import com.jms.dacmotos.model.Pessoa;
import com.jms.dacmotos.suport.PessoaSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Pessoa.class)
public class PessoaConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Pessoa pessoa = null;

        if (value != null) {
            try {
                Long id = new Long(value);
                System.out.println("Passou no pessoa converter");
                pessoa = (Pessoa) new PessoaSuport().getPessoaById(id);
            } catch (Exception e) {
            }

        }
        return pessoa;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            Long id = ((Pessoa) value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}
