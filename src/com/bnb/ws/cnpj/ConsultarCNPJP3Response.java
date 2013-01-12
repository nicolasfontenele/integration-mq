
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
 *         &lt;element name="ConsultarCNPJP3Result" type="{http://cnpj.infoconv.s255.bnb.gov.br/}ArrayOfBNBCNPJPerfil3" minOccurs="0"/>
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
    "consultarCNPJP3Result"
})
@XmlRootElement(name = "ConsultarCNPJP3Response")
public class ConsultarCNPJP3Response {

    @XmlElement(name = "ConsultarCNPJP3Result")
    protected ArrayOfBNBCNPJPerfil3 consultarCNPJP3Result;

    /**
     * Obtém o valor da propriedade consultarCNPJP3Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBNBCNPJPerfil3 }
     *     
     */
    public ArrayOfBNBCNPJPerfil3 getConsultarCNPJP3Result() {
        return consultarCNPJP3Result;
    }

    /**
     * Define o valor da propriedade consultarCNPJP3Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBNBCNPJPerfil3 }
     *     
     */
    public void setConsultarCNPJP3Result(ArrayOfBNBCNPJPerfil3 value) {
        this.consultarCNPJP3Result = value;
    }

}
