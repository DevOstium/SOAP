
package br.com.pedcrm.soapClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProdutoController", targetNamespace = "http://controllers/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProdutoController {


    /**
     * 
     * @param nomeProduto
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProduto", targetNamespace = "http://controllers/", className = "br.com.pedcrm.soapClient.GetProduto")
    @ResponseWrapper(localName = "getProdutoResponse", targetNamespace = "http://controllers/", className = "br.com.pedcrm.soapClient.GetProdutoResponse")
    public String getProduto(
        @WebParam(name = "nomeProduto", targetNamespace = "")
        String nomeProduto);

}