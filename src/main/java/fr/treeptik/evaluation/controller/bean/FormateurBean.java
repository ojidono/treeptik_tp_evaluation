package fr.treeptik.evaluation.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.treeptik.evaluation.model.Formateur;

@ManagedBean
@ViewScoped
public class FormateurBean extends GenericBean<Formateur>{
	public static final Class<Formateur> MODEL_CLASS = Formateur.class;
	public static final String MAIN_CONTENT = "lists/formateur.xhtml";
	public static final String SIDE_CONTENT = "forms/formateur.xhtml";
	
	private Formateur currentEntity;
	
	public FormateurBean() {
		super.entityClass = MODEL_CLASS;
	}

	public Formateur getCurrentEntity() {
		return currentEntity;
	}
	public String setCurrentEntity(Formateur entity) {
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
