package com.yori.serie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yori.serie.model.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
