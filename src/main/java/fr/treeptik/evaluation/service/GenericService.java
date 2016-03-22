package fr.treeptik.evaluation.service;

import java.util.List;

import javax.ejb.Local;

@Local
public interface GenericService<T, Pk> {
	public T save (T entity);
	public T find (Class<T> classe,Pk id);
	public void delete(T entity);
	public List<T> findAll (Class<T> classe);
}
