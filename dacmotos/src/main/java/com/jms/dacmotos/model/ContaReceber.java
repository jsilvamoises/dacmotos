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
@Table(name = "tbl_contas_receber")
public class ContaReceber implements Serializable{
    private static final Long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cre_id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "cre_cliente_id")
    @ForeignKey(name = "FK_CRE_CLIENTE")
    private Pessoa cliente;
    
    @ManyToOne
    @JoinColumn(name = "cre_pedido_id")
    @ForeignKey(name = "FK_CRE_PEDIDO")
    private Pedido pedido;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "cre_data_faturamento")
    private Date dataFaturamento;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "cre_data_vencimento")
    private Date dataVencimento;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "cre_data_pagemento")
    private Date dataPagamento;
    
    @Column(name = "cre_nota_fiscal")
    private Long notaFiscal;
    
    @Column(name = "cre_total_parcela")
    private int totalParcela;
    
    @Column(name = "cre_valor_parcela")
    private double valorParcela;
    
    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;

    public ContaReceber() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Date getDataFaturamento() {
        return dataFaturamento;
    }

    public void setDataFaturamento(Date dataFaturamento) {
        this.dataFaturamento = dataFaturamento;
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

    public Long getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(Long notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public int getTotalParcela() {
        return totalParcela;
    }

    public void setTotalParcela(int totalParcela) {
        this.totalParcela = totalParcela;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }
    
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
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
        final ContaReceber other = (ContaReceber) obj;
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
