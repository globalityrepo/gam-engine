package br.com.globality.gam.engine.logwriter.dao;

import br.com.globality.gam.engine.common.domain.TransacaoGrupo;
import br.com.globality.gam.engine.common.domain.TransacaoPasso;
import br.com.globality.gam.engine.common.exception.DAOException;

/**
 * gam-engine-listener
 * @author Leonardo Andrade
 * @since 25/04/2017
 */
public interface LogWriterDAO {
	
	public Boolean hasTransacaoByTrxCode(String trxCode) throws DAOException;
	
	public Boolean hasGrupoByTrxGroupCode(String trxGroupCode) throws DAOException;
	
	public TransacaoGrupo findIdTransacaoGrupoByTrxCodeAndTrxGroupCode(String trxCode, String trxGroupCode) throws DAOException;
	
	public TransacaoPasso findTransacaoPassoByTrxCodeAndTrxStepCode(String trxCode, String trxStepCode) throws DAOException;
	
}
