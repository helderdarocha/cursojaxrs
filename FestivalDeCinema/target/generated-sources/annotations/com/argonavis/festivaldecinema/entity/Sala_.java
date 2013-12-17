package com.argonavis.festivaldecinema.entity;

import com.argonavis.festivaldecinema.entity.Assento;
import com.argonavis.festivaldecinema.entity.Exibicao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2013-12-11T08:39:19")
@StaticMetamodel(Sala.class)
public class Sala_ { 

    public static volatile ListAttribute<Sala, Assento> assentos;
    public static volatile SingularAttribute<Sala, String> nome;
    public static volatile SingularAttribute<Sala, Integer> lotacao;
    public static volatile ListAttribute<Sala, Exibicao> exibicoes;
    public static volatile SingularAttribute<Sala, Long> id;

}