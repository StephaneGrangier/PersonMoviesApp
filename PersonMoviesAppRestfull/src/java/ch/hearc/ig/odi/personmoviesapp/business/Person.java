/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personmoviesapp.business;

import ch.hearc.ig.odi.personmoviesapp.exception.DoublonException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author floriane.sapin
 */
public class Person {



    private Long id;
    private String firstName;
    private String lastName;
    private List<Movie> personAVue;

    public Person() {

    }

    public Person(Long id, String firstname, String lastName) {
        personAVue = new ArrayList<Movie>();
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Movie> getPersonAVue() {
        return personAVue;
    }

    public void setPersonAVue(List<Movie> PersonAVue) {
        this.personAVue = PersonAVue;
    }

    public void addMovie(Movie movie) throws DoublonException {
        if(movie == null){
            throw new NullPointerException("movie is null");
        }
        if (personAVue.contains(movie)) {
            throw new DoublonException("Error, this movie is already in this list.");
        }
        this.personAVue.add(movie);
        movie.addPerson(this);

    }

    public Integer nbrMovies() {
        return this.personAVue.size();
    }

    

}
