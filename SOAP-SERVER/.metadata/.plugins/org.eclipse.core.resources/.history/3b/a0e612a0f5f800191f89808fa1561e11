package controllers;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class ProdutoController {

	@WebMethod
	public String getProduto(
							  @WebParam(name="nomeProduto") String nomeProduto 
							) {
		return "Dados Vindos do Servidor SOAP - com o Parametro do client Spring Boot : " + nomeProduto;
	}

}
