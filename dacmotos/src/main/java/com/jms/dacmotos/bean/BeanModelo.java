/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Marca;
import com.jms.dacmotos.model.Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class BeanModelo implements Serializable{
    private static final Long serialVersionUID=1L;
    
    private Modelo modelo;
    private Modelo  modeloSelecionada;
    private List<Modelo> modelos;
    
    private Marca marca;
    private List<Marca> marcas;
    
    

    public BeanModelo() {
        modelo = new Modelo();
        modeloSelecionada = new Modelo();
        modelos = new ArrayList<>();
        marcas = new ArrayList<>();
    }
    
    public void editar(){
        modelo = modeloSelecionada;
        // System.out.println(unidade.getDescricao());
    }
  
    public void preecherListaMarcas(){
        System.err.println("Passou aqui");
        if(marcas.isEmpty()){
          marcas = new BeanMarca().getMarcas(); 
            System.err.println("Tam "+marcas.size());
        }
        
    }
    
    
    private InterfaceDao<Modelo> Dao(){
        InterfaceDao<Modelo> modeloDao = new Dao<>(Modelo.class);
        return modeloDao;
    }
    
    public void save(){
        System.out.println();
        modelo.setMarca(marca);
        
        if(Dao().save(modelo)){
            criarObjeto();
        }
        
    }
    
    public void delete(){
        System.out.println();
        if(Dao().remove(modeloSelecionada)){
            criarObjeto();
        }
        
    }
    
    public void criarObjeto(){
        modelo = new Modelo();
        modelos.clear();
    }
    
    
    public List<Modelo> getModelos() {
        if(modelos.isEmpty()){
            modelos = Dao().getEntities();
        }
        
        return modelos;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Modelo getModeloSelecionda() {
        return modeloSelecionada;
    }

    public void setModeloSelecionda(Modelo modeloSelecionada) {
        this.modeloSelecionada = modeloSelecionada;
    }

    public Modelo getModeloSelecionada() {
        return modeloSelecionada;
    }

    public void setModeloSelecionada(Modelo modeloSelecionada) {
        this.modeloSelecionada = modeloSelecionada;
    }

    public List<Marca> getMarcas() {
         if(marcas.isEmpty()){
          marcas = new BeanMarca().getMarcas(); 
            System.err.println("Tam "+marcas.size());
        }
        return marcas;
    }

    public void setMarcas(List<Marca> marcas) {
        this.marcas = marcas;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
