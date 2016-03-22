package fr.treeptik.evaluation.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.treeptik.evaluation.dao.GenericDAO;
import fr.treeptik.evaluation.service.GenericService;

@Stateless
//(mappedName="GenericService")
public class GenericServiceImpl<T, Pk> implements GenericService<T, Pk> {

	@EJB
    protected GenericDAO<T, Pk> generic;


	public GenericServiceImpl(GenericDAO<T, Pk> generic) {
		this.generic = generic;
	}
	public GenericServiceImpl() {}

	public T save(T entity) {
		return generic.save(entity);
	}

	public T find(Class<T> classe, Pk id) {
		return generic.find(classe, id);
	}

	public void delete(T entity) {
		generic.delete(entity);
	}

	public List<T> findAll(Class<T> classe) {
		return generic.findAll(classe);
	}
}