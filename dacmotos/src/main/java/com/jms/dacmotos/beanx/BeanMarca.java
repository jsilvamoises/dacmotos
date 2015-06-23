/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.beanx;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Marca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class BeanMarca implements Serializable{
    private static final Long serialVersionUID=1L;
    
    private Marca marca;
    private Marca  marcaSelecionada;
    
    private List<Marca> marcas;

    public BeanMarca() {
        marca = new Marca();
        marcaSelecionada = new Marca();
        marcas = new ArrayList<>();
    }
    
    public void editar(){
        marca = marcaSelecionada;
        // System.out.println(unidade.getDescricao());
    }
    
    
    private InterfaceDao<Marca> Dao(){
        InterfaceDao<Marca> marcaDao = new Dao<>(Marca.class);
        return marcaDao;
    }
    
    public void save(){
        System.out.println();
        if(Dao().save(marca)){
            criarObjeto();
        }
        
    }
    
    public void delete(){
        System.out.println();
        if(Dao().remove(marcaSelecionada)){
            criarObjeto();
        }
        
    }
    
    public void criarObjeto(){
        marca = new Marca();
        marcas.clear();
    }
    
    public Marca getMarcaById(Long id){
        return Dao().getEntity(id);
    }
    
    public List<Marca> getMarcas() {
        if(marcas.isEmpty()){
            marcas = Dao().getEntities();
        }
        
        return marcas;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Marca getMarcaSelecionda() {
        return marcaSelecionada;
    }

    public void setMarcaSelecionda(Marca marcaSelecionada) {
        this.marcaSelecionada = marcaSelecionada;
    }

    public Marca getMarcaSelecionada() {
        return marcaSelecionada;
    }

    public void setMarcaSelecionada(Marca marcaSelecionada) {
        this.marcaSelecionada = marcaSelecionada;
    }
}
