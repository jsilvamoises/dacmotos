/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Moises
 */
@Named(value = "beanTeste")
@SessionScoped
public class BeanTeste implements Serializable{
    private List<String> lista;
    private String valorSelecionado;

    public BeanTeste() {
        lista = new ArrayList<>();
    }
    
    
    public List<String> getLista() {
        lista.clear();
        lista.add("TESTE 1");
        lista.add("TESTE 2");
        lista.add("TESTE 3");
        lista.add("TESTE 4");
        lista.add("TESTE 5");
        System.err.println(lista.size());
        return lista;
    }

    public String getValorSelecionado() {
        return valorSelecionado;
    }

    public void setValorSelecionado(String valorSelecionado) {
        this.valorSelecionado = valorSelecionado;
    }
    
}
