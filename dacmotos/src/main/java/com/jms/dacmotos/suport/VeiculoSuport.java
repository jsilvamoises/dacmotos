/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.suport;

import com.jms.dacmotos.dao.Dao;
import com.jms.dacmotos.interfaces.InterfaceCrud;
import com.jms.dacmotos.interfaces.InterfaceDao;
import com.jms.dacmotos.model.Veiculo;
import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author MOISES
 */
public class VeiculoSuport implements Serializable, InterfaceCrud{
   
    
    private InterfaceDao<Veiculo> Dao() {
        InterfaceDao<Veiculo> dao = new Dao<>(Veiculo.class);
        return dao;
    }

    @Override
    public boolean save(Object o) {
        return Dao().save((Veiculo) o);
    }

    @Override
    public boolean saveOrUpdate(Object o) {
        return Dao().saveOrUpdate((Veiculo) o);
    }

    @Override
    public boolean delete(Object o) {
        return Dao().remove((Veiculo) o);
    }

    @Override
    public boolean merge(Object o) {
       return Dao().merge((Veiculo) o);
    }

    @Override
    public List list() {
        return Dao().getEntities();
    }
    
    public Veiculo getPessoaById(Long id) {
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
    
    public List<Veiculo> veiculosPorPlaca(String valor){
        DetachedCriteria criteria = DetachedCriteria.forClass(Veiculo.class)
                .add(Restrictions.ilike("placa", valor, MatchMode.START));
        return Dao().getEntitiesByDetachetCriteria(criteria);
    }
    
    
    
    
}
