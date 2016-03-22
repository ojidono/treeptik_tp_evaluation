package fr.treeptik.evaluation.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@XmlRootElement
@DiscriminatorValue("Stagiaire")
public class Stagiaire extends Personne{
	private static final long serialVersionUID = 8553607692725406049L;

	@XmlTransient
	@JsonIgnore
	@ManyToMany(mappedBy = "stagiaires", fetch = FetchType.LAZY)
	private List<Session> sessions;


	@XmlTransient
	@JsonIgnore
	public List<Session> getSessions() {
		return sessions;
	}
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String toString() {
		return "Stagiaire ["+"id=" + this.getId() + ", nom=" + this.getNom() + ", prenom=" + this.getPrenom()
				+ ", dateDeNaissance=" + this.getDateDeNaissance() + ", description=" + this.getDescription() 
				+ ", email=" + this.getEmail() + ", password=" + this.getPassword() + "]";
	}
	
	
	
	
}
