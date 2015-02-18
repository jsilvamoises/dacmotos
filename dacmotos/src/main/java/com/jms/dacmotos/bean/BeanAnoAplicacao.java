/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.AnoAplicacao;
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
public class BeanAnoAplicacao implements Serializable{
    private static final Long serialVersionUID=1L;
    
    private AnoAplicacao anoAplicacao;
    private AnoAplicacao  anoAplicacaoSelecionado;
    
    private List<AnoAplicacao> anos;

    public BeanAnoAplicacao() {
        anoAplicacao = new AnoAplicacao();
        anoAplicacaoSelecionado = new AnoAplicacao();
        anos = new ArrayList<>();
    }
    
    public void editar(){
        anoAplicacao = anoAplicacaoSelecionado;
        // System.out.println(unidade.getDescricao());
    }
    
    
    private InterfaceDao<AnoAplicacao> Dao(){
        InterfaceDao<AnoAplicacao> anoDao = new Dao<>(AnoAplicacao.class);
        return anoDao;
    }
    
    public void save(){
        System.out.println();
        if(Dao().save(anoAplicacao)){
            criarObjeto();
        }
        
    }
    
    public void delete(){
        System.out.println();
        if(Dao().remove(anoAplicacaoSelecionado)){
            criarObjeto();
        }
        
    }
    
    public void criarObjeto(){
        anoAplicacao = new AnoAplicacao();
        anos.clear();
    }
    
    
    public List<AnoAplicacao> getAnos() {
        if(anos.isEmpty()){
            anos = Dao().getEntities();
        }
        
        return anos;
    }

    public AnoAplicacao getAno() {
        return anoAplicacao;
    }

    public void setAno(AnoAplicacao anoAplicacao) {
        this.anoAplicacao = anoAplicacao;
    }

    public AnoAplicacao getAnoSelecionado() {
        return anoAplicacaoSelecionado;
    }

    public void setAnoSelecionado(AnoAplicacao anoAplicacaoSelecionado) {
        this.anoAplicacaoSelecionado = anoAplicacaoSelecionado;
    }
}
