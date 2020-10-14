package com.rest.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.service.generated.Person;

public interface PeopleRepository extends JpaRepository<Person,Long> {

}