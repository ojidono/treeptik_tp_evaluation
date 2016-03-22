package fr.treeptik.evaluation.controller.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import fr.treeptik.evaluation.model.Administrateur;

@Path("/administrateurs")
@Produces({ "application/json" })
public class AdministrateurController extends GenericController <Administrateur> {
	public AdministrateurController() {
		super.entityClass= Administrateur.class;
	}

}
