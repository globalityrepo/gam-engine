package br.com.globality.gam.engine.logwriter.service;

import br.com.globality.gam.engine.common.domain.ConfiguracaoSistema;
import br.com.globality.gam.engine.common.exception.BusinessException;
import br.com.globality.gam.engine.common.exception.ServiceException;
import br.com.globality.gam.engine.common.type.GAMEnvelopeType;
import br.com.globality.gam.engine.common.type.TrxInstParametersType;

/**
 * gam-engine-listener
 * @author Leonardo Andrade
 * @since 13/03/2017
 */
public interface LogWriterService {
	
	public void execute(String envXml) throws ServiceException, BusinessException;
	
	public String getDirPath() throws ServiceException;
	
	public void writeTrxLogFile(final String DIR_PATH, GAMEnvelopeType envObj) throws ServiceException;
	
	public void writeTrxContentFile(final String DIR_PATH, final String UUID, String trxEventInstContent) throws ServiceException;
	
	public void writeTrxParamFile(final String DIR_PATH, final String UUID, TrxInstParametersType trxInstParameters) throws ServiceException;
	
	public ConfiguracaoSistema findConfiguracaoSistema() throws ServiceException;
	
}
