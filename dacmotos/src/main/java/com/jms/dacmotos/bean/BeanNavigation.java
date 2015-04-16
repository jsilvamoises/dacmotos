/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Moises
 */
@ManagedBean
@RequestScoped
public class BeanNavigation {

    private static final String URL = "/restrict/";
    private static final String EXT = ".xhtml";
    private static final String GO_ANO_APLICACAO = URL.concat("anoaplicacao".concat(EXT));
    private static final String GO_APLICACAO = URL.concat("aplicacao".concat(EXT));
    private static final String GO_MARCA = URL.concat("veiculomarca".concat(EXT));
    private static final String GO_MODELO = URL.concat("veiculomodelo".concat(EXT));
    private static final String GO_PESSOA = URL.concat("pessoa".concat(EXT));
    private static final String GO_VEICULO = URL.concat("veiculo".concat(EXT));
    private static final String GO_VENDA_PRODUTO_SERVICO = URL.concat("vendaprodutoservico".concat(EXT));

    public  String getGO_VENDA_PRODUTO_SERVICO() {
        return GO_VENDA_PRODUTO_SERVICO;
    }

    public String getGO_VEICULO() {
        return GO_VEICULO;
    }

    public String getGO_PESSOA() {
        return GO_PESSOA;
    }

    public String getGO_MODELO() {
        return GO_MODELO;
    }

    public String getGO_ANO_APLICACAO() {
        return GO_ANO_APLICACAO;
    }

    public String getGO_MARCA() {
        return GO_MARCA;
    }

    public String getGO_APLICACAO() {
        return GO_APLICACAO;
    }

    public String getGO_HOME() {
        return "/index".concat(EXT);
    }

}
