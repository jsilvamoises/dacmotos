/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.beanx;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.interfaces.InterfaceBean;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.AnoAplicacao;
import com.jms.dacmotos.model.Aplicacao;
import com.jms.dacmotos.model.Marca;
import com.jms.dacmotos.model.Modelo;
import com.jms.dacmotos.suport.AplicacaoSuport;
import com.jms.dacmotos.util.FacesUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Moises
 */
@ManagedBean
@ViewScoped
public class BeanAplicacao implements Serializable, InterfaceBean {

    private static final Long SerialVersionUID = 1L;

    private Aplicacao aplicacao;

    private Marca marca;

    private BeanMarca beanMarca;
    private BeanAnoAplicacao benAnoAplicacao;
    private BeanModelo beanModelo;
    private AplicacaoSuport suport;

    private List<Marca> marcas;
    private List<AnoAplicacao> anos;
    private List<Modelo> modelos;
    private List<Aplicacao> aplicacoes;

    private Aplicacao aplicacaoSelecionada;

    public BeanAplicacao() {

        aplicacao = new Aplicacao();
        marca = new Marca();

        beanMarca = new BeanMarca();
        benAnoAplicacao = new BeanAnoAplicacao();
        beanModelo = new BeanModelo();
        suport = new AplicacaoSuport();

        marcas = new ArrayList<>();
        anos = new ArrayList<>();
        modelos = new ArrayList<>();
        aplicacoes = new ArrayList<>();

      //  aplicacaoSelecionada = new Aplicacao();
    }

    private InterfaceDao<Aplicacao> Dao() {
        InterfaceDao<Aplicacao> dao = new Dao<>(Aplicacao.class);
        return dao;
    }

    public void refreshMarcas() {
        marcas.clear();
        getMarcas();
    }

    public void refreshModelos() {
        modelos.clear();
        getMarcas();
    }

    public void refreshAnos() {
        anos.clear();
        getMarcas();
    }

    @Override
    public void save() {
       
        if (!suport.validaAplicacaoSalvar(aplicacao)) {
           
            FacesUtil.addErrorMessage("O objeto não pode ser salvo por já existe!");
        } else {
            if (Dao().save(aplicacao)) {
                clear();
            }
        }

    }

    @Override
    public void edit() {
        aplicacao = aplicacaoSelecionada;
    }

    @Override
    public void delete() {
        if (Dao().remove(aplicacaoSelecionada)) {
            aplicacoes.clear();

            clear();
        }
    }

    @Override
    public void clear() {
        aplicacao = new Aplicacao();
        marca = new Marca();
        aplicacoes.clear();

    }

    public BeanMarca getBeanMarca() {
        return beanMarca;
    }

    public void setBeanMarca(BeanMarca beanMarca) {
        this.beanMarca = beanMarca;
    }

    public BeanAnoAplicacao getBenAnoAplicacao() {
        return benAnoAplicacao;
    }

    public void setBenAnoAplicacao(BeanAnoAplicacao benAnoAplicacao) {
        this.benAnoAplicacao = benAnoAplicacao;
    }

    public List<Marca> getMarcas() {
        if (marcas.isEmpty()) {
            marcas = beanMarca.getMarcas();
        }

        return marcas;
    }

    public void setMarcas(List<Marca> marcas) {
        this.marcas = marcas;
    }

    public List<AnoAplicacao> getAnos() {
        anos = benAnoAplicacao.getAnos();
        return anos;
    }

    public void setAnos(List<AnoAplicacao> anos) {
        this.anos = anos;
    }

    public Aplicacao getAplicacaoSelecionada() {
        return aplicacaoSelecionada;
    }

    public void setAplicacaoSelecionada(Aplicacao aplicacaoSelecionada) {
        this.aplicacaoSelecionada = aplicacaoSelecionada;
    }

    public BeanModelo getBeanModelo() {
        return beanModelo;
    }

    public void setBeanModelo(BeanModelo beanModelo) {
        this.beanModelo = beanModelo;
    }

    public List<Modelo> getModelos() {
        modelos = beanModelo.getModelos();
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public Aplicacao getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(Aplicacao aplicacao) {
        this.aplicacao = aplicacao;
    }

    public List<Aplicacao> getAplicacoes() {
        if (aplicacoes.isEmpty()) {
            System.err.println(aplicacoes.size());
            aplicacoes = Dao().getEntities();
        }

        return aplicacoes;
    }

    public void setAplicacoes(List<Aplicacao> aplicacoes) {
        this.aplicacoes = aplicacoes;
    }

    @Override
    public void update() {
        clear();
        list();

    }

    @Override
    public List list() {
        return Dao().getEntities();
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

}
