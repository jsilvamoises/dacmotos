/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.model;

import com.jms.dacmotos.enums.TipoCodigoBarra;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author Moises
 */
@Entity
@Table(name = "tbl_produto")
public class Produto implements Serializable{
    
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pro_id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "pro_fornecedor_id")
    @ForeignKey(name = "FK_PRO_FORNECEDOR")
    private Pessoa fornecedor;
    @ManyToOne
    @JoinColumn(name = "pro_marca_id")
    @ForeignKey(name = "FK_PRO_MARCA")
    private Marca marca;
    
    @Column(name = "pro_descricao", nullable = false, length = 100)
    private String descricao;
    
    @Column(name = "pro_modelo", length = 60)
    private String modelo;
    
    
   
    @OneToMany
    @JoinColumn(name = "pro_aplicacao_id")
    @ForeignKey(name = "FK_PRO_APLICACAO")
    private List<Aplicacao> aplicacao;
    
    @Column(name = "pro_codigo_fornecedor")
    private String codigoFornecedor;
    
    @Column(name = "pro_codigo_montadora")
    private String codigoMontadora;
    
    @Column(name = "pro_codigo_barra")
    private String codigoBarra;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "pro_tipo_codigo_barra")
    private TipoCodigoBarra tipoCodigoBarra;
    
    @Column(name = "pro_quantidade_caixa",nullable = false)
    private double quantidadeCaixa;
    
    @Column(name = "pro_peso_bruto")
    private double pesoBruto;
    
    @Column(name = "pro_peso_liquido")
    private double pesoLiquido;
    
    @Column(name = "pro_altura")
    private double altura;
    
    @Column(name = "pro_largura")
    private double largura;
    
    @Column(name = "pro_comprimento")
    private double comprimento;
    
    @Column(name = "pro_status")
    private boolean status;

    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Pessoa fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Aplicacao> getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(List<Aplicacao> aplicacao) {
        this.aplicacao = aplicacao;
    }

    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getCodigoMontadora() {
        return codigoMontadora;
    }

    public void setCodigoMontadora(String codigoMontadora) {
        this.codigoMontadora = codigoMontadora;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public TipoCodigoBarra getTipoCodigoBarra() {
        return tipoCodigoBarra;
    }

    public void setTipoCodigoBarra(TipoCodigoBarra tipoCodigoBarra) {
        this.tipoCodigoBarra = tipoCodigoBarra;
    }

    public double getQuantidadeCaixa() {
        return quantidadeCaixa;
    }

    public void setQuantidadeCaixa(double quantidadeCaixa) {
        this.quantidadeCaixa = quantidadeCaixa;
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id.toString();
    }
    
    
    

   
    
    
}
