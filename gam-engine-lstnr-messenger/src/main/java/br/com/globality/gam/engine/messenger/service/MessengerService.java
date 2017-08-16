package br.com.globality.gam.engine.messenger.service;

import br.com.globality.gam.engine.common.domain.ConfiguracaoSistema;
import br.com.globality.gam.engine.common.exception.BusinessException;
import br.com.globality.gam.engine.common.exception.ServiceException;

/**
 * gam-engine-listener
 * @author Leonardo Andrade
 * @since 25/04/2017
 */
public interface MessengerService {
	
	public void execute(String envXml) throws ServiceException, BusinessException;
	
	public ConfiguracaoSistema findConfiguracaoSistema() throws ServiceException;
	
}
