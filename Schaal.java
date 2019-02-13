package domain.model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Column;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity (name = "Schaal")
public class Schaal implements Serializable {
	
	
	@Id
	@Column (name = "scl_code")
	private String sclcode;
	
	@OneToMany
	@JoinColumn(name ="loonschaal", foreignKey = @ForeignKey (name = "werknemers_loonschaal"))
	private Set<Werknemer>werknemers=new HashSet<>();
	
	
	private double min;
	@Override
	public String toString() {
		return "Schaal [scl_code=" + sclcode + ", min=" + min + ", max=" + max + "]";
	}
	public String getScl_code() {
		return sclcode;
	}
	public void setScl_code(String scl_code) {
		this.sclcode = scl_code;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	private double max;
	
}
