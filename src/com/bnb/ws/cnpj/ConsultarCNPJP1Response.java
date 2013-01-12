
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
 *         &lt;element name="ConsultarCNPJP1Result" type="{http://cnpj.infoconv.s255.bnb.gov.br/}ArrayOfBNBCNPJPerfil1" minOccurs="0"/>
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
    "consultarCNPJP1Result"
})
@XmlRootElement(name = "ConsultarCNPJP1Response")
public class ConsultarCNPJP1Response {

    @XmlElement(name = "ConsultarCNPJP1Result")
    protected ArrayOfBNBCNPJPerfil1 consultarCNPJP1Result;

    /**
     * Obtém o valor da propriedade consultarCNPJP1Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBNBCNPJPerfil1 }
     *     
     */
    public ArrayOfBNBCNPJPerfil1 getConsultarCNPJP1Result() {
        return consultarCNPJP1Result;
    }

    /**
     * Define o valor da propriedade consultarCNPJP1Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBNBCNPJPerfil1 }
     *     
     */
    public void setConsultarCNPJP1Result(ArrayOfBNBCNPJPerfil1 value) {
        this.consultarCNPJP1Result = value;
    }

}
