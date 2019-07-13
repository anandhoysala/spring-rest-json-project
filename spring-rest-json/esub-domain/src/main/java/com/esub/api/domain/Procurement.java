package com.esub.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Procurement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="contractor_name")
	private String contractorName;
	
	@Column(name="sub_center")
	private String subCenter;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContractorName() {
		return contractorName;
	}

	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}

	public String getSubCenter() {
		return subCenter;
	}

	public void setSubCenter(String subCenter) {
		this.subCenter = subCenter;
	}

}