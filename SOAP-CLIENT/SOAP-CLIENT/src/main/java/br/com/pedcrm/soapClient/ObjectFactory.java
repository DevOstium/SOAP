
package br.com.pedcrm.soapClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.pedcrm.soapClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProdutoResponse_QNAME = new QName("http://controllers/", "getProdutoResponse");
    private final static QName _GetProduto_QNAME = new QName("http://controllers/", "getProduto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.pedcrm.soapClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProdutoResponse }
     * 
     */
    public GetProdutoResponse createGetProdutoResponse() {
        return new GetProdutoResponse();
    }

    /**
     * Create an instance of {@link GetProduto }
     * 
     */
    public GetProduto createGetProduto() {
        return new GetProduto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers/", name = "getProdutoResponse")
    public JAXBElement<GetProdutoResponse> createGetProdutoResponse(GetProdutoResponse value) {
        return new JAXBElement<GetProdutoResponse>(_GetProdutoResponse_QNAME, GetProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers/", name = "getProduto")
    public JAXBElement<GetProduto> createGetProduto(GetProduto value) {
        return new JAXBElement<GetProduto>(_GetProduto_QNAME, GetProduto.class, null, value);
    }

}
