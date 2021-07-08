package com.yori.serie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yori.serie.model.Serie;
import com.yori.serie.repository.SerieRepository;

import lombok.Data;

@Data
@Service
public class SerieService {
	
	@Autowired
	private SerieRepository serieRepo;
	
	public Iterable<Serie> getSeries() {
		return serieRepo.findAll();
	}

	public Serie saveSerie(Serie serie) {
		Serie savedSerie = serieRepo.save(serie);
		serie.setNameSerie(serie.getNameSerie());
		serie.setNbSaison(serie.getNbSaison());
		serie.setCategories(serie.getCategories());
		return savedSerie;
	}
}
