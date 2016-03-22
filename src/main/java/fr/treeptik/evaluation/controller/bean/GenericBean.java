package fr.treeptik.evaluation.controller.bean;

import java.util.List;

import javax.ejb.EJB;

import fr.treeptik.evaluation.service.GenericService;

public class GenericBean<T> {

	@EJB
	private GenericService<T, Long> service;
	protected Class<T> entityClass;
	
    //(List<Session>) target.path("{id}").resolveTemplate("id", id).request(MediaType.APPLICATION_JSON).get(MODEL_CLASS)
	public T find(Long id) {
		return service.find(entityClass, id);
	}

	public T save(T entity) {
		return service.save(entity);
	}
	
	public List<T> findAll() {
		return service.findAll(entityClass);
	}
	
	public T detail(Long id) {
		return service.find(entityClass, id);
	}

	public String delete(Long id) {
		return delete(service.find(entityClass, id));
	}
	public String delete(T entity) {
		service.delete(entity);
		return (null);
	}

}
