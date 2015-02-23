/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.converters;

import com.jms.dacmotos.bean.BeanModelo;
import com.jms.dacmotos.model.Modelo;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Modelo.class)
public class ModeloConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Modelo modelo = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new BeanModelo().getModeloById(id);
        }
        return modelo;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
       if(value!= null){
           Long id = ((Modelo)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}
