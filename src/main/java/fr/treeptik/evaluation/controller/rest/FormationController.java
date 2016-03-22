package fr.treeptik.evaluation.controller.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import fr.treeptik.evaluation.model.Formation;

@Path("/formations")
@Produces({ "application/json" })
public class FormationController extends GenericController<Formation> {
	public FormationController() {
		super.entityClass = Formation.class;
	}

}
