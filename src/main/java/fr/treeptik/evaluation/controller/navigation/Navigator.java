package fr.treeptik.evaluation.controller.navigation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Navigator implements Serializable {

	private static final long serialVersionUID = -1075137046512623771L;
	
	@ManagedProperty(value="#{facePainter}")
    public FacePainter facePainter;

	public String reachAdmin(){
		facePainter.setContents("lists/administrateur.xhtml","forms/administrateur.xhtml");
		return (null);
	}
	public String reachIntern(){
		facePainter.setContents("lists/stagiaire.xhtml","forms/stagiaire.xhtml");
		return (null);
	}
	public String reachInstructor(){
		facePainter.setContents("lists/formateur.xhtml","forms/formateur.xhtml");
		return (null);
	}
	public String reachFormation(){
		facePainter.setContents("lists/formation.xhtml","forms/formation.xhtml");
		return (null);
	}
	public String reachSession(){
		facePainter.setContents("lists/session.xhtml","forms/session.xhtml");
		return (null);
	}
	public FacePainter getFacePainter() {
		return facePainter;
	}
	public void setFacePainter(FacePainter facePainter) {
		this.facePainter = facePainter;
	}
	
}
