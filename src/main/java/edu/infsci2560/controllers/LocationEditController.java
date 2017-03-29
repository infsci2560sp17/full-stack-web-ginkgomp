package edu.infsci2560.controllers;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import edu.infsci2560.models.Location;
import edu.infsci2560.repositories.LocationRepository;


@Controller
public class LocationEditController {
	

	@Autowired
    private LocationRepository repository;
	
	@RequestMapping(value = "locations/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        Location location = repository.findOne(id);
        return new ModelAndView("locationEdit", "location", location);
    }
    
    @RequestMapping(value = "locations/edit/{id}", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public String update( @Valid Location location, BindingResult result) {
        repository.save(location);
        return "redirect:/locations";
    }        

}
