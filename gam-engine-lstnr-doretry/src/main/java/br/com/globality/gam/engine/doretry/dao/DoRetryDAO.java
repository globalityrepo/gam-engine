package br.com.globality.gam.engine.doretry.dao;

import java.util.List;

import br.com.globality.gam.engine.common.domain.EventoInstanciaConteudo;
import br.com.globality.gam.engine.common.domain.TransacaoGrupo;
import br.com.globality.gam.engine.common.domain.TransacaoPasso;
import br.com.globality.gam.engine.common.domain.TransacaoPassoAcao;
import br.com.globality.gam.engine.common.domain.TransacaoPassoAcaoTodo;
import br.com.globality.gam.engine.common.exception.DAOException;

/**
 * gam-engine-listener
 * @author Leonardo Andrade
 * @since 25/04/2017
 */
public interface DoRetryDAO {
	
	public Boolean hasTransacaoByTrxCode(String trxCode) throws DAOException;
	
	public Boolean hasGrupoByTrxGroupCode(String trxGroupCode) throws DAOException;
	
	public TransacaoGrupo findIdTransacaoGrupoByTrxCodeAndTrxGroupCode(String trxCode, String trxGroupCode) throws DAOException;
	
	public TransacaoPasso findTransacaoPassoByTrxCodeAndTrxStepCode(String trxCode, String trxStepCode) throws DAOException;
				
	public EventoInstanciaConteudo findEventoInstanciaConteudo(String idTransacaoInstancia, String idTransacaoPassoInstancia) throws DAOException;
	
	public List<TransacaoPassoAcaoTodo> findRetriesDisponiveis() throws DAOException;
	
	public TransacaoPassoAcao findTransacaoPassoAcaoById(Long idTransacaoPasso, String codEventoTipo) throws DAOException;
	
}
