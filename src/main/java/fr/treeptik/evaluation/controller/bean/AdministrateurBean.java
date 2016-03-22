package fr.treeptik.evaluation.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.treeptik.evaluation.model.Administrateur;

@ManagedBean
@ViewScoped
public class AdministrateurBean extends GenericBean<Administrateur>{
	public static final Class<Administrateur> MODEL_CLASS = Administrateur.class;
	public static final String MAIN_CONTENT = "lists/administrateur.xhtml";
	public static final String SIDE_CONTENT = "forms/administrateur.xhtml";
	
	private Administrateur currentEntity;

	public AdministrateurBean() {
		super.entityClass = MODEL_CLASS;
	}

	public Administrateur getCurrentEntity() {
		return currentEntity;
	}
	public String setCurrentEntity(Administrateur entity) {
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
