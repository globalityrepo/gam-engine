package br.com.globality.gam.engine.web.api.dao;

import br.com.globality.gam.engine.common.domain.TransacaoPassoAcao;
import br.com.globality.gam.engine.common.domain.TransacaoPassoAcaoTodo;
import br.com.globality.gam.engine.common.exception.DAOException;

public interface ResubDAO {

	public TransacaoPassoAcao findTransacaoPassoAcao(Long idTransacaoPasso, String codigoEventoTipo) throws DAOException;

	public TransacaoPassoAcaoTodo findTransacaoPassoAcaoTodo(Long idTransacaoPasso, String codigoEventoTipo, String idEventoInstancia) throws DAOException;

}
