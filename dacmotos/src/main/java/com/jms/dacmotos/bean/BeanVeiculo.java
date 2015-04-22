/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Veiculo;
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
public class BeanVeiculo implements Serializable{
    private static final Long serialVersionUID=1L;
    
    private Veiculo veiculo;
    private Veiculo veiculoSelecionado;
    private List<Veiculo> veiculos;
    
    private InterfaceDao<Veiculo> Dao(){
        InterfaceDao<Veiculo> dao = new Dao<>(Veiculo.class);
        return dao;
    }
    
    public void save(){
        
        if(Dao().save(veiculo)){
            criarObjeto();
        }
        
    }
    
    public void saveOrUpdate(){
        
        if(Dao().saveOrUpdate(veiculo)){
            criarObjeto();
        }
        
    }
    
    public void delete(){
        
        if(Dao().remove(veiculoSelecionado)){
            criarObjeto();
        }
        
    }
    
    public void update(){
        
        Dao().update(veiculo);
        criarObjeto();
        
    }
    
    public void editar(){
        veiculo = veiculoSelecionado;
       
    }
    
    public void criarObjeto(){
        veiculo = new Veiculo();
        veiculos.clear();
    }
    
    

    public BeanVeiculo() {
        veiculos = new ArrayList<>();
        veiculo = new Veiculo();
        veiculoSelecionado = new Veiculo();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculoSelecionado() {
        return veiculoSelecionado;
    }

    public void setVeiculoSelecionado(Veiculo veiculoSelecionado) {
        this.veiculoSelecionado = veiculoSelecionado;
    }

    public List<Veiculo> getListaStatus() {
        veiculos = Dao().getEntities();
        return veiculos;
    }

    public void setListaStatus(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }



    
    
    
}
