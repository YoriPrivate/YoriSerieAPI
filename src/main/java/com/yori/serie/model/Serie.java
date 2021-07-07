package com.yori.serie.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Serie {

	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String nameSerie;
	
	@ManyToMany(targetEntity = Categorie.class, mappedBy = "series", cascade = CascadeType.ALL)
	private List<Categorie> categories;
	
	public Serie() {
		
	}
	
	public Serie(String name) {
		this.nameSerie = name;
	}
	
	public Serie(String name, List<Categorie> categories) {
		this.nameSerie = name;
		this.categories = categories;
	}

	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}

	public String getNameSerie() {
		return nameSerie;
	}

	public void setNameSerie(String nameSerie) {
		this.nameSerie = nameSerie;
	}

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}
	
}
