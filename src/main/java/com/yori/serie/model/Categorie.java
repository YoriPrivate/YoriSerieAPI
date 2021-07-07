package com.yori.serie.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Categorie {
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameCategorie() {
		return nameCategorie;
	}

	public void setNameCategorie(String nameCategorie) {
		this.nameCategorie = nameCategorie;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

	public Categorie() {
		
	}
	
	public Categorie(String name) {
		this.nameCategorie = name;
	}

	public Categorie(String name, List<Serie> series) {
		this.nameCategorie = name;
		this.series = series;
	}

	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String nameCategorie;
	
	@ManyToMany(targetEntity = Serie.class, cascade = CascadeType.ALL)
	private List<Serie> series;

}
