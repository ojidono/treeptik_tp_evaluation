package fr.treeptik.evaluation.controller.navigation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="facePainter")
@SessionScoped
public class FacePainter implements Serializable{
	private static final long serialVersionUID = -7964208082355315896L;
	
	private String sideContent;
    private String mainContent;
    public FacePainter() {
        this.sideContent = "forms/stagiaire.xhtml";
        this.mainContent = "lists/stagiaire.xhtml";
	}
    public void setContents(String mainContent, String sideContent){
    	setSideContent(sideContent);
    	setMainContent(mainContent);
    }
    
	public String getSideContent() {
		return sideContent;
	}
	public String setSideContent(String sideContent) {
		this.sideContent = sideContent;
		return (null);
	}
	public String getMainContent() {
		return mainContent;
	}
	public String setMainContent(String mainContent) {
		this.mainContent = mainContent;
		return (null);
	}
}