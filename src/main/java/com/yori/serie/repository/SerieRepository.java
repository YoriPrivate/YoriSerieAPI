package com.yori.serie.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yori.serie.model.Serie;

@Repository
public interface SerieRepository extends CrudRepository<Serie, Long>{

}
