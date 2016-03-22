package fr.treeptik.evaluation.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@XmlRootElement
@DiscriminatorValue("Formateur")
public class Formateur extends Personne{
	private static final long serialVersionUID = 8348524964435092202L;
	

	@XmlTransient
	@JsonIgnore
	@OneToMany(mappedBy = "formateur", fetch = FetchType.LAZY)
	private List<Formation> formations;

	

	public Formateur() {
	}


	@XmlTransient
	@JsonIgnore
	public List<Formation> getFormations() {
		return formations;
	}
	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Formateur ["+super.toString()+"]";
	}
	
	
	

}
