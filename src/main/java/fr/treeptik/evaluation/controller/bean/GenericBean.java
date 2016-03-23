package fr.treeptik.evaluation.controller.bean;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;

import fr.treeptik.evaluation.service.GenericService;

public class GenericBean<T> implements Serializable{

	private static final long serialVersionUID = -6530927236519603052L;
	@EJB
	private GenericService<T, Long> service;
	protected Class<T> entityClass;
	private T currentEntity;

	public T getCurrentEntity() {
		return currentEntity;
	}

	public void setCurrentEntity(T currentEntity) {
		this.currentEntity = currentEntity;
	}

	//(List<Session>) target.path("{id}").resolveTemplate("id", id).request(MediaType.APPLICATION_JSON).get(MODEL_CLASS)
	public T find(Long id) {
		return service.find(entityClass, id);
	}

	public String newEntity() {
		try {
			this.currentEntity = entityClass.newInstance();
		} catch (InstantiationException e) {
			System.out.println("DAMN");
		} catch (IllegalAccessException e) {
			System.out.println("DAMN2");
		}
		return (null);
	}

	public T save() {
		System.out.println(this.currentEntity);
		return service.save(this.currentEntity);
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
