package edu.infsci2560.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.infsci2560.models.Event;
import edu.infsci2560.repositories.EventRepository;

/**
*
* @author Wenwen Sun
*/
@RestController
@RequestMapping("/photos")
public class EventService {

   @Autowired
   private EventRepository repository;

   @RequestMapping(method = RequestMethod.GET, produces = "application/json")
   public ResponseEntity<Iterable<Event>> list() {
       HttpHeaders headers = new HttpHeaders();
       return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
   }

   @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
   public ResponseEntity<Event> list(@PathVariable("id") Long id) {
       HttpHeaders headers = new HttpHeaders();
       return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
   }

  
}
