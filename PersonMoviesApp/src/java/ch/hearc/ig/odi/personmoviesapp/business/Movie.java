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
public class Movie {

    private Long id;
    private String name;
    private String producer;
    private List<Person> filmVuPar;

    public Movie() {

    }

    public Movie(Long id, String name, String producer) {
        filmVuPar = new ArrayList<Person>();
        this.id = id;
        this.name = name;
        this.producer = producer;

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

    public List<Person> getFilmVuPar() {
        return filmVuPar;
    }

    public void setFilmVuPar(List<Person> filmVuPar) {
        this.filmVuPar = filmVuPar;
    }

    public Integer filmVuParNbrPerson() {
        return this.filmVuPar.size();
    }

    public void addPerson(Person person) throws DoublonException {
        if (filmVuPar.contains(person)) {
            throw new DoublonException("Error, this movie is already in this list.");
        }
        this.filmVuPar.add(person);

    }

}
