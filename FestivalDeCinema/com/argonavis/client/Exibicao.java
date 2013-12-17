
package com.argonavis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exibicao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exibicao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataExibicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duracao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{}filme" minOccurs="0"/>
 *         &lt;element name="horaExibicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="salaExibicao" type="{}sala" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exibicao", propOrder = {
    "dataExibicao",
    "duracao",
    "filme",
    "horaExibicao",
    "id",
    "salaExibicao"
})
public class Exibicao {

    protected String dataExibicao;
    protected long duracao;
    protected Filme filme;
    protected String horaExibicao;
    protected Long id;
    protected Sala salaExibicao;

    /**
     * Gets the value of the dataExibicao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExibicao() {
        return dataExibicao;
    }

    /**
     * Sets the value of the dataExibicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExibicao(String value) {
        this.dataExibicao = value;
    }

    /**
     * Gets the value of the duracao property.
     * 
     */
    public long getDuracao() {
        return duracao;
    }

    /**
     * Sets the value of the duracao property.
     * 
     */
    public void setDuracao(long value) {
        this.duracao = value;
    }

    /**
     * Gets the value of the filme property.
     * 
     * @return
     *     possible object is
     *     {@link Filme }
     *     
     */
    public Filme getFilme() {
        return filme;
    }

    /**
     * Sets the value of the filme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filme }
     *     
     */
    public void setFilme(Filme value) {
        this.filme = value;
    }

    /**
     * Gets the value of the horaExibicao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraExibicao() {
        return horaExibicao;
    }

    /**
     * Sets the value of the horaExibicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraExibicao(String value) {
        this.horaExibicao = value;
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
     * Gets the value of the salaExibicao property.
     * 
     * @return
     *     possible object is
     *     {@link Sala }
     *     
     */
    public Sala getSalaExibicao() {
        return salaExibicao;
    }

    /**
     * Sets the value of the salaExibicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sala }
     *     
     */
    public void setSalaExibicao(Sala value) {
        this.salaExibicao = value;
    }

}
