
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
 *         &lt;element name="ConsultarCPFP3Result" type="{http://cpf.infoconv.s255.bnb.gov.br/}ArrayOfBNBPessoaPerfil3" minOccurs="0"/>
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
    "consultarCPFP3Result"
})
@XmlRootElement(name = "ConsultarCPFP3Response")
public class ConsultarCPFP3Response {

    @XmlElement(name = "ConsultarCPFP3Result")
    protected ArrayOfBNBPessoaPerfil3 consultarCPFP3Result;

    /**
     * Obtém o valor da propriedade consultarCPFP3Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBNBPessoaPerfil3 }
     *     
     */
    public ArrayOfBNBPessoaPerfil3 getConsultarCPFP3Result() {
        return consultarCPFP3Result;
    }

    /**
     * Define o valor da propriedade consultarCPFP3Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBNBPessoaPerfil3 }
     *     
     */
    public void setConsultarCPFP3Result(ArrayOfBNBPessoaPerfil3 value) {
        this.consultarCPFP3Result = value;
    }

}
