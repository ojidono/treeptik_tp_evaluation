package fr.treeptik.evaluation.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.treeptik.evaluation.model.Formateur;

@ManagedBean
@SessionScoped
public class FormateurBean extends GenericBean<Formateur>{
	private static final long serialVersionUID = -2018941782124097610L;
	
	public static final Class<Formateur> MODEL_CLASS = Formateur.class;
	public static final String MAIN_CONTENT = "lists/formateur.xhtml";
	public static final String SIDE_CONTENT = "forms/formateur.xhtml";
	
	public FormateurBean() {
		super.entityClass = MODEL_CLASS;
	}

	public static String getMainContent() {
		return MAIN_CONTENT;
	}

	public static String getSideContent() {
		return SIDE_CONTENT;
	}
}
