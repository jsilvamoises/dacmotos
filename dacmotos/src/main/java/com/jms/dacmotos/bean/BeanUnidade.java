/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Unidade;
import com.jms.dacmotos.util.FacesContextUtil;
import com.jms.dacmotos.util.HibernateDao;
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
public class BeanUnidade implements Serializable{
    private static final Long serialVersionUID=1L;
    private Unidade unidade;
    private Unidade unidadeSelecionada;
    private List<Unidade> unidades;
    
    private InterfaceDao<Unidade> unidadeDao(){
        InterfaceDao<Unidade> unidadeDao = new HibernateDao<>(Unidade.class, FacesContextUtil.getRequestSession());
        return unidadeDao;
    }
    
    public void save(){
        System.out.println(unidade.getDescricao());
        if(unidadeDao().save(unidade)){
            criarObjeto();
        }
        
    }
    
    public void saveOrUpdate(){
        System.out.println(unidade.getDescricao());
        if(unidadeDao().saveOrUpdate(unidade)){
            criarObjeto();
        }
        
    }
    
    public void delete(){
        System.out.println(unidade.getDescricao());
        unidadeDao().remove(unidade);
        
    }
    
    public void update(){
        System.out.println(unidade.getDescricao());
        unidadeDao().update(unidade);
        criarObjeto();
        
    }
    
    
    public void criarObjeto(){
        unidade = new Unidade();
        unidades.clear();
    }
    
    

    public BeanUnidade() {
        unidades = new ArrayList<>();
        unidade = new Unidade();
        unidadeSelecionada = new Unidade();
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public Unidade getUnidadeSelecionada() {
        return unidadeSelecionada;
    }

    public void setUnidadeSelecionada(Unidade unidadeSelecionada) {
        this.unidadeSelecionada = unidadeSelecionada;
    }

    public List<Unidade> getUnidades() {
        if(unidades.isEmpty()){
            unidades = unidadeDao().getEntities();
        }
        
        return unidades;
    }

    public void setUnidades(List<Unidade> unidades) {
        this.unidades = unidades;
    }
    
    
    
}
