package com.argonavis.festivaldecinema.entity;

import com.argonavis.festivaldecinema.entity.Exibicao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2013-12-11T08:39:19")
@StaticMetamodel(Filme.class)
public class Filme_ { 

    public static volatile SingularAttribute<Filme, Long> ano;
    public static volatile SingularAttribute<Filme, String> imdb;
    public static volatile SingularAttribute<Filme, String> titulo;
    public static volatile SingularAttribute<Filme, Long> id;
    public static volatile SingularAttribute<Filme, Long> duracao;
    public static volatile ListAttribute<Filme, Exibicao> exibicoes;
    public static volatile SingularAttribute<Filme, String> diretor;

}