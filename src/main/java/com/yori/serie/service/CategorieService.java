package com.yori.serie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yori.serie.model.Categorie;
import com.yori.serie.repository.CategorieRepository;

@Service
public class CategorieService {
	
	@Autowired
	private CategorieRepository cateRepo;
	
	public Iterable<Categorie> getCategories() {
		return cateRepo.findAll();
	}
	
	public Categorie saveCategorie(Categorie categ) {
		Categorie savedCate = cateRepo.save(categ);
		categ.setNameCategorie(categ.getNameCategorie());
		categ.setSeries(categ.getSeries());
		return savedCate;
	}

}
