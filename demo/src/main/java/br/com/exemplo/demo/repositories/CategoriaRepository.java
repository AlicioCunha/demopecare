package br.com.exemplo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exemplo.demo.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
	/** 
	 * todos os metodos de crud
	 */
}
