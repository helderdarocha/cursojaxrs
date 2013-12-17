
package com.argonavis.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.argonavis.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exibicao_QNAME = new QName("", "exibicao");
    private final static QName _Sala_QNAME = new QName("", "sala");
    private final static QName _Assento_QNAME = new QName("", "assento");
    private final static QName _Filme_QNAME = new QName("", "filme");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.argonavis.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sala }
     * 
     */
    public Sala createSala() {
        return new Sala();
    }

    /**
     * Create an instance of {@link Exibicao }
     * 
     */
    public Exibicao createExibicao() {
        return new Exibicao();
    }

    /**
     * Create an instance of {@link Assento }
     * 
     */
    public Assento createAssento() {
        return new Assento();
    }

    /**
     * Create an instance of {@link Filme }
     * 
     */
    public Filme createFilme() {
        return new Filme();
    }

    /**
     * Create an instance of {@link Sala.Assentos }
     * 
     */
    public Sala.Assentos createSalaAssentos() {
        return new Sala.Assentos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exibicao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exibicao")
    public JAXBElement<Exibicao> createExibicao(Exibicao value) {
        return new JAXBElement<Exibicao>(_Exibicao_QNAME, Exibicao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sala }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sala")
    public JAXBElement<Sala> createSala(Sala value) {
        return new JAXBElement<Sala>(_Sala_QNAME, Sala.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Assento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "assento")
    public JAXBElement<Assento> createAssento(Assento value) {
        return new JAXBElement<Assento>(_Assento_QNAME, Assento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filme")
    public JAXBElement<Filme> createFilme(Filme value) {
        return new JAXBElement<Filme>(_Filme_QNAME, Filme.class, null, value);
    }

}
