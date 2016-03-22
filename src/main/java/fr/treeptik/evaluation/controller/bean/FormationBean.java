package fr.treeptik.evaluation.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.treeptik.evaluation.model.Formation;

@ManagedBean
@ViewScoped
public class FormationBean extends GenericBean<Formation>{
	public static final Class<Formation> MODEL_CLASS = Formation.class;
	public static final String MAIN_CONTENT = "lists/formation.xhtml";
	public static final String SIDE_CONTENT = "forms/formation.xhtml";
	
	private Formation currentEntity;
	
	public FormationBean() {
		super.entityClass = MODEL_CLASS;
	}

	public Formation getCurrentEntity() {
		return currentEntity;
	}
	public String setCurrentEntity(Formation entity) {
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
