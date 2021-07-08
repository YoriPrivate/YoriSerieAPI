package com.yori.serie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yori.serie.model.Categorie;
import com.yori.serie.model.Serie;
import com.yori.serie.repository.SerieRepository;
import com.yori.serie.service.SerieService;

@RestController
@RequestMapping(path="/serie")
@CrossOrigin(origins="http://localhost:4200")
public class SerieController {
	
	@Autowired
	private SerieService serieService;
	
	//Get all Series
	@GetMapping("/all")
	public Iterable<Serie> getSeries() {
		return serieService.getSeries();
	}
	
	@PostMapping("/addSerie")
	public ResponseEntity<Serie> saveSerie(@RequestBody Serie serie) {
		Serie addSerie = serieService.saveSerie(serie);
		return new ResponseEntity<Serie>(addSerie, HttpStatus.CREATED);
	}
	
//	@PostMapping("/create")
//	public ResponseEntity<Serie> createSerie(@RequestBody Serie serie) {
//		Serie _serie = serieRepo.save(new Serie(serie.getNameSerie(), serie.getNbSaison()));
//		return new ResponseEntity<Serie>(_serie, HttpStatus.CREATED);
//	}
	


}
