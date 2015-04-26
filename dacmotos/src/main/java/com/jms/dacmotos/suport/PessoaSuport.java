/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.suport;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.enums.StatusCadastroCliente;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Pessoa;
import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Moises
 */
public class PessoaSuport implements Serializable {

    private InterfaceDao<Pessoa> Dao() {
        InterfaceDao<Pessoa> dao = new Dao<>(Pessoa.class);
        return dao;
    }

    public List<Pessoa> ListByNameOrDocument(String campoPesquisa) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Pessoa.class)
                .add(Restrictions.or(Restrictions.ilike("cpfCnpj", campoPesquisa, MatchMode.START), Restrictions.ilike("nome", campoPesquisa, MatchMode.START)));

        return Dao().getEntitiesByDetachetCriteria(criteria);
    }

    public boolean save(Pessoa pessoa) {
        return Dao().save(pessoa);
    }

    public boolean saveOrUpadate(Pessoa pessoa) {
        return Dao().saveOrUpdate(pessoa);

    }

    public boolean delete(Pessoa pessoa) {
        return Dao().remove(pessoa);

    }

    public List<Pessoa> listarTodos() {
        return Dao().getEntities();

    }

    public void bloquearCliente(Pessoa pessoa) {
        pessoa.setStatus(StatusCadastroCliente.BLOQUEADO);
        Dao().save(pessoa);
    }

    public void ativarCliente(Pessoa pessoa) {
        pessoa.setStatus(StatusCadastroCliente.ATIVO);
        Dao().save(pessoa);
    }

    public Pessoa getPessoaById(Long id) {
        System.out.print("moi");
        if (id > 0) {
            try {
                return Dao().getEntity(id);

            } catch (Exception e) {
                return null;
            }
        }
        return null;

    }
}
