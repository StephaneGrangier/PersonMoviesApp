/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personmoviesapp.bean;

import ch.hearc.ig.odi.personmoviesapp.service.Services;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "createMovieBean")
@RequestScoped
public class CreateMovieBean{
    
    
    @Inject Services services;
    private Long id;
    private String name;
    private String producer;

    /**
     * Creates a new instance of CreateMovieBean
     */
    public CreateMovieBean() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

 

        public String saveMovie(){
       String result;
       services.addMovie(id, name, producer);
       result = "Success";
       return result;
    }
    
}
