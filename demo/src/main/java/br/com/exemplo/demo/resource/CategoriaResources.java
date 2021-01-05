package br.com.exemplo.demo.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.demo.model.Categoria;
import br.com.exemplo.demo.repositories.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaResources {

	@Autowired
	CategoriaRepository categoriaRepository;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Categoria categoria) {
		categoriaRepository.save(categoria);
	}
	
	@GetMapping 
	public List<Categoria> listaTudo(){
		return categoriaRepository.findAll();
	}
	
	@PutMapping
	public void alterar(@RequestBody Categoria categoria) {
		//categoriaRepository.
	}
	
	@DeleteMapping
	public void excluir(@RequestBody Categoria categoria) {
		categoriaRepository.deleteById(categoria.getId());
	}
}
