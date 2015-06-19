/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Moises
 */
@ManagedBean
@ApplicationScoped
public class BeanNavigation {

    private static final String URL = "/restrict/";
    private static final String EXT = ".xhtml";
     private static final String GO_INDEX = "/faces/home.xhtml";
    private static final String GO_ANO_APLICACAO = URL.concat("anoaplicacao".concat(EXT));
    private static final String GO_APLICACAO = URL.concat("aplicacao".concat(EXT));
    private static final String GO_CADASTRO_BANCO = URL.concat("cadastro_banco").concat(EXT);
    private static final String GO_CAIXA = URL.concat("caixa").concat(EXT);
    private static final String GO_CADASTRO_CONTA_BANCO = URL.concat("cadastro_banco_conta").concat(EXT);
    private static final String GO_CADASTRO_FINANCEIRO_CAIXA = URL.concat("cadastro_financeiro_caixa").concat(EXT);
    private static final String GO_CADASTRO_PESSOA = URL.concat("cadastro_pessoa").concat(EXT);
    private static final String GO_CADASTRO_PESSOA_LISTA = URL.concat("cadastro_pessoa_lista").concat(EXT);
    private static final String GO_CADASTRO_VEICULO = URL.concat("cadastro_veiculo").concat(EXT);
    private static final String GO_CADASTRO_VEICULO_LISTA = URL.concat("cadastro_veiculo_lista").concat(EXT);
    private static final String GO_CONSULTA_CONTAS_RECEBER = URL.concat("cadastro_contas_receber").concat(EXT);
    private static final String GO_CONSULTA_HISTORICO_VEICULO = URL.concat("consulta_historico_veiculo").concat(EXT);
    private static final String GO_CONSULTA_MOVIMENTO_CAIXA = URL.concat("consulta_movimento_caixa").concat(EXT);
    private static final String GO_CONSULTA_PEDIDO = URL.concat("consulta_pedido").concat(EXT);
    private static final String GO_CONSULTA_PRECO = URL.concat("consulta_preco").concat(EXT);
    private static final String GO_CONSULTA_CEP = URL.concat("consultacep").concat(EXT);
    private static final String GO_CONSULTA_MAPA = URL.concat("consultamapa").concat(EXT);
    private static final String GO_CONTAS_PAGAR = URL.concat("contas_pagar").concat(EXT);
    private static final String GO_CONTAS_PAGAR_RELATORIO = URL.concat("contas_pagar_relatorio".concat(EXT));
    private static final String GO_CORES = URL.concat("cores".concat(EXT));
    private static final String GO_ENDERECO = URL.concat("endereco".concat(EXT));
    private static final String GO_EMPRESA = URL.concat("empresa".concat(EXT));
    private static final String GO_ENTRADAS = URL.concat("entradas".concat(EXT));
    private static final String GO_ESTOQUE = URL.concat("estoque".concat(EXT));
    private static final String GO_HISTORICO_VEICULO = URL.concat("historico_veiculo".concat(EXT));
    private static final String GO_MENU_VENDA = URL.concat("menuvenda".concat(EXT));
    private static final String GO_INVENTARIO = URL.concat("inventario".concat(EXT));
    private static final String GO_ORCAMENTO = URL.concat("orcamento".concat(EXT));
    private static final String GO_PESSOA = URL.concat("pessoa".concat(EXT));
    private static final String GO_PRODUTO = URL.concat("produto".concat(EXT));
    private static final String GO_PRODUTO_MARCA = URL.concat("produtomarca".concat(EXT));
    private static final String GO_PEDIDO = URL.concat("pedido".concat(EXT));
    private static final String GO_STATUS_PEDIDO_ORCAMENTO = URL.concat("statusPedidoOrcamento").concat(EXT);
    private static final String GO_UNIDADE = URL.concat("unidade".concat(EXT));
    private static final String GO_VEICULO_MARCA = URL.concat("veiculomarca".concat(EXT));
    private static final String GO_VEICULO_MODELO = URL.concat("veiculomodelo".concat(EXT));
    private static final String GO_VENDA_PRODUTO_SERVICO = URL.concat("vendaprodutoservico".concat(EXT));

