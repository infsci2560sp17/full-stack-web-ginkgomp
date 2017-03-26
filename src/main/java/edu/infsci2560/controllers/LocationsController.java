/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Location;
import edu.infsci2560.repositories.LocationRepository;

import java.io.IOException;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Wenwen Sun
 */
@Controller
public class LocationsController {
    @Autowired
    private LocationRepository repository;

    @RequestMapping(value = "locations", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("locations", "locations", repository.findAll());
    }

    @RequestMapping(value = "locations/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Location location, BindingResult result) {
        repository.save(location);
        return new ModelAndView("locations", "locations", repository.findAll());
    }

    @RequestMapping(value = "locations/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") long id) {
    	repository.delete(id);

	}
    
    @RequestMapping(value = "locations/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
	@Transactional
	public void update(@RequestBody Location updatedlocation, @PathVariable("id") long id) throws IOException {
		if (id != updatedlocation.getId()) {
			repository.delete(id);
		}
		repository.save(updatedlocation);
	}
}
