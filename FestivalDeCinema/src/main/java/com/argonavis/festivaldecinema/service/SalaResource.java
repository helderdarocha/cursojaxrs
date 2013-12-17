/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.argonavis.festivaldecinema.service;

import com.argonavis.festivaldecinema.entity.Sala;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author helderdarocha
 */
@Stateless
@Path("sala")
public class SalaResource extends AbstractResource<Sala> {
    
    @PersistenceContext(unitName = "FestivalDeCinema")
    private EntityManager em;

    public SalaResource() {
        super(Sala.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Sala entity) {
        super.create(entity);
        System.out.println("Assentos: " + entity.getAssentos().size());
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Long id, Sala entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Sala find(@PathParam("id") Long id) {
        return super.find(id);
    }
    
    @GET
    @Path("nome/{nome}")
    @Produces({"application/xml", "application/json"})
    public Sala findByName(@PathParam("nome") String nome) {
        String jpql = "select sala from Sala sala where lower(sala.nome) = :nome";
        Query query = this.getEntityManager().createQuery(jpql);
        query.setParameter("nome", nome.toLowerCase().replace("%20", " "));
        return (Sala)query.getSingleResult();
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Sala> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Sala> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
