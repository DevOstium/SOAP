package controllers;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//Endereco : http://localhost:8080/SOAP-SERVER/ProdutoController?WSDL

@WebService
public class ProdutoController {

	@WebMethod
	public String getProduto(
							  @WebParam(name="nomeProduto") String nomeProduto 
							) {
		return "Dados Vindos do Servidor SOAP - com o Parametro do client Spring Boot : " + nomeProduto;
	}

}
