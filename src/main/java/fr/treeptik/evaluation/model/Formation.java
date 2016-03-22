package fr.treeptik.evaluation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Formation implements Serializable {
	private static final long serialVersionUID = -556672727448382403L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date debut;
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date fin; 
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false, length = 90000)
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Session session;
	@ManyToOne(fetch = FetchType.LAZY)
	private Formateur formateur;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDebut() {
		return debut;
	}
	public void setDebut(Date debut) {
		this.debut = debut;
	}
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Formation [id=" + id + ", debut=" + debut + ", fin=" + fin
				+ ", nom=" + nom + ", description=" + description
				+ ", session=" + session + ", formateur=" + formateur + "]";
	}
	
	
	
	
}
