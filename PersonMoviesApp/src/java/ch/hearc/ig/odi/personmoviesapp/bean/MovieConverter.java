/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personmoviesapp.bean;

import ch.hearc.ig.odi.personmoviesapp.business.Movie;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author stephane.grangier
 */
@FacesConverter(forClass=MovieConverter.class, value="movieConverter")
public class MovieConverter implements Converter {

    public Object getAsObject(FacesContext context, UIComponent component,
            String value) {
        return null;
    }

    public String getAsString(FacesContext context, UIComponent component,
            Object value) {
        Movie movie = (Movie) value;
        return movie.getName();
    }
}


