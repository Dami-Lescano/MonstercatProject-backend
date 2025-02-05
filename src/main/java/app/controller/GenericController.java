package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import app.service.GenericService;

public abstract class GenericController<T> {

    protected GenericService<T> service;
	
    @Autowired
	protected GenericController(GenericService<T> service) {
		this.service = service;
	}
    
    @GetMapping
	public ResponseEntity<List<T>> getAll() {
		List<T> list = this.service.findAll();

		return ResponseEntity.ok(list);
	}
    
    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable Integer id) {
		T entity = this.service.findById(id);
		
		return ResponseEntity.ok(entity);
	}
    
    @PostMapping
    public ResponseEntity<String> create(@RequestBody T entity) {
    	this.service.save(entity);
        
        return ResponseEntity.ok("Created");
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody T entity) {
    	this.service.update(entity);
    	// TODO: pasar id por pathvariabley usar dto
		return ResponseEntity.ok("Updated");
    }

    @DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		this.service.deleteById(id);

		return ResponseEntity.ok("Deleted");
	}
}