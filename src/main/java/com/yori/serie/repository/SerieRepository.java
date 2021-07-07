package com.yori.serie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yori.serie.model.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long>{

}
