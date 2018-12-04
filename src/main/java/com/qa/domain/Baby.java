package com.qa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Baby {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	private String babyName;
	private int length;
	private String toStart;
	
	
	public Baby() {
		
	}
	
	public Baby(String babyName, int length, String toStart) {
		this.babyName= babyName;
		this.length = length;
		this.toStart = toStart;
	}

	public String getBabyName() {
		return babyName;
	}

	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getToStart() {
		return toStart;
	}

	public void setToStart(String toStart) {
		this.toStart = toStart;
	}
	
	
	
	

}
