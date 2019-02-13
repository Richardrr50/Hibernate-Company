package domain.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ForeignKey;


@Entity(name= "Project")
@Table(name="project")
public class Project implements Serializable {
	
	
	@Id
	@Column (name = "p_code", length = 4)
	private String projectcode;
	
	
	@Column(name="name")
	private String name;
	
	
	@OneToMany
	@JoinColumn(name= "p_werknemer", foreignKey = @ForeignKey(name="w_werknemer_ID_FK"))
	private Set<Werknemer> werknemers = new HashSet<>();
	
	
	private String projectleider;
	private String projectnaam;
	private String locatie;
	private String startDatum;
	private double budget;
	
	

	public String getProjectcode() {
		return projectcode;
	}

	public Project(String projectcode, String projectnaam, String locatie, String startDatum, double budget,
			String projectleider) {
		super();
		this.projectcode = projectcode;
		this.projectnaam = projectnaam;
		this.locatie = locatie;
		this.startDatum = startDatum;
		this.budget = budget;
		this.projectleider =  projectleider;
	}

	public void setProjectcode(String projectcode) {
		this.projectcode = projectcode;
	}

	public String getProjectnaam() {
		return projectnaam;
	}

	public void setProjectnaam(String projectnaam) {
		this.projectnaam = projectnaam;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public String getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(String startDatum) {
		this.startDatum = startDatum;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getProjectleider() {
		return  projectleider;
	}

	public void setProjectleider(String projectleider) {
		this.projectleider =  projectleider;
	}

	@Override
	public String toString() {
		return "Project [projectcode=" + projectcode + ", projectnaam=" + projectnaam + ", locatie=" + locatie
				+ ", startDatum=" + startDatum + ", budget=" + budget + ", projectleider=" + projectleider + "]";
	}
	
	
	
}
