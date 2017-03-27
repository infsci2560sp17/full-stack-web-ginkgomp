package edu.infsci2560.controllers;

import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import edu.infsci2560.models.Location;
import edu.infsci2560.repositories.LocationRepository;


@Controller
public class LocationUpdateController {
	

	@Autowired
    private LocationRepository repository;
	
	@RequestMapping(value = "locations/update/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        Location location = repository.findOne(id);
        return new ModelAndView("locationsUpdate", "location", location);
    }
    
    @RequestMapping(value = "locations/update/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
	@Transactional
	public void update(@RequestBody Location updatedlocation, @PathVariable("id") long id) throws IOException {
		if (id != updatedlocation.getId()) {
			repository.delete(id);
		}
		repository.save(updatedlocation);
	}

}
