/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.model;

import com.jms.dacmotos.enums.StatusCadastroCliente;
import com.jms.dacmotos.enums.TipoPessoa;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Moises
 */
@Entity
@Table(name = "tbl_pessoa")
public class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pes_id")
    private Long id;
    
    @NotEmpty
    @Column(name = "pes_nome", length = 80, nullable = false)
    private String nome;
    
    @NotEmpty
    @Column(name = "pes_cpf_cnpj",unique = true, length = 18, nullable = true)
    private String cpfCnpj;
    
    @Column(name = "pes_rg_ie",length = 15, nullable = true)
    private String rgIe;
    
     @Column(name = "pes_habilitacao",length = 20, nullable = true)
    private String habilitacao;
    
   
    
    @Column(name = "pes_email", length = 100, unique = true, nullable = true)
    private String Email;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "pes_data_cadastro")
    private Date dataCadastro;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "pes_data_nascimento")
    private Date dataNascimento;
    
    @Column(name = "pes_telefone_residencial",length = 16)
    private String telefoneResidencial;
    
    @Column(name = "pes_telefone_celular", length = 16)
    private String telefoneCelular;
    
    @Column(name = "pes_telefone_recado", length = 16)
    private String telefoneRecado;
    
    @Column(name = "pes_nome_pessoa_recado")
    private String nomePessoaRecado; 
    
    @Column(name = "pes_telefone_comercial")
    private String telefoneComercial;
    
    @Column(name = "pes_ie")
    private String ie;
    
    @Lob()
    @Column(name = "pes_observacao")
    private String observacao;
    
    
    @Column(name = "pes_tipo_pessoa")
    @Enumerated(EnumType.STRING)
    private TipoPessoa tipoPessoa;
    
   
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "pes_endereco_id" , nullable = true )  
    //@Fetch(FetchMode.SELECT)
    private Endereco endereco;
    
    @Column(name = "pes_status_cadastro")
    @Enumerated(EnumType.STRING)
    private StatusCadastroCliente status;
    
    @Transient
    private String nomeDocumento;

    public Pessoa() {
        endereco = new Endereco();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getRgIe() {
        return rgIe;
    }

    public void setRgIe(String rgIe) {
        this.rgIe = rgIe;
    }

    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email.toLowerCase();
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneRecado() {
        return telefoneRecado;
    }

    public void setTelefoneRecado(String telefoneRecado) {
        this.telefoneRecado = telefoneRecado;
    }

    public String getNomePessoaRecado() {
        return nomePessoaRecado;
    }

    public void setNomePessoaRecado(String nomePessoaRecado) {
        this.nomePessoaRecado = nomePessoaRecado.toUpperCase();
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao.toUpperCase();
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public StatusCadastroCliente getStatus() {
        return status;
    }

    public void setStatus(StatusCadastroCliente status) {
        this.status = status;
    }

    public String getNomeDocumento() {
        nomeDocumento =  cpfCnpj.concat(" - ").concat(nome);
        return nomeDocumento;
    }

    public void setNomeDocumento(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }
    
    
    
    
}
