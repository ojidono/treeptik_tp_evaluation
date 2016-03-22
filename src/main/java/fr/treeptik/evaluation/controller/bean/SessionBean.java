package fr.treeptik.evaluation.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.treeptik.evaluation.model.Session;

@ManagedBean
@SessionScoped
public class SessionBean extends GenericBean<Session>{
	private static final long serialVersionUID = -4089408534596769680L;
	
	public static final Class<Session> MODEL_CLASS = Session.class;
	public static final String MAIN_CONTENT = "lists/session.xhtml";
	public static final String SIDE_CONTENT = "forms/session.xhtml";
	
	public SessionBean() {
		this.entityClass = MODEL_CLASS;
	}

	public static String getMainContent() {
		return MAIN_CONTENT;
	}

	public static String getSideContent() {
		return SIDE_CONTENT;
	}
    
}
