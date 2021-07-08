package com.yori.serie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yori.serie.model.Categorie;
import com.yori.serie.model.Serie;
import com.yori.serie.repository.CategorieRepository;
import com.yori.serie.service.CategorieService;

@RestController
@RequestMapping(path="/categorie")
@CrossOrigin(origins="http://localhost:4200")
public class CategorieController {
	
	@Autowired
	private CategorieService categService;
	
	@PostMapping("/addCategorie")
	public ResponseEntity<Categorie> saveCateg(@RequestBody Categorie categ) {
		Categorie addCateg = categService.saveCategorie(categ);
		return new ResponseEntity<Categorie>(addCateg, HttpStatus.CREATED);
	}	
	
	@GetMapping(path="/all")
	public Iterable<Categorie> getCategories() {
		return categService.getCategories();
	}

}
