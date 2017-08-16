package br.com.globality.gam.engine.web.api.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import br.com.globality.gam.engine.common.type.fault.AddEventMessageFault;
import br.com.globality.gam.engine.common.type.request.AddEventToNewStepRequest;
import br.com.globality.gam.engine.common.type.request.AddEventToNewTransactionRequest;
import br.com.globality.gam.engine.common.type.request.AddEventToStepRequest;
import br.com.globality.gam.engine.common.type.response.AddEventResponse;

@WebService(targetNamespace = "http://www.globality.com.br/gam/engine/soap")
@SOAPBinding(style=Style.RPC, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface GAMEngineSoap {

	@WebMethod(
			operationName = "AddEventToNewStep", 
			action = "http://www.globality.com.br/gam/addevttonewstp"
	)
	public AddEventResponse addEventToNewStep(
			@WebParam(name = "AddEventToNewStepRequest", targetNamespace = "") 
			AddEventToNewStepRequest addEventToNewStepRequest) 
					throws AddEventMessageFault;

	@WebMethod(
			operationName = "AddEventToStep", 
			action = "http://www.globality.com.br/gam/addevttostp"
	)
	public AddEventResponse addEventToStep(
			@WebParam(name = "AddEventToStepRequest", targetNamespace = "") 
			AddEventToStepRequest addEventToStepRequest) 
					throws AddEventMessageFault;

	@WebMethod(
			operationName = "AddEventToNewTransaction", 
			action = "http://www.globality.com.br/gam/addevttonewtra"
	)
	public AddEventResponse addEventToNewTransaction(
			@WebParam(name = "AddEventToNewTransactionRequest", targetNamespace = "") 
			AddEventToNewTransactionRequest addEventToNewTransactionRequest) 
					throws AddEventMessageFault;
	
}
