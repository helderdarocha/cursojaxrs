/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.argonavis.festivaldecinema.service;

import com.argonavis.festivaldecinema.entity.Filme;
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
@Path("filme")
public class FilmeResource extends AbstractResource<Filme> {
    @PersistenceContext(unitName = "FestivalDeCinema")
    private EntityManager em;

    public FilmeResource() {
        super(Filme.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Filme entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Long id, Filme entity) {
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
    public Filme find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Filme> findAll() {
        return super.findAll();
    }
    
    @GET
    @Path("imdb/{imdb}")
    @Produces({"application/xml", "application/json"})
    public Filme findByIMDBCode(@PathParam("imdb") String imdb) {
        String jpql = "select filme from Filme filme where filme.imdb = :imdb";
        Query query = this.getEntityManager().createQuery(jpql);
        query.setParameter("imdb", imdb);
        return (Filme)query.getSingleResult();
    }
    
    @GET
    @Path("diretor/{diretor}")
    @Produces({"application/xml", "application/json"})
    public List<Filme> findByDiretor(@PathParam("diretor") String diretor) {
        String jpql = "select filme from Filme filme where lower(filme.diretor) like :diretor";
        Query query = this.getEntityManager().createQuery(jpql);
        query.setParameter("diretor", "%"+diretor.toLowerCase()+"%");
        return query.getResultList();
    }
    
    @GET
    @Path("titulo/{titulo}")
    @Produces({"application/xml", "application/json"})
    public List<Filme> findByTitulo(@PathParam("titulo") String titulo) {
        String jpql = "select filme from Filme filme where lower(filme.titulo) like :titulo";
        Query query = this.getEntityManager().createQuery(jpql);
        query.setParameter("titulo", "%"+titulo.toLowerCase()+"%");
        return query.getResultList();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Filme> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
