package com.example.demo.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Lombok annotations don't work

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode
//@ToString
@Component
@Entity
@Table(name="states")
public class States {
	@Id
	private String stateName;
	@Column
	private String stateCode;
	@Column
	private String stateRegion;
	
	public States() {
		super();
		// TODO Auto-generated constructor stub
	}

	public States(String stateName, String stateCode, String stateRegion) {
		super();
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.stateRegion = stateRegion;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateRegion() {
		return stateRegion;
	}

	public void setStateRegion(String stateRegion) {
		this.stateRegion = stateRegion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stateCode, stateName, stateRegion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		States other = (States) obj;
		return Objects.equals(stateCode, other.stateCode) && Objects.equals(stateName, other.stateName)
				&& Objects.equals(stateRegion, other.stateRegion);
	}

	@Override
	public String toString() {
		return "States [stateName=" + stateName + ", stateCode=" + stateCode + ", stateRegion=" + stateRegion + "]";
	}
	
	

}
