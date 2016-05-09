/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personmoviesapp.bean;

import ch.hearc.ig.odi.personmoviesapp.business.Movie;
import ch.hearc.ig.odi.personmoviesapp.service.Services;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "listMovieBean")
@RequestScoped
public class ListMovieBean {

   @Inject Services services;
   
    public ListMovieBean() {
    }
    
    public List<Movie> getMovies(){
        List<Movie> listMovies = new ArrayList<Movie>();
        listMovies = services.getMoviesList();
        return listMovies;
    }
    
}
