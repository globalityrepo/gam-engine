
package br.com.globality.gam.engine.logwriter.dao;

import java.util.List;

import br.com.globality.gam.engine.common.exception.DAOException;

/**
 * gam-engine-listener
 * @author Leonardo Andrade
 * @since 13/03/2017
 */
public interface GenericDAO {

	public <T> T add(T t) throws DAOException;

	public <T> T update(T t) throws DAOException;

	public <K, T> void delete(Class<T> t, K k) throws DAOException;
	
	public <K, T> T findById(Class<T> t, K k) throws DAOException;

	public <T> List<T> findAll(Class<T> t) throws DAOException;
	
}
