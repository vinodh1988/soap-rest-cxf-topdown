package com.rest.service.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.service.generated.CreatePersonRequest;
import com.rest.service.generated.CreatePersonResponse;
import com.rest.service.generated.GetPeopleRequest;
import com.rest.service.generated.GetPeopleResponse;
import com.rest.service.generated.Myservice;
import com.rest.service.generated.People;
import com.rest.service.generated.Person;
import com.rest.service.repository.PeopleRepository;

@Service
public class MyServiceImpl implements Myservice {

	@Autowired
	PeopleRepository prepo;
	
	@Override
	public CreatePersonResponse createPerson(CreatePersonRequest createrequest) {
		// TODO Auto-generated method stub
		Person p=createrequest.getPerson();
		prepo.save(p);
		CreatePersonResponse response=new CreatePersonResponse();
		response.setResult(true);;
		return response;
	}

	@Override
	public GetPeopleResponse getPeople(GetPeopleRequest getrequest) {
		// TODO Auto-generated method stub
		int age = getrequest.getAge();
		List<Person> people=prepo.findPeople(age);
		People p=new People();
		p.setPerson(people);
		GetPeopleResponse response= new GetPeopleResponse();
		response.setPeople(p);
		return response;
	}

}
