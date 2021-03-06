package com.universalcinemas.application.data.province;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.universalcinemas.application.data.country.Country;

@Entity

public class Province {
	@NotNull
	private String name;
	
	@NotNull
	@ManyToOne(optional = false)
    private Country country;
	
	@Id
	@GeneratedValue
	private Integer id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
