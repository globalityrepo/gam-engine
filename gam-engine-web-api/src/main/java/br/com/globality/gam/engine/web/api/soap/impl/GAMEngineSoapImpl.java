package br.com.globality.gam.engine.web.api.soap.impl;

import javax.inject.Inject;
import javax.jws.WebService;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;

import com.ibm.mq.MQException;
import com.ibm.mq.MQQueueManager;

import br.com.globality.gam.engine.common.type.GAMEnvelopeType;
import br.com.globality.gam.engine.common.type.fault.AddEventMessageFault;
import br.com.globality.gam.engine.common.type.request.AddEventToNewStepRequest;
import br.com.globality.gam.engine.common.type.request.AddEventToNewTransactionRequest;
import br.com.globality.gam.engine.common.type.request.AddEventToStepRequest;
import br.com.globality.gam.engine.common.type.response.AddEventResponse;
import br.com.globality.gam.engine.common.util.CommonUtils;
import br.com.globality.gam.engine.web.api.soap.GAMEngineSoap;

@WebService(
	name = "GAMPortType", 
	portName = "GAMPort", 
	serviceName = "GAMService", 
	endpointInterface = "br.com.globality.gam.engine.web.api.soap.GAMEngineSoap"
)
//@HandlerChain(file="/handler-chain.xml")
public class GAMEngineSoapImpl implements GAMEngineSoap {

	@Inject
	private Logger log;
	
	public static final String TOPIC_NAME  = "GAMTOPIC";
	
	public AddEventResponse addEventToNewStep(
			AddEventToNewStepRequest addEventToNewStepRequest) throws AddEventMessageFault {
		MQQueueManager queueManager = null;
		try {
			//TODO IMPLEMENTAR VALIDAÇÃO DE CAMPOS OBRITATÓRIOS E DATA TYPES.
			// Populando objeto para envio ao listener.
			GAMEnvelopeType env = new GAMEnvelopeType();
			BeanUtils.copyProperties(env, addEventToNewStepRequest);
			env.setTrxStpInstIdentifier(CommonUtils.generateUUID());
			env.setTrxEventInstIdentifier(CommonUtils.generateUUID());
			
			// Definindo o response.
			AddEventResponse response = new AddEventResponse();
			response.setTrxInstIdentifier(env.getTrxInstIdentifier());
			response.setTrxStpInstIdentifier(env.getTrxStpInstIdentifier());
			response.setTrxEventInstIdentifier(env.getTrxEventInstIdentifier());
			
			// Convertendo o envelope para o formato XML.
			String xml = CommonUtils.convertObjToXml(env, GAMEnvelopeType.class);
			
			// Publicando o XML no Tópico MQ.
			queueManager = CommonUtils.initQueueManager();
			CommonUtils.writeTopicMQ(queueManager, TOPIC_NAME, xml);
			
			return response;
		}
		catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AddEventMessageFault(e);
		}	
		finally {
			try {
				if (queueManager!=null)
					queueManager.disconnect();
			}
			catch (MQException e) {
				log.error(e.getMessage(), e);
				throw new AddEventMessageFault(e);
			}
		}
	}

	public AddEventResponse addEventToStep(
			AddEventToStepRequest addEventToStepRequest) throws AddEventMessageFault {
		MQQueueManager queueManager = null;
		try {
			//TODO IMPLEMENTAR VALIDAÇÃO DE CAMPOS OBRITATÓRIOS E DATA TYPES.
			// Populando objeto para envio ao listener.
			GAMEnvelopeType env = new GAMEnvelopeType();
			BeanUtils.copyProperties(env, addEventToStepRequest);
			env.setTrxEventInstIdentifier(CommonUtils.generateUUID());
			
			// Definindo o response.
			AddEventResponse response = new AddEventResponse();
			response.setTrxInstIdentifier(env.getTrxInstIdentifier());
			response.setTrxStpInstIdentifier(env.getTrxStpInstIdentifier());
			response.setTrxEventInstIdentifier(env.getTrxEventInstIdentifier());
			
			// Convertendo o envelope para o formato XML.
			String xml = CommonUtils.convertObjToXml(env, GAMEnvelopeType.class);
			
			// Publicando o XML no Tópico MQ.
			queueManager = CommonUtils.initQueueManager();
			CommonUtils.writeTopicMQ(queueManager, TOPIC_NAME, xml);
			
			return response;
		}
		catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AddEventMessageFault(e);
		}	
		finally {
			try {
				if (queueManager!=null)
					queueManager.disconnect();
			}
			catch (MQException e) {
				log.error(e.getMessage(), e);
				throw new AddEventMessageFault(e);
			}
		}
	}

	public AddEventResponse addEventToNewTransaction(
			AddEventToNewTransactionRequest addEventToNewTransactionRequest) 
					throws AddEventMessageFault {
		MQQueueManager queueManager = null;
		try {
			//TODO IMPLEMENTAR VALIDAÇÃO DE CAMPOS OBRITATÓRIOS E DATA TYPES.
			// Populando objeto para envio ao listener.
			GAMEnvelopeType env = new GAMEnvelopeType();
			BeanUtils.copyProperties(env, addEventToNewTransactionRequest);
			env.setTrxInstIdentifier(CommonUtils.generateUUID());
			env.setTrxStpInstIdentifier(CommonUtils.generateUUID());
			env.setTrxEventInstIdentifier(CommonUtils.generateUUID());
			
			// Definindo o response.
			AddEventResponse response = new AddEventResponse();
			response.setTrxInstIdentifier(env.getTrxInstIdentifier());
			response.setTrxStpInstIdentifier(env.getTrxStpInstIdentifier());
			response.setTrxEventInstIdentifier(env.getTrxEventInstIdentifier());
			
			// Convertendo o envelope para o formato XML.
			String xml = CommonUtils.convertObjToXml(env, GAMEnvelopeType.class);
			
			// Publicando o XML no Tópico MQ.
			queueManager = CommonUtils.initQueueManager();
			CommonUtils.writeTopicMQ(queueManager, TOPIC_NAME, xml);
			
			return response;
		}
		catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AddEventMessageFault(e);
		}	
		finally {
			try {
				if (queueManager!=null)
					queueManager.disconnect();
			}
			catch (MQException e) {
				log.error(e.getMessage(), e);
				throw new AddEventMessageFault(e);
			}
		}
	}

}
