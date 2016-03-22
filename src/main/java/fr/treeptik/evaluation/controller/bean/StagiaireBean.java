package fr.treeptik.evaluation.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import fr.treeptik.evaluation.model.Stagiaire;

@ManagedBean
@ViewScoped
public class StagiaireBean extends GenericBean<Stagiaire>{
	public static final Class<Stagiaire> MODEL_CLASS = Stagiaire.class;
	public static final String MAIN_CONTENT = "lists/stagiaire.xhtml";
	public static final String SIDE_CONTENT = "forms/stagiaire.xhtml";
	
	private Stagiaire currentEntity;
	
	public StagiaireBean() {
		super.entityClass = MODEL_CLASS;
	}

	public Stagiaire getCurrentEntity() {
		return currentEntity;
	}
	public String setCurrentEntity(Stagiaire entity) {
		this.currentEntity = entity;
		return (null);
	}

	public static String getMainContent() {
		return MAIN_CONTENT;
	}

	public static String getSideContent() {
		return SIDE_CONTENT;
	}
	
	public void test(Stagiaire stgr){
		System.out.println(currentEntity);
		System.out.println(stgr);
	}
    
}
