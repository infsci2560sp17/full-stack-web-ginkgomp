package edu.infsci2560.controllers;

import edu.infsci2560.models.Friend;
import edu.infsci2560.repositories.FriendRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Wenwen Sun
 */
@Controller
public class FriendController {
    @Autowired
    private FriendRepository repository;

    @RequestMapping(value = "friends", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("friends", "friends", repository.findAll());
    }
    
    @RequestMapping(value = "friends/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {        
        return new ModelAndView("friends", "friends", repository.findOne(id));
    }

    @RequestMapping(value = "friends/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Friend friend, BindingResult result) {
        repository.save(friend);
        return new ModelAndView("friends", "friends", repository.findAll());
    }
    
    @RequestMapping(value = "friends/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam(value="id", required=true) Long id) {
        Friend friend = repository.findOne(id);  
        if ( friend != null ) {
            repository.delete(id);
        }
        return new ModelAndView("friends", "friends", repository.findAll());
    }
    
    
    

}
