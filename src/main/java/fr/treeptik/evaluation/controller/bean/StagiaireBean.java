package fr.treeptik.evaluation.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.treeptik.evaluation.model.Stagiaire;

@ManagedBean
@SessionScoped
public class StagiaireBean extends GenericBean<Stagiaire>{
	private static final long serialVersionUID = 375177825563284765L;
	
	public static final Class<Stagiaire> MODEL_CLASS = Stagiaire.class;
	public static final String MAIN_CONTENT = "lists/stagiaire.xhtml";
	public static final String SIDE_CONTENT = "forms/stagiaire.xhtml";
	
	public StagiaireBean() {
		super.entityClass = MODEL_CLASS;
	}

	public static String getMainContent() {
		return MAIN_CONTENT;
	}

	public static String getSideContent() {
		return SIDE_CONTENT;
	}
    
}
