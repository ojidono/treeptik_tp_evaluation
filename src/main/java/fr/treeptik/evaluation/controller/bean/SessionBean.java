package fr.treeptik.evaluation.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.treeptik.evaluation.model.Session;

@ManagedBean
@ViewScoped
public class SessionBean extends GenericBean<Session>{
	public static final Class<Session> MODEL_CLASS = Session.class;
	public static final String MAIN_CONTENT = "lists/session.xhtml";
	public static final String SIDE_CONTENT = "forms/session.xhtml";
	
	private Session currentEntity;
	
	public SessionBean() {
		this.entityClass = MODEL_CLASS;
	}

	public Session getCurrentEntity() {
		return currentEntity;
	}
	public String setCurrentEntity(Session entity) {
		this.currentEntity = entity;
		return (null);
	}

	public static String getMainContent() {
		return MAIN_CONTENT;
	}

	public static String getSideContent() {
		return SIDE_CONTENT;
	}
    
}
