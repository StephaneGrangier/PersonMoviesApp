/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personmoviesapp.bean;

import ch.hearc.ig.odi.personmoviesapp.business.Person;
import ch.hearc.ig.odi.personmoviesapp.service.Services;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author floriane.sapin
 */
@Named(value = "listPersonBean")
@RequestScoped
public class ListPersonBean {
    
    
    @Inject Services services;

    /**
     * Creates a new instance of ListPersonBean
     */
    public ListPersonBean() {
    }
    
    public List<Person> getPeople(){
        return services.getPeopleList();
    }
    
}
