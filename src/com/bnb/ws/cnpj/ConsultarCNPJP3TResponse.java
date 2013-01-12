
package com.bnb.ws.cnpj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarCNPJP3TResult" type="{http://cnpj.infoconv.s255.bnb.gov.br/}ArrayOfBNBCNPJPerfil3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarCNPJP3TResult"
})
@XmlRootElement(name = "ConsultarCNPJP3TResponse")
public class ConsultarCNPJP3TResponse {

    @XmlElement(name = "ConsultarCNPJP3TResult")
    protected ArrayOfBNBCNPJPerfil3 consultarCNPJP3TResult;

    /**
     * Obtém o valor da propriedade consultarCNPJP3TResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBNBCNPJPerfil3 }
     *     
     */
    public ArrayOfBNBCNPJPerfil3 getConsultarCNPJP3TResult() {
        return consultarCNPJP3TResult;
    }

    /**
     * Define o valor da propriedade consultarCNPJP3TResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBNBCNPJPerfil3 }
     *     
     */
    public void setConsultarCNPJP3TResult(ArrayOfBNBCNPJPerfil3 value) {
        this.consultarCNPJP3TResult = value;
    }

}
