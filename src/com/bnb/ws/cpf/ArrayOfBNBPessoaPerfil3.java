
package com.bnb.ws.cpf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfBNBPessoaPerfil3 complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBNBPessoaPerfil3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PessoaPerfil3" type="{http://cpf.infoconv.s255.bnb.gov.br/}BNBPessoaPerfil3" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBNBPessoaPerfil3", propOrder = {
    "pessoaPerfil3"
})
public class ArrayOfBNBPessoaPerfil3 {

    @XmlElement(name = "PessoaPerfil3", nillable = true)
    protected List<BNBPessoaPerfil3> pessoaPerfil3;

    /**
     * Gets the value of the pessoaPerfil3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoaPerfil3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoaPerfil3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BNBPessoaPerfil3 }
     * 
     * 
     */
    public List<BNBPessoaPerfil3> getPessoaPerfil3() {
        if (pessoaPerfil3 == null) {
            pessoaPerfil3 = new ArrayList<BNBPessoaPerfil3>();
        }
        return this.pessoaPerfil3;
    }

}
