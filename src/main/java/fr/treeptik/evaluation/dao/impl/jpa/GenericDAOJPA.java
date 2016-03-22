package fr.treeptik.evaluation.dao.impl.jpa;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.treeptik.evaluation.dao.GenericDAO;

@Stateless
public class GenericDAOJPA<T, k> implements GenericDAO<T, k> {
    @PersistenceContext(unitName = "evaluation")
    private EntityManager em;
	
	public GenericDAOJPA(){
	}

	@Override
	public T save(T entity) {
		return this.em.merge(entity);
	}

	@Override
	public void delete(T entity) {
		this.em.remove(em.contains(entity) ? entity : em.merge(entity));
	}

	@Override
	public T find(Class<T> classe, k key) {
		return this.em.find(classe, key);
	}

	@Override
	public List<T> findAll(Class<T> classe) {
		return this.em
				.createQuery(""
					+ "SELECT entity"
					+ " FROM " + classe.getSimpleName() + " entity ", classe)
				.getResultList();
	}

}
