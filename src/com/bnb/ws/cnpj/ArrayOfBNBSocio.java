
package com.bnb.ws.cnpj;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfBNBSocio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBNBSocio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BNBSocio" type="{http://cnpj.infoconv.s255.bnb.gov.br/}BNBSocio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBNBSocio", propOrder = {
    "bnbSocio"
})
public class ArrayOfBNBSocio {

    @XmlElement(name = "BNBSocio", nillable = true)
    protected List<BNBSocio> bnbSocio;

    /**
     * Gets the value of the bnbSocio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bnbSocio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBNBSocio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BNBSocio }
     * 
     * 
     */
    public List<BNBSocio> getBNBSocio() {
        if (bnbSocio == null) {
            bnbSocio = new ArrayList<BNBSocio>();
        }
        return this.bnbSocio;
    }

}
