/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import com.jms.dacmotos.enums.TipoPessoa;
import com.jms.dacmotos.interfaces.InterfaceBean;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Endereco;
import com.jms.dacmotos.model.Pessoa;
import com.jms.dacmotos.util.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import com.jms.dacmotos.dao.Dao;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Moises
 */
@ManagedBean(name = "beanPessoa")
@SessionScoped
public class BeanPessoa implements Serializable, InterfaceBean {

    private int digitosCel = 8;
    private String mascaraCel;
    private String mascaraCPF_CNPJ;
    private String cepString;
    private Pessoa pessoa = new Pessoa();
    private Endereco endereco = new Endereco();
    private BeanEndereco beanEnd = new BeanEndereco();
    private BeanCep benCep;
    private BeanMascaras mascaraCelNum;
    private List<Pessoa> pessoas;

    private byte tipoPesquisa = 0;

    @PostConstruct
    public void listarTodos() {
        pessoas = Dao().getEntities();
    }

    public String getMascaraCel() {
        return digitosCel == 8 ? new BeanMascaras().getMascaraCelOitoDigitos() : new BeanMascaras().getMascaraCelNoveDigitos();
    }
    private static final Long SerialVersionUID = 1L;
    private boolean isTipoPessoaSelecionado;
    private boolean isEndereçoNull;
    private TipoPessoa tipoPessoa;

    public boolean isIsEndereçoNull() {
        try {
            return !endereco.getCidade().isEmpty();
        } catch (Exception e) {
        }
        return false;

    }

    /**
     * Creates a new instance of BeanPessoa
     */
    public BeanPessoa() {
        //pessoa = new Pessoa();
        // endereco = new Endereco();
        benCep = new BeanCep();
        mascaraCelNum = new BeanMascaras();
        pessoas = new ArrayList<>();

    }

    public void pesquisar() {
        endereco = beanEnd.getEnderecoByCep(cepString, pessoa.getEndereco().getNumero());
        if (endereco == null) {
            endereco = benCep.getEnderecoByCep(cepString);
        }

        if (endereco.getBairro().isEmpty()) {
            System.out.println(endereco);
            // pessoa.getEnderecos().add(endereco);
            FacesUtil.addErrorMessage("Informe o endereço manualmente, não foi possível encontrar.");
        } else {
            pessoa.setEndereco(endereco);
            FacesUtil.addWarnMessage("Endereço encontrado");

        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public BeanCep getBenCep() {
        return benCep;
    }

    public void setBenCep(BeanCep benCep) {
        this.benCep = benCep;
    }

    public String getCepString() {
        return cepString;
    }

    public void setCepString(String cepString) {
        this.cepString = cepString;
    }

    private InterfaceDao<Pessoa> Dao() {
        InterfaceDao<Pessoa> marcaDao = new Dao<>(Pessoa.class);
        return marcaDao;
    }

    @Override
    public void save() {

        // endereco.getPessoas().add(pessoa);
        //pessoa.setEndereco(endereco);
        new BeanEndereco().setEndereco(endereco);

        if (Dao().save(pessoa)) {

            criarObjeto();
           
        }
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void refresh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listAllObjects() {
        System.err.println(pessoas.size());
        return pessoas.size()<1 ? Dao().getEntities() : pessoas;
    }

    public boolean getIsTipoPessoaSelecionado() {
        return pessoa.getTipoPessoa() != null;
    }

    public String getMascara() {
        mascaraCPF_CNPJ = pessoa.getTipoPessoa() == TipoPessoa.FISICA ? "999.999.999-99" : "99.999.999/9999-99";
        return mascaraCPF_CNPJ;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public int getDigitosCel() {
        return digitosCel;
    }

    public void setDigitosCel(int digitosCel) {
        this.digitosCel = digitosCel;
    }
    
    public void criarObjeto(){
        pessoa = new Pessoa();
        pessoas.clear();
        endereco = new Endereco();
    }
    
  


    public List<Pessoa> getPessoas() {
        switch (tipoPesquisa) {
            case 0:
                pessoas = Dao().getEntities();
                break;
            case 1:
                break;
            default:
                break;

        }
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public byte getTipoPesquisa() {
        return tipoPesquisa;
    }

    public void setTipoPesquisa(byte tipoPesquisa) {
        this.tipoPesquisa = tipoPesquisa;
    }

}
