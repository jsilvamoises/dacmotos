/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.model;

import com.jms.dacmotos.enums.TipoEndereco;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Moises
 */
@Entity
@Table(name = "tbl_endereco")
public class Endereco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "end_id")
    private Long id;
    
    @Column(name = "end_cep", length = 10, nullable = false,unique = false)
    private String cep;
    
    @Column(name = "end_logradouro",length = 100,nullable = false)
    private String logradouro;
    
    @Column(name = "end_bairro",length = 100,nullable = false)
    private String bairro;
    
    @Column(name = "end_cidade", length = 100, nullable = false)
    private String  cidade;
    
    @Column(name = "end_uf", length = 2, nullable = false)
    private String uf;
    
    @Column(name = "end_numero", length = 15, nullable = false)
    private String numero;
    
    @Column(name = "end_complemento", length = 15, nullable = false)
    private String complemento;

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    @Enumerated(EnumType.STRING) 
    @Column(name = "end_tipo_endereco")
    private TipoEndereco tipoEndereco;
    
//    @ManyToMany(cascade = CascadeType.PERSIST ,fetch = FetchType.EAGER)
//    @ForeignKey(name = "FK_PESSOA")
//    @Fetch(FetchMode.JOIN)
//    private List<Pessoa> pessoas;

    public Endereco() {
       // pessoas = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

//    public List<Pessoa> getPessoas() {
//        return pessoas;
//    }
//
//    public void setPessoas(List<Pessoa> pessoas) {
//        this.pessoas = pessoas;
//    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
    
    
}
