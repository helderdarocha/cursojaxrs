package com.argonavis.festivaldecinema.entity;

import com.argonavis.festivaldecinema.entity.Filme;
import com.argonavis.festivaldecinema.entity.Sala;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2013-12-11T08:39:19")
@StaticMetamodel(Exibicao.class)
public class Exibicao_ { 

    public static volatile SingularAttribute<Exibicao, Sala> salaExibicao;
    public static volatile SingularAttribute<Exibicao, Long> id;
    public static volatile SingularAttribute<Exibicao, Long> duracao;
    public static volatile SingularAttribute<Exibicao, String> horaExibicao;
    public static volatile SingularAttribute<Exibicao, String> dataExibicao;
    public static volatile SingularAttribute<Exibicao, Filme> filme;

}