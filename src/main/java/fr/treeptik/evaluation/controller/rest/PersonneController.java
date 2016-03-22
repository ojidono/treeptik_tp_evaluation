package fr.treeptik.evaluation.controller.rest;

import javax.enterprise.context.Dependent;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import fr.treeptik.evaluation.model.Personne;

@Path("/personnes")
@Produces({ "application/json" })
@Dependent
public class PersonneController extends GenericController<Personne> {
	public PersonneController() {
		super.entityClass= Personne.class;
	}

}
