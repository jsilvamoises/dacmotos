/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Moises
 */
@Named
@SessionScoped
public class BenMessages implements  Serializable{
    private static final Long serialVersionUID = 1L;
    private static final String MENSAGEM_RODAPE="DAC MOTOS ASSISTÊNCIA MECÂNICA";
    private static final String TITULO="DAC MOTOS";

    public  String getTITULO() {
        return TITULO;
    }

    public  String getMENSAGEM_RODAPE() {
        return MENSAGEM_RODAPE;
    }
    
}
