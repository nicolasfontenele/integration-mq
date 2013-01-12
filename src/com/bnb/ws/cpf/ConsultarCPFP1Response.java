
package com.bnb.ws.cpf;

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
 *         &lt;element name="ConsultarCPFP1Result" type="{http://cpf.infoconv.s255.bnb.gov.br/}ArrayOfBNBPessoaPerfil1" minOccurs="0"/>
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
    "consultarCPFP1Result"
})
@XmlRootElement(name = "ConsultarCPFP1Response")
public class ConsultarCPFP1Response {

    @XmlElement(name = "ConsultarCPFP1Result")
    protected ArrayOfBNBPessoaPerfil1 consultarCPFP1Result;

    /**
     * Obtém o valor da propriedade consultarCPFP1Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBNBPessoaPerfil1 }
     *     
     */
    public ArrayOfBNBPessoaPerfil1 getConsultarCPFP1Result() {
        return consultarCPFP1Result;
    }

    /**
     * Define o valor da propriedade consultarCPFP1Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBNBPessoaPerfil1 }
     *     
     */
    public void setConsultarCPFP1Result(ArrayOfBNBPessoaPerfil1 value) {
        this.consultarCPFP1Result = value;
    }

}
