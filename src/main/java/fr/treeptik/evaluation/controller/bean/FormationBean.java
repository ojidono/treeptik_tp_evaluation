package fr.treeptik.evaluation.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.treeptik.evaluation.model.Formation;

@ManagedBean
@SessionScoped
public class FormationBean extends GenericBean<Formation>{
	private static final long serialVersionUID = 6738102572029695789L;
	
	public static final Class<Formation> MODEL_CLASS = Formation.class;
	public static final String MAIN_CONTENT = "lists/formation.xhtml";
	public static final String SIDE_CONTENT = "forms/formation.xhtml";
	
	public FormationBean() {
		super.entityClass = MODEL_CLASS;
	}

	public static String getMainContent() {
		return MAIN_CONTENT;
	}

	public static String getSideContent() {
		return SIDE_CONTENT;
	}
    
}
