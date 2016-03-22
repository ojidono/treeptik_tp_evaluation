package fr.treeptik.evaluation.dao;

import java.util.List;

public interface GenericDAO <T, k> {
	public T save(T entity);
	public void delete(T entity);
	public T find(Class<T> classe, k key);
	public List<T> findAll(Class<T> classe);
}
