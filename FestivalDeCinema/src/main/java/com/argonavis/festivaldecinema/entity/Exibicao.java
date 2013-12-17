/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.argonavis.festivaldecinema.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author helderdarocha
 */
@Entity
@XmlRootElement
public class Exibicao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dataExibicao;
    private String horaExibicao;
    private long duracao;
    @ManyToOne(cascade = CascadeType.ALL)
    private Filme filme;
    @ManyToOne(cascade = CascadeType.ALL)
    private Sala salaExibicao;

    public Sala getSalaExibicao() {
        return salaExibicao;
    }

    public void setSalaExibicao(Sala salaExibicao) {
        this.salaExibicao = salaExibicao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }


    public long getDuracao() {
        return duracao;
    }

    public void setDuracao(long duracao) {
        this.duracao = duracao;
    }
    
    public String getHoraExibicao() {
        return horaExibicao;
    }

    public void setHoraExibicao(String horaExibicao) {
        this.horaExibicao = horaExibicao;
    }

    public String getDataExibicao() {
        return dataExibicao;
    }

    public void setDataExibicao(String dataExibicao) {
        this.dataExibicao = dataExibicao;
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
        if (!(object instanceof Exibicao)) {
            return false;
        }
        Exibicao other = (Exibicao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.argonavis.festivaldecinema.Exibicao[ id=" + id + " ]";
    }
    
}
