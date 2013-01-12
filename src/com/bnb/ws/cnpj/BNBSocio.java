
package com.bnb.ws.cnpj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BNBSocio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BNBSocio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PercentualParticipacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoPaisOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomePaisOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BNBSocio", propOrder = {
    "tipo",
    "nome",
    "numero",
    "percentualParticipacao",
    "codigoPaisOrigem",
    "nomePaisOrigem"
})
public class BNBSocio {

    @XmlElement(name = "Tipo")
    protected String tipo;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "PercentualParticipacao")
    protected String percentualParticipacao;
    @XmlElement(name = "CodigoPaisOrigem")
    protected String codigoPaisOrigem;
    @XmlElement(name = "NomePaisOrigem")
    protected String nomePaisOrigem;

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade percentualParticipacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentualParticipacao() {
        return percentualParticipacao;
    }

    /**
     * Define o valor da propriedade percentualParticipacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentualParticipacao(String value) {
        this.percentualParticipacao = value;
    }

    /**
     * Obtém o valor da propriedade codigoPaisOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisOrigem() {
        return codigoPaisOrigem;
    }

    /**
     * Define o valor da propriedade codigoPaisOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisOrigem(String value) {
        this.codigoPaisOrigem = value;
    }

    /**
     * Obtém o valor da propriedade nomePaisOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePaisOrigem() {
        return nomePaisOrigem;
    }

    /**
     * Define o valor da propriedade nomePaisOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePaisOrigem(String value) {
        this.nomePaisOrigem = value;
    }

}
