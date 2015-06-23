/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.converters;

import com.jms.dacmotos.beanx.BeanMarca;
import com.jms.dacmotos.model.Marca;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;
import javax.faces.view.facelets.Tag;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Marca.class)
public class MarcaConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Marca marca = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new BeanMarca().getMarcaById(id);
        }
        return marca;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null && !value.equals("")){
            Long id = ((Marca)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}
