/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.converters;

import com.jms.dacmotos.beanx.BeanAnoAplicacao;
import com.jms.dacmotos.beanx.BeanVeiculoCor;

import com.jms.dacmotos.model.Aplicacao;
import com.jms.dacmotos.model.VeiculoCor;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = VeiculoCor.class)
public class VeiculoCorConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        VeiculoCor veiculoCor = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new BeanVeiculoCor().getObjectById(id);
        }
        return veiculoCor;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((VeiculoCor)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}
