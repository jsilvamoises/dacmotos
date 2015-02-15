/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "tbl_historico_veiculo_cliente")
public class HistoricoVeiculoCliente implements Serializable{
    private static final Long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hvc_id")
    private Long id;
    
    @Column(name = "hvc_data_historico")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataHistorico;
    
    @ManyToOne
    @JoinColumn(name = "hvc_cliente_id")
    @ForeignKey(name = "FK_HVC_CLIENTE")
    private Pessoa cliente;
    
    @ManyToOne
    @JoinColumn(name = "hvc_veiculo_id")
    @ForeignKey(name="hvc_veidulo_id")
    private Veiculo veiculo;
    
    @Column(name="hvc_descricao_servico")
    private String descricaoServico;
    
    
    
}
