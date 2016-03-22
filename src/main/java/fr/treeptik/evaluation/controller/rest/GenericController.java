package fr.treeptik.evaluation.controller.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import fr.treeptik.evaluation.service.GenericService;

public class GenericController <T>{

	@EJB
	private GenericService<T, Long> service;
	protected Class<T> entityClass;

	@Path("/save")
	@PUT
    @Produces({"application/json"})
    @Consumes({"application/json"})
	public T save(T entity) {
		return service.save(entity);
	}
	@Path("/list/all")
	@GET
    @Produces({"application/json"})
	public List<T> findAll() {
		return service.findAll(entityClass);
	}
	@Path("/detail/{id}")
	@GET
    @Produces({"application/json"})
	public T detail(@PathParam("id") Long id) {
		return service.find(entityClass, id);
	}
	@Path("/delete/{id}")
	@DELETE
    @Produces({"application/json"})
	public T delete(@PathParam("id") Long id) {
		T entity = service.find(entityClass, id);
		service.delete(entity);
		return entity;
	}

}
