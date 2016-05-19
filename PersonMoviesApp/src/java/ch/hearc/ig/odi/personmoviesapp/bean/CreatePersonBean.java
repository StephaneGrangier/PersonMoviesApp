/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personmoviesapp.bean;

import ch.hearc.ig.odi.personmoviesapp.business.Movie;
import ch.hearc.ig.odi.personmoviesapp.exception.PersonException;
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
@Named(value = "createPersonBean")
@RequestScoped
public class CreatePersonBean {

    @Inject
    Services services;

    private Long id;
    private String firstName;
    private String lastName;

    /**
     * Creates a new instance of CreatePersonBean
     */
    public CreatePersonBean() {
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
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

    public String savePerson() throws PersonException {
        String result;
        Movie movieTrouve = services.getMoviesList().get(id.intValue());
        if (movieTrouve == null) {
            services.addPeople(id, firstName, lastName);
            result = "Success";

        } else {
            throw new PersonException("Error, the person already exist.");
        }
        return result;
    }

}
