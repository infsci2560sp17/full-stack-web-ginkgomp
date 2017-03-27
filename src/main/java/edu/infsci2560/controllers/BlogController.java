package edu.infsci2560.controllers;

import edu.infsci2560.models.Blog;
import edu.infsci2560.models.Friend;
import edu.infsci2560.repositories.BlogRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
public class BlogController {
    @Autowired
    private BlogRepository repository;

    @RequestMapping(value = "blogs", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("blogs", "blogs", repository.findAll());
    }

    @RequestMapping(value = "blogs/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Blog blog, BindingResult result) {
        repository.save(blog);
        return new ModelAndView("blogs", "blogs", repository.findAll());
    }
    
    @RequestMapping(value = "blogs/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam(value="id", required=true) Long id) {
        Blog blog = repository.findOne(id);  
        if ( blog != null ) {
            repository.delete(id);
        }
        return new ModelAndView("blogs", "blogs", repository.findAll());
    }

}
