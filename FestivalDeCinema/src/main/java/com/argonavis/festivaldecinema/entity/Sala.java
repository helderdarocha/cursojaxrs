/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.argonavis.festivaldecinema.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author helderdarocha
 */
@Entity
@XmlRootElement
public class Sala implements Serializable {
    @OneToMany(mappedBy = "salaExibicao", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Exibicao> exibicoes;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @XmlTransient 
    private List<Assento> assentos;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;
    private int lotacao;

    public List<Exibicao> getExibicoes() {
        return exibicoes;
    }

    public void setExibicoes(List<Exibicao> exibicoes) {
        this.exibicoes = exibicoes;
    }

    @XmlElementWrapper
    @XmlElement(name="assento")
    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }


    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.argonavis.festivaldecinema.Sala[ id=" + id + " ]";
    }
    
}