    public  String getGO_INDEX() {
        return GO_INDEX;
    }

    public String getGO_HISTORICO_VEICULO() {
        return GO_HISTORICO_VEICULO;
    }

    public String getGO_PEDIDO() {
        return GO_PEDIDO;
    }

    public String getGO_ESTOQUE() {
        return GO_ESTOQUE;
    }

    public String getGO_CONSULTA_MAPA() {
        return GO_CONSULTA_MAPA;
    }

    public String getGO_INVENTARIO() {
        return GO_INVENTARIO;
    }

    public String getGO_ENTRADAS() {
        return GO_ENTRADAS;
    }

    public String getGO_CAIXA() {
        return GO_CAIXA;
    }

    public String getGO_EMPRESA() {
        return GO_EMPRESA;
    }

    public String getURL() {
        return URL;
    }

    public String getEXT() {
        return EXT;
    }

    public String getGO_ANO_APLICACAO() {
        return GO_ANO_APLICACAO;
    }

    public String getGO_APLICACAO() {
        return GO_APLICACAO;
    }

    public String getGO_CADASTRO_BANCO() {
        return GO_CADASTRO_BANCO;
    }

    public String getGO_CADASTRO_CONTA_BANCO() {
        return GO_CADASTRO_CONTA_BANCO;
    }

    public String getGO_CADASTRO_FINANCEIRO_CAIXA() {
        return GO_CADASTRO_FINANCEIRO_CAIXA;
    }

    public String getGO_CADASTRO_PESSOA() {
        return GO_CADASTRO_PESSOA;
    }

    public String getGO_CADASTRO_PESSOA_LISTA() {
        return GO_CADASTRO_PESSOA_LISTA;
    }

    public String getGO_CADASTRO_VEICULO() {
        return GO_CADASTRO_VEICULO;
    }

    public String getGO_CADASTRO_VEICULO_LISTA() {
        return GO_CADASTRO_VEICULO_LISTA;
    }

    public String getGO_CONSULTA_CONTAS_RECEBER() {
        return GO_CONSULTA_CONTAS_RECEBER;
    }

    public String getGO_CONSULTA_HISTORICO_VEICULO() {
        return GO_CONSULTA_HISTORICO_VEICULO;
    }

    public String getGO_CONSULTA_MOVIMENTO_CAIXA() {
        return GO_CONSULTA_MOVIMENTO_CAIXA;
    }

    public String getGO_CONSULTA_PEDIDO() {
        return GO_CONSULTA_PEDIDO;
    }

    public String getGO_CONSULTA_PRECO() {
        return GO_CONSULTA_PRECO;
    }

    public String getGO_CONSULTA_CEP() {
        return GO_CONSULTA_CEP;
    }

    public String getGO_CONTAS_PAGAR() {
        return GO_CONTAS_PAGAR;
    }

    public String getGO_CONTAS_PAGAR_RELATORIO() {
        return GO_CONTAS_PAGAR_RELATORIO;
    }

    public String getGO_CORES() {
        return GO_CORES;
    }

    public String getGO_ENDERECO() {
        return GO_ENDERECO;
    }

    public String getGO_MENU_VENDA() {
        return GO_MENU_VENDA;
    }

    public String getGO_ORCAMENTO() {
        return GO_ORCAMENTO;
    }

    public String getGO_PESSOA() {
        return GO_PESSOA;
    }

    public String getGO_PRODUTO() {
        return GO_PRODUTO;
    }

    public String getGO_PRODUTO_MARCA() {
        return GO_PRODUTO_MARCA;
    }

    public String getGO_STATUS_PEDIDO_ORCAMENTO() {
        return GO_STATUS_PEDIDO_ORCAMENTO;
    }

    public String getGO_UNIDADE() {
        return GO_UNIDADE;
    }

    public String getGO_VEICULO_MARCA() {
        return GO_VEICULO_MARCA;
    }

    public String getGO_VEICULO_MODELO() {
        return GO_VEICULO_MODELO;
    }

    public String getGO_VENDA_PRODUTO_SERVICO() {
        return GO_VENDA_PRODUTO_SERVICO;
    }

}
