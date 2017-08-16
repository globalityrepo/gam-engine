package br.com.globality.gam.engine.dbmanager.service;

import br.com.globality.gam.engine.common.domain.ConfiguracaoSistema;
import br.com.globality.gam.engine.common.exception.BusinessException;
import br.com.globality.gam.engine.common.exception.ServiceException;

/**
 * gam-engine-listener
 * @author Leonardo Andrade
 * @since 13/03/2017
 */
public interface DBManagerService {
	
	public void execute(String envXml) throws ServiceException, BusinessException;
	
	public ConfiguracaoSistema findConfiguracaoSistema() throws ServiceException;
	
}
