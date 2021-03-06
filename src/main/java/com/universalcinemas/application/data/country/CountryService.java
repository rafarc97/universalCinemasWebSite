package com.universalcinemas.application.data.country;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;

@Service
public class CountryService extends CrudService<Country, Integer>{
	
	private CountryRepository countryRepository;
	
	public CountryService(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	
	
	public Collection<Country> findAll() {
		return countryRepository.findAll();
	}


	@Override
	protected JpaRepository<Country, Integer> getRepository() {
		return countryRepository;
	}


	public Optional<Country> findByName(String name) {
		return countryRepository.findByName(name);
	}

}
