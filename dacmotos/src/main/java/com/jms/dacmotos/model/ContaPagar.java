/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.model;

import com.jms.dacmotos.enums.FormaPagamento;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author Moises
 */
@Entity
@Table(name = "tbl_contas_pagar")
public class ContaPagar implements Serializable{
    private static final Long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cpa_id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "cpa_fornecedor_id")
    @ForeignKey(name = "FK_CPA_FORNECEDOR")
    private Pessoa fornecedor;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "cpa_data_emissao_nota")
    private Date dataEmissaoNota; 
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "cpa_data_lancamento")
    private Date dataLancamento;
    
    @Column(name = "cpa_numero_nota")
    private int numeroNota;
    
    @Column(name = "cpa_valor_nota_fiscal")
    private double valorNotaFiscal;
    
    @Column(name = "cpa_valor_entrada")
    private double valorEntrada;
    
    @Column(name = "cpa_quantidade_parcelas")
    private int quantidadeParcelas;
    
    @Column(name = "cpa_valor_parcela")
    private double valorParcela;
    
    @Column(name = "cpa_intervalo_entre_parcelas")
    private int intervaloEntreParcelas;
    
    @Column(name = "cpa_numero_cheque")
    private String numeroCheque;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "cpa_forma_pagamento_entrada")
    private FormaPagamento formaPagamento;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "cpa_data_vencimento")
    private Date dataVencimento;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "cpa_data_pagamento")
    private Date dataPagamento;
    
    @Column(name = "cpa_numero_parcela")
    private int numeroParcela;

    public ContaPagar() {
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

    public Date getDataEmissaoNota() {
        return dataEmissaoNota;
    }

    public void setDataEmissaoNota(Date dataEmissaoNota) {
        this.dataEmissaoNota = dataEmissaoNota;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public double getValorNotaFiscal() {
        return valorNotaFiscal;
    }

    public void setValorNotaFiscal(double valorNotaFiscal) {
        this.valorNotaFiscal = valorNotaFiscal;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public int getIntervaloEntreParcelas() {
        return intervaloEntreParcelas;
    }

    public void setIntervaloEntreParcelas(int intervaloEntreParcelas) {
        this.intervaloEntreParcelas = intervaloEntreParcelas;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final ContaPagar other = (ContaPagar) obj;
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
