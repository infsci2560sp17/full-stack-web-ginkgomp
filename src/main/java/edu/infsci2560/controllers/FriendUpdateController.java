package edu.infsci2560.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.infsci2560.models.Friend;
import edu.infsci2560.repositories.FriendRepository;

@Controller
public class FriendUpdateController {
	
	@Autowired
    private FriendRepository repository;
	
	@RequestMapping(value = "friends/update/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        Friend friend = repository.findOne(id);
        return new ModelAndView("friendsUpdate", "friend", friend);
    }
    
    
    @RequestMapping(value = "friends/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    	public String update( @Valid Friend friend, BindingResult result) {
            repository.save(friend);
            return "redirect:/friends";
        }  

}
