/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.converters;


import com.jms.dacmotos.model.Pessoa;
import com.jms.dacmotos.model.Veiculo;
import com.jms.dacmotos.suport.PessoaSuport;
import com.jms.dacmotos.suport.VeiculoSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Veiculo.class)
public class VeiculoConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Veiculo veiculo = null;

        if (value != null) {
            try {
                Long id = new Long(value);
                System.out.println("Passou no pessoa converter");
                veiculo = (Veiculo) new VeiculoSuport().getPessoaById(id);
            } catch (Exception e) {
            }

        }
        return veiculo;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            Long id = ((Veiculo) value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}
