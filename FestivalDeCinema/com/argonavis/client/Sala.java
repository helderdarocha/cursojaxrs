
package com.argonavis.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sala complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sala">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assentos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}assento" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exibicoes" type="{}exibicao" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lotacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sala", propOrder = {
    "assentos",
    "exibicoes",
    "id",
    "lotacao",
    "nome"
})
public class Sala {

    protected Sala.Assentos assentos;
    @XmlElement(nillable = true)
    protected List<Exibicao> exibicoes;
    protected Long id;
    protected int lotacao;
    protected String nome;

    /**
     * Gets the value of the assentos property.
     * 
     * @return
     *     possible object is
     *     {@link Sala.Assentos }
     *     
     */
    public Sala.Assentos getAssentos() {
        return assentos;
    }

    /**
     * Sets the value of the assentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sala.Assentos }
     *     
     */
    public void setAssentos(Sala.Assentos value) {
        this.assentos = value;
    }

    /**
     * Gets the value of the exibicoes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exibicoes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExibicoes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exibicao }
     * 
     * 
     */
    public List<Exibicao> getExibicoes() {
        if (exibicoes == null) {
            exibicoes = new ArrayList<Exibicao>();
        }
        return this.exibicoes;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the lotacao property.
     * 
     */
    public int getLotacao() {
        return lotacao;
    }

    /**
     * Sets the value of the lotacao property.
     * 
     */
    public void setLotacao(int value) {
        this.lotacao = value;
    }

    /**
     * Gets the value of the nome property.
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
     * Sets the value of the nome property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}assento" maxOccurs="unbounded" minOccurs="0"/>
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
        "assento"
    })
    public static class Assentos {

        protected List<Assento> assento;

        /**
         * Gets the value of the assento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Assento }
         * 
         * 
         */
        public List<Assento> getAssento() {
            if (assento == null) {
                assento = new ArrayList<Assento>();
            }
            return this.assento;
        }

    }

}
