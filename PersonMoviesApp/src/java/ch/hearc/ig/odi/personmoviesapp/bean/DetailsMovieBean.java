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
import java.util.Iterator;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "detailsMovieBean")
@RequestScoped
public class DetailsMovieBean {
    
    @Inject Services services;
    private Movie movie;

    /**
     * Creates a new instance of DetailsMovieBean
     */
    public DetailsMovieBean() {
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    public String recupMovie(Movie movie){
        if (movie == null){
            return "fail";
        } else{
            this.movie = movie;
            return "Success";
        }
    }
    
        /**
     * Permet d'afficher les personne qui ont vu le film récupérer dans le bean
     * @return une liste de personne
     * 
     */
    public List<Person> getPersons(){

        return movie.getFilmVuPar();
    }
    
    public void removeMovie(Movie movieDelete){
        services.getMoviesList().remove(movieDelete);
        
        
        for(Person persons : services.getPeopleList()){
            Iterator<Movie> iter = persons.getPersonAVue().iterator();
            while (iter.hasNext()){
                Movie movie = iter.next();
                if(movie == movieDelete){
                    iter.remove();
                }
            }
        }
    }
    
   
       
}
