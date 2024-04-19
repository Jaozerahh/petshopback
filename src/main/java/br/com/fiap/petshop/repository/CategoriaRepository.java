package br.com.fiap.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.petshop.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {


}
