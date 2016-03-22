package fr.treeptik.evaluation.controller.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import fr.treeptik.evaluation.model.Formateur;

@Path("/formateurs")
@Produces({ "application/json" })
public class FormateurController extends GenericController <Formateur> {
	public FormateurController() {
		super.entityClass= Formateur.class;
	}

}
