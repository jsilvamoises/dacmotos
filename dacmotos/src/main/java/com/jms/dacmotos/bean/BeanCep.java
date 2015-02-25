/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.model.Endereco;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class BeanCep implements Serializable{
    private static final Long serialVersionUID=1L;
    private String valor;
    private Endereco endereco;
     private Document doc;
    public BeanCep() {
        endereco = new Endereco();
    }
    
    public Endereco getObjetoEndereco(){
        return endereco;
    }
    
    public void buscarEndereco(String cep) {

        //***************************************************
        try {
            doc = Jsoup.connect("http://www.qualocep.com/busca-cep/" + cep.replace(".", "").replace("-", "")).timeout(120000).get();
        } catch (SocketTimeoutException | HttpStatusException e) {
            System.err.println(e);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
    
    public Endereco getEnderecoByCep(String s){
        try {
            buscarEndereco(s);
        endereco.setLogradouro(getEndereco());
        endereco.setBairro(getBairro());
        endereco.setCidade(getCidade());
        endereco.setUf(getUf());
        endereco.setCep(getCep());
        return endereco;
        } catch (Exception e) {
            return null;
        }
        
        
    }
    
    public void pesquisar(){
        buscarEndereco(valor);
        endereco.setLogradouro(getEndereco());
        endereco.setBairro(getBairro());
        endereco.setCidade(getCidade());
        endereco.setUf(getUf());
        endereco.setCep(getCep());
        System.err.println("Pesquisa de cep finalizada!");
    }

    /**
     * Retorna o endereço da pesquisa
     *
     * @return
     */
    public String getEndereco() {
        Elements urlPesquisa = doc.select("span[itemprop=streetAddress]");
        endereco.setLogradouro(urlPesquisa.text());
        return endereco.getLogradouro().toUpperCase();
    }

    /**
     * Retorna o bairro da pesquisa
     *
     * @return
     */
    public String getBairro() {
        Elements urlPesquisa = doc.select("td:gt(1)");
        endereco.setBairro(urlPesquisa.text().replace(getCidade(), ""));//remove o nome da cidade da variavel 
        endereco.setBairro(endereco.getBairro().replace(getUf(), ""));//remove o estado da variavel bairro
        return endereco.getBairro().toUpperCase();
    }

    /**
     * Retorna o uf da pesquisa
     *
     * @return
     */
    public String getUf() {
        Elements urlPesquisa = doc.select("span[itemprop=addressRegion]");
        endereco.setUf(urlPesquisa.text());
        return endereco.getUf().toUpperCase();
    }

    /**
     * Retorna a cidade da pesquisa
     *
     * @return
     */
    public String getCidade() {
        Elements urlPesquisa = doc.select("span[itemprop=addressLocality]");
        endereco.setCidade(urlPesquisa.text());
        return endereco.getCidade().toUpperCase();
    }

    /**
     * Retorna o cep
     *
     * @return
     */
    public String getCep() {
        Elements urlPesquisa = doc.select("span[itemprop=postalCode]");
        endereco.setCep(urlPesquisa.text());
        return endereco.getCep().toUpperCase();
    }

    /**
     * Retorna o html da página de onde foi retirado os dados
     *
     * @return
     */
//    public Document getDoc() {
//        return doc;
//    }I

   

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
}
