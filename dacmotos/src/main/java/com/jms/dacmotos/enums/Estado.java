/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.enums;

import java.util.List;

/**
 *
 * @author Moises
 */

public enum Estado {
        ACRE("ACRE"), 
        ALAGOAS("ALAGOAS"), 
        AMAPA("AMAPA"),
        AMAZONAS("AMAZONAS"), 
        BAHIA("BAHIA"), 
        CEARA("CEARA"), 
        DISTRITO_FEDERAL("DISTRITO FEDERAL"),
        ESPIRITO_SANTO("ESPIRITO SANTO"), 
        GOIAS("GOIAS"), MARANHAO("MARANHAO"), 
        MATO_GROSSO("MATO GROSSO"),
        MATO_GROSSO_DO_SUL("MATO GROSSO DO SUL"), 
        MINAS_GERAIS("MINAS GERAIS"),
        PARA("PARA"), PARAIBA("PARAIBA"), 
        PARANA("PARANA"), 
        PERNAMBUCO("PERNAMBUCO"), 
        PIAUI("PIAUI"),
        RIO_DE_JANEIRO("RIO DE JANEIRO"), 
        RIO_GRANDE_DO_NORTE("RIO GRANDE DO NORTE"),
        RIO_GRANDE_DO_SUL("RIO GRANDE DO SUL"), 
        RONDONIA("RONDONIA"), RORAIMA("RORAIMA"),
        SANTA_CATARINA("SANTA CATARINA"), 
        SAO_PAULO("SAO PAULO"), 
        SERGIPE("SERGIPE"), 
        TOCANTINS("TOCANTINS");

               
        Estado(String nome) {
               
        }
        
        
        


        public static Estado getEstado(String estado) {
                if (estado != null) {
                        for (Estado e : values()) {
                                if (estado.equalsIgnoreCase(e.name()))
                                        return e;
                        }
                }
                return null;
        }
}

