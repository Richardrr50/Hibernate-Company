package domain.model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Column;
import java.io.Serializable;

@Entity (name = "Telnummer")
public class Telnummer implements Serializable{
	
	@Id
	@Column (name = "Telnummer")

	private String TelNummer;
	private String w_code;
	public String getTelNummer() {
		return TelNummer;
	}
	public void setTelNummer(String telNummer) {
	}
	public String getW_code() {
		return w_code;
	}
	public void setW_code(String w_code) {
		this.w_code = w_code;
	}
	@Override
	public String toString() {
		return "Telnummer [TelNummer=" + TelNummer + ", w_code=" + w_code + "]";
	}

	
}
