package br.com.globality.gam.engine.common.type;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "EmailEnvelopeType", namespace = "http://www.globality.com.br/gam/engine/common/type")
@XmlType(name = "EmailEnvelopeType", namespace = "http://www.globality.com.br/gam/engine/common/type")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmailEnvelopeType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6843382896407033259L;

	@XmlElement(name = "transacaoPassoId", required = true)
	private Long idTansacaoPasso;
	
	@XmlElement(name = "Destinatario", required = true)
	private String destinatario;
	
	@XmlElement(name = "GAMEnvelopeType", required = true)
	private GAMEnvelopeType gamEnvelope;
	
	@XmlElement(name = "acao", required = true)
	private int acao;
	
	public Long getIdTansacaoPasso() {
		return idTansacaoPasso;
	}

	public void setIdTansacaoPasso(Long idTansacaoPasso) {
		this.idTansacaoPasso = idTansacaoPasso;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public GAMEnvelopeType getGamEnvelope() {
		return gamEnvelope;
	}

	public void setGamEnvelope(GAMEnvelopeType gamEnvelope) {
		this.gamEnvelope = gamEnvelope;
	}

	public int getAcao() {
		return acao;
	}

	public void setAcao(int acao) {
		this.acao = acao;
	}
	
}
