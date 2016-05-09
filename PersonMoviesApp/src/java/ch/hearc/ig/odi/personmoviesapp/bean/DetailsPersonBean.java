/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personmoviesapp.bean;

import ch.hearc.ig.odi.personmoviesapp.business.Movie;
import ch.hearc.ig.odi.personmoviesapp.business.Person;
import ch.hearc.ig.odi.personmoviesapp.service.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "detailsPersonBean")
@RequestScoped

public class DetailsPersonBean {
    
    @Inject Services services;
    private Person person;

    /**
     * Creates a new instance of DetailsPersonBean
     */
    public DetailsPersonBean() {
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public String recupPerson(Person person){
        if (person == null){
            return "fail";
        } else {
            this.person = person;
            return "Success";
        }
    }
    
    /**
     * Permet d'afficher les films vu par la personne récupérer dans le bean
     */
    public List<Movie> getMovies (){
        //List<Movie> movies = new ArrayList<Movie>();
        return person.getPersonAVue();

    }
    
}
