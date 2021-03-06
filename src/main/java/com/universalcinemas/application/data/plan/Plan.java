package com.universalcinemas.application.data.plan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.universalcinemas.application.data.genre.Genre;

@Entity

public class Plan {
	@NotNull
	private String name;
	@NotNull
	private String description;
	@NotNull
	private Integer percent;
	@NotNull
	private Integer price;
	@NotNull
	@ManyToOne
	private Genre genre;
	@Id
	@GeneratedValue
	private Integer id;
	public String getDescription() {return description;}
	public void setDescription(String description) {this.description = description;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Integer getId() {return id;}
	public Integer getPrice() {return price;}
	public void setPrice(Integer price) {this.price = price;}
	public Integer getPercent() {return percent;}
	public void setPercent(Integer percent) {this.percent = percent;}
	public Genre getGenre() {return genre;}
	public void setGenre(Genre genre) {this.genre = genre;}
}
 