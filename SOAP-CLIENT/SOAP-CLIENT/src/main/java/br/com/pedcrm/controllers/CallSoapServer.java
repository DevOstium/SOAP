package br.com.pedcrm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedcrm.soapClient.ProdutoController;
import br.com.pedcrm.soapClient.ProdutoControllerService;

@RestController
@RequestMapping("/")
public class CallSoapServer {

	@GetMapping
	public String index() {
		
		ProdutoController produtoSOAP = new ProdutoControllerService().getProdutoControllerPort();
		
		String param  = "Laranja";
		
		return produtoSOAP.getProduto(param);
	}

}