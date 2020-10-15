package com.rest.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rest.service.generated.Person;

public interface PeopleRepository extends JpaRepository<Person,Long> {
   @Query("from Person where age>=:age")
	public List<Person> findPeople(@Param("age") int age);
}