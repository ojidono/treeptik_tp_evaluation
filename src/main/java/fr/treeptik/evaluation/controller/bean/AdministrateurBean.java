package fr.treeptik.evaluation.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.treeptik.evaluation.model.Administrateur;

@ManagedBean
@SessionScoped
public class AdministrateurBean extends GenericBean<Administrateur>{
	private static final long serialVersionUID = 1916488484171244647L;
	
	public static final Class<Administrateur> MODEL_CLASS = Administrateur.class;
	public static final String MAIN_CONTENT = "lists/administrateur.xhtml";
	public static final String SIDE_CONTENT = "forms/administrateur.xhtml";

	public AdministrateurBean() {
		super.entityClass = MODEL_CLASS;
	}

	public static String getMainContent() {
		return MAIN_CONTENT;
	}

	public static String getSideContent() {
		return SIDE_CONTENT;
	}
}
