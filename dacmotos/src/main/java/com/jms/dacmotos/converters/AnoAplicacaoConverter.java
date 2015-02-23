/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.converters;

import com.jms.dacmotos.bean.BeanAnoAplicacao;
import com.jms.dacmotos.model.AnoAplicacao;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = AnoAplicacao.class)
public class AnoAplicacaoConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        AnoAplicacao anoAplicacao = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new BeanAnoAplicacao().getAnoAplicacaoById(id);
        }
        return anoAplicacao;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((AnoAplicacao)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}
