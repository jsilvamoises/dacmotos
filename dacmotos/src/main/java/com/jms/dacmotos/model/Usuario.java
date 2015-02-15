/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.model;

import com.jms.dacmotos.enums.StatusUsuario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Moises
 */
@Entity
@Table(name = "tbl_usuario")
public class Usuario implements Serializable{
     private static final Long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "usu_id")
     private Long id;
     
     @Column(name = "usu_nome", length = 80, nullable = false)
     private String nome;
     
     @Column(name = "usu_login", length = 90, nullable = false)
     private String login;
     
      @Column(name = "usu_senha", length = 90, nullable = false)
     private String senha;
      
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date dataCadastro;
     
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date dataUltimoAcesso;
     
     @Enumerated(EnumType.STRING)
     private StatusUsuario statusUsuario;
     
     @OneToMany
     private List<UsuarioAcesso> acessos;

    public Usuario() {
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
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    public void setDataUltimoAcesso(Date dataUltimoAcesso) {
        this.dataUltimoAcesso = dataUltimoAcesso;
    }

    public StatusUsuario getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(StatusUsuario statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    public List<UsuarioAcesso> getAcessos() {
        return acessos;
    }

    public void setAcessos(List<UsuarioAcesso> acessos) {
        this.acessos = acessos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Usuario other = (Usuario) obj;
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
