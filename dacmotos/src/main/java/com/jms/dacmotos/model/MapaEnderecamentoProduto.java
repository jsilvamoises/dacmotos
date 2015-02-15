/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Moises
 */
@Entity
@Table(name = "tbl_mapa_enderecamento_produtos")
public class MapaEnderecamentoProduto implements Serializable{
    private static final Long serialVersionUID=1L;
    
    @Id
    @Column(name = "mep_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "mep_localizacao", nullable = false,length = 20)
    private String localizacao;
    
    @Column(name = "mep_prateleira", nullable = false,length = 20)
    private String prateleira;
    
    @Column(name = "mep_nivel", nullable = false,length = 20)
    private String nivel;
    
    @Column(name = "mep_gaveta", nullable = false,length = 20)
    private String gaveta;
    @Column(name = "mep_observacao", nullable = false,length = 255)
    private String observacao;
    
    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "pro_id")
    private List<Produto> produtos;

    public MapaEnderecamentoProduto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getGaveta() {
        return gaveta;
    }

    public void setGaveta(String gaveta) {
        this.gaveta = gaveta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final MapaEnderecamentoProduto other = (MapaEnderecamentoProduto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id.toString();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
