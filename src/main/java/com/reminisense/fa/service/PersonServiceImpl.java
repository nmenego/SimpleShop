package com.reminisense.fa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reminisense.fa.dao.PersonDAO;
import com.reminisense.fa.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	public void addPerson(Person p) {
		this.personDAO.addPerson(p);
	}

	@Override
	public void updatePerson(Person p) {
		this.personDAO.updatePerson(p);
	}

	@Override
	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}

	@Override
	public Person getPersonById(int id) {
		return this.personDAO.getPersonById(id);
	}

	@Override
	public void removePerson(int id) {
		this.personDAO.removePerson(id);
	}

}
