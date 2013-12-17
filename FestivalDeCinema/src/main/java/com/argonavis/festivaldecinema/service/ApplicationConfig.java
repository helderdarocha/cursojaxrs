/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.argonavis.festivaldecinema.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author helderdarocha
 */
@javax.ws.rs.ApplicationPath("webapi")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.argonavis.festivaldecinema.service.AssentoResource.class);
        resources.add(com.argonavis.festivaldecinema.service.ExibicaoResource.class);
        resources.add(com.argonavis.festivaldecinema.service.FilmeResource.class);
        resources.add(com.argonavis.festivaldecinema.service.SalaResource.class);
    }
    
}
