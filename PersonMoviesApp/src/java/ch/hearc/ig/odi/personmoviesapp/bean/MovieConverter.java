/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personmoviesapp.bean;

import ch.hearc.ig.odi.personmoviesapp.business.Movie;
import ch.hearc.ig.odi.personmoviesapp.service.Services;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author stephane.grangier
 */
//JSF -> CDI @FacesConverter(forClass=MovieConverter.class, value="movieConverter")
@Named(value="movieConverter")
@RequestScoped
public class MovieConverter implements Converter {

    @Inject Services services;
    
    public Object getAsObject(FacesContext context, UIComponent component,
            String value) {
        return services.findMovieById(new Long (value));
    }

    public String getAsString(FacesContext context, UIComponent component,
            Object value) {
        Movie movie = (Movie) value;
        return movie.getId().toString();
    }
}


