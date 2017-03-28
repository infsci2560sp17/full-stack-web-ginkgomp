package edu.infsci2560.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.infsci2560.models.Blog;
import edu.infsci2560.repositories.BlogRepository;

@Controller
public class BlogEditController {

	@Autowired
    private BlogRepository repository;
	
	@RequestMapping(value = "blogs/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) { 
        Blog blog = repository.findOne(id);
        return new ModelAndView("blogEdit", "blog", blog);
    }
    
    
    @RequestMapping(value = "blogs/edit/{id}", method = RequestMethod.PUT, produces = "application/json")
    	public String update( @Valid Blog blog, BindingResult result) {
            repository.save(blog);
            return "redirect:/blogs";
        }  
    

}
