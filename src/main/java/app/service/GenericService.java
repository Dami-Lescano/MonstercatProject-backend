package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import app.exception.exceptions.EntityNotFoundException;
//import app.exception.exceptions.EntityNotFoundException;
import app.repository.GenericRepository;

public abstract class GenericService<T> {
	
	protected GenericRepository<T> repository;
	
	@Autowired
	protected GenericService(GenericRepository<T> repository) {
		this.repository = repository;
	}
	
    public void save(T entity) {
    	this.repository.save(entity);
    }
    
    public void update(T entity) {
    	this.repository.save(entity);
    }
    
    public List<T> findAll() {
		return this.repository.findAll();
	}
    
    public T findById(Integer id) {
    	Optional<T> entity = this.repository.findById(id);
    	
    	if(!entity.isPresent())
    		throw new EntityNotFoundException(" El usuario con id: " + id + " no se encuentra en el sistema. ");
    	
		return entity.get();
	}

	public void deleteById(Integer id) {
		this.repository.deleteById(id);
	}
}
