package fr.treeptik.evaluation.controller.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import fr.treeptik.evaluation.model.Stagiaire;

@Path("/stagiaires")
@Produces({ "application/json" })
public class StagiaireController extends GenericController<Stagiaire> {
	public StagiaireController() {
		super.entityClass= Stagiaire.class;
	}

}
