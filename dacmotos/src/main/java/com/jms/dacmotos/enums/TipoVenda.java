/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.enums;

/**
 *
 * @author MOISES
 */
public enum TipoVenda {
    
    VENDA_SIMPLES("APENAS PRODUTO"), VENDA_PRODUTO_SERVICO("PRODUTOS E SERVICO"), ORÇAMENTO("ORCAMENTO");
    private final String tipoVenda;
    TipoVenda(String tipoVenda) {
          this.tipoVenda = tipoVenda;
    }

    public  TipoVenda getTipoVenda(String tipoVenda) {
        if (tipoVenda != null) {
            for (TipoVenda e : values()) {
                if (tipoVenda.equalsIgnoreCase(e.name())) {
                    return e;
                }
            }
        }
        return null;
    }
}
