
package br.com.pedcrm.soapClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getProduto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getProduto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProduto", propOrder = {
    "nomeProduto"
})
public class GetProduto {

    protected String nomeProduto;

    /**
     * Obtém o valor da propriedade nomeProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Define o valor da propriedade nomeProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProduto(String value) {
        this.nomeProduto = value;
    }

}
