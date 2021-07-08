package com.yori.serie.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yori.serie.model.Categorie;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Long>{

}
