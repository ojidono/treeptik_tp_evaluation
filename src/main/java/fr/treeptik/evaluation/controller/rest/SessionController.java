package fr.treeptik.evaluation.controller.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import fr.treeptik.evaluation.model.Session;

@Path("/sessions")
@Produces({ "application/json" })
public class SessionController extends GenericController<Session> {
	public SessionController() {
		super.entityClass = Session.class;
	}

}
