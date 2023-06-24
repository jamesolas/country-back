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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Component
@Entity
@Table(name="animals")
public class Animals {
	
	@Id
	private String animalName;
	
	@Column
	private String animalType;
	
	@Column
	private String stateName;
	
	public Animals(){
		super();
	}

	public Animals(String animalName, String animalType, String stateName) {
		super();
		this.animalName = animalName;
		this.animalType = animalType;
		this.stateName = stateName;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(animalName, animalType, stateName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animals other = (Animals) obj;
		return Objects.equals(animalName, other.animalName) && Objects.equals(animalType, other.animalType)
				&& Objects.equals(stateName, other.stateName);
	}

	@Override
	public String toString() {
		return "Animal [animalName=" + animalName + ", animalType=" + animalType + ", stateName=" + stateName + "]";
	}
	
	
	
	
	

}
