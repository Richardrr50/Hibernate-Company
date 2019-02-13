package domain.model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Column;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;


@ Entity(name = "Werknemer")
@ Table (name= "werknemer")
public class Werknemer{
	
	@Id
	@Column(name = "w_code")
	private String code;


	@OneToMany
	@JoinColumn(name="Telefoon", foreignKey = @ForeignKey (name = "werknemers_telnr_FK"))
	private Set<Telnummer>telnummers=new HashSet<>();
	
	
	@OneToMany
	@JoinColumn (name = "projectleider", foreignKey = @ForeignKey (name="p_leider_ID_FK"))
    private Set<Werknemer> chef=new HashSet<>();
	
	
	
	@Temporal(TemporalType.DATE)
	private Calendar datumInD;
	
	
	private String loonschaal;
	private String naam;
	private String voorletters;
	private String tussenvoegsel;
	private String adres;
	private String postcode;
	private String woonplaats;
	private double sal;
	

	
	public Werknemer(String code, String naam, String voorletters, String tussenvoegsel, String adres, String postcode,
			String woonplaats, double sal, Set<Werknemer> chef, String loonschaal, Calendar datuminD) {

		super();
		this.code = code;
		this.naam = naam;
		this.voorletters = voorletters;
		this.tussenvoegsel = tussenvoegsel;
		this.adres = adres;
		this.postcode = postcode;
		this.woonplaats = woonplaats;
		this.datumInD = datuminD;
		this.sal = sal;
		this.chef = chef;
		this.loonschaal = loonschaal;
	}

	public Werknemer() {
		// TODO Auto-generated constructor stub
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getVoorletters() {
		return voorletters;
	}
	public void setVoorletters(String voorletters) {
		this.voorletters = voorletters;
	}
	public String getTussenvoegsel() {
		return tussenvoegsel;
	}
	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getWoonplaats() {
		return woonplaats;
	}
	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}
	public Calendar getDatum_in_d() {
		return datumInD;
	}
	public void setDatum_in_d(Calendar datumInD) {
		this.datumInD = datumInD;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Set<Werknemer> getChef() {
		return chef;
	}
	public void setChef(Set<Werknemer> chef) {
		this.chef = chef;
	}
	public String getLoonschaal() {
		return loonschaal;
	}
	public void setLoonschaal(String loonschaal) {
		this.loonschaal = loonschaal;
	}
	@Override
	public String toString() {
		return "Werknemer [code=" + code + ", naam=" + naam + ", voorletters=" + voorletters + ", tussenvoegsel="
				+ tussenvoegsel + ", adres=" + adres + ", postcode=" + postcode + ", woonplaats=" + woonplaats
				+ ", datum_in_d=" + datumInD + ", sal=" + sal + ", Chef=" + chef + ", loonschaal=" + loonschaal + "]";
	}
	
	
}
