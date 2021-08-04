package com.emacl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emacl.model.Categoria;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}
