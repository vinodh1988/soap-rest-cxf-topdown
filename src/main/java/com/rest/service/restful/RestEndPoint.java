package com.rest.service.restful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.service.generated.Person;
import com.rest.service.repository.PeopleRepository;

@RestController
@RequestMapping("/api")
public class RestEndPoint {
	@Autowired
	PeopleRepository prepo;
	
    @RequestMapping("/people")
    public List<Person> getPeople(){
    	return prepo.findAll();
    }
    
    @PostMapping("/people")
    public ResponseEntity<Person> addPerson(@RequestBody Person person){
    	try {
    		prepo.save(person);
    		return new ResponseEntity<Person>(person,HttpStatus.CREATED);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		return new ResponseEntity<Person>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }
}
