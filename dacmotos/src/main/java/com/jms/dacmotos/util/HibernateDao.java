/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jms.dacmotos.util;

import com.jms.dacmotos.interfaces.InterfaceDao;
import java.io.Serializable;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author Moises
 */
public class HibernateDao<T> implements InterfaceDao<T>, Serializable{
    
    private static final Long serialVersionUID = 1L;
    
    private Class<T> classe;
    private Session session;

    public HibernateDao(Class<T> classe, Session session) {
        super();
        this.classe = classe;
        this.session = session;
    }
    
    
    
    
    @Override
    public boolean save(T entity) {
        try {
            session.save(entity);
            FacesUtil.addInfoMessage("Salvo com sucesso!");
            return true;
        } catch (Exception e) {
            FacesUtil.addErrorMessage("Não foi possível salvar! "+e);
            return false;
        }
        
    }
    
    @Override
    public boolean saveOrUpdate(T entity) {
        try {
            session.saveOrUpdate(entity);
            
            if(!entity.toString().isEmpty()){
                 FacesUtil.addInfoMessage("Salvo com sucesso!");
            }else{
                FacesUtil.addInfoMessage("Atualizado com sucesso!");
            }
           
            return true;
        } catch (Exception e) {
            FacesUtil.addErrorMessage("Não foi possível salvar! "+e);
            return false;
        }
        
    }

    @Override
    public boolean update(T entity) {
       try {
            session.update(entity);
             FacesUtil.addInfoMessage("Atualizado com sucesso!");
            return true;
        } catch (Exception e) {
            FacesUtil.addErrorMessage("Erro ao atualizar! \n"+e);
            return false;
        }
    }

    @Override
    public boolean remove(T entity) {
        try {
            session.delete(entity);
            FacesUtil.addInfoMessage("Excluído com sucesso!");
            return true;
        } catch (Exception e) {
            FacesUtil.addErrorMessage("Registro não pode ser excluído! "+e);
            return false;
        }
    }

    @Override
    public boolean merge(T entity) {
        try {
            session.merge(entity);
            FacesUtil.addInfoMessage("Sincronizado com sucesso!");
            return true;
        } catch (Exception e) {
            FacesUtil.addErrorMessage("Não foi possível sincronizar o objeto! "+e);
            return false;
        }
    }

    @Override
    public T getEntity(Serializable id) {
        T entity = (T) session.get(classe, id);
        return entity;
    }

    @Override
    public T getEntityByDetachedCriteria(DetachedCriteria criteria) {
         T entity = (T) criteria.getExecutableCriteria(session).uniqueResult();
         return entity;
    }

    @Override
    public List<T> getEntities() {
       List<T> lista = (List<T>) session.createCriteria(classe).list();
       return lista;
    }

    @Override
    public List<T> getEntitiesByDetachetCriteria(DetachedCriteria criteria) {
       return criteria.getExecutableCriteria(session).list();
    }
    
}
