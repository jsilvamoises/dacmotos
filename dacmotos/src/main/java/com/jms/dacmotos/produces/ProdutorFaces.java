/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.produces;

import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

/**
 *
 * @author Moises
 */
public class ProdutorFaces {
    @Produces
    private final FacesContext context = FacesContext.getCurrentInstance();
}
