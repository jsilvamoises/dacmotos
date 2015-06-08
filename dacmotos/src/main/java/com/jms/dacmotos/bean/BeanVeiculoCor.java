/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.VeiculoCor;
import com.jms.dacmotos.util.HibernateUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.hibernate.Session;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class BeanVeiculoCor implements Serializable{
    private static final Long serialVersionUID=1L;
    
    private VeiculoCor cor;
    private VeiculoCor  corSelecionada;
    
    private List<VeiculoCor> cores;

    public BeanVeiculoCor() {
        cor = new VeiculoCor();
        corSelecionada = new VeiculoCor();
        cores = new ArrayList<>();
    }
    
    public void editar(){
        cor = corSelecionada;
        // System.out.println(unidade.getDescricao());
    }
    
    public void limparLista(){
        cores.clear();
    }
    
    
    
    private InterfaceDao<VeiculoCor> Dao(){
        InterfaceDao<VeiculoCor> veiculoDao = new Dao<>(VeiculoCor.class);
        return veiculoDao;
    }
    
    public void save(){
        System.out.println();
        if(Dao().save(cor)){
            criarObjeto();
        }
        
    }
    
    public void delete(){
        System.out.println();
        if(Dao().remove(corSelecionada)){
            criarObjeto();
        }
        
    }
    
    public void criarObjeto(){
        cor = new VeiculoCor();
        cores.clear();
    }
    
    
    public List<VeiculoCor> getCores() {
        if(cores.isEmpty()){
            cores = Dao().getEntities();
        }
        
        return cores;
    }

    public VeiculoCor getCor() {
        return cor;
    }

    public void setCor(VeiculoCor cor) {
        this.cor = cor;
    }

    public VeiculoCor getCorSelecionada() {
        return corSelecionada;
    }

    public void setCorSelecionada(VeiculoCor corSelecionada) {
        this.corSelecionada = corSelecionada;
    }
    
    public VeiculoCor getObjectById(Long id){
        return Dao().getEntity(id);
    }
}
