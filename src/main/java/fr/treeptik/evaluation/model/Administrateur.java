package fr.treeptik.evaluation.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@DiscriminatorValue("Administrateur")
public class Administrateur extends Personne{
	private static final long serialVersionUID = 1957459832983560983L;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Administrateur ["+"id=" + this.getId() + ", nom=" + this.getNom() + ", prenom=" + this.getPrenom()
				+ ", dateDeNaissance=" + this.getDateDeNaissance() + ", description=" + this.getDescription()
				+ ", email=" + this.getEmail() + ", password=" + this.getPassword()+"]";
	}
	
	
}
