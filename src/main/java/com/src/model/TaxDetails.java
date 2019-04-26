package com.src.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tds_master")
public class TaxDetails {

	@Id
	@Column(name="id", nullable=false)
	private int taxId;
	
	@Column(name="deductor_name", nullable=false)
	private String deductorName;
	
	@Column(name="deductor_pan", nullable=false)
	private String deductorPan;
	
	@Column(name="tds_deposited", nullable=false)
	private int taxDeposited;
	
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public String getDeductorName() {
		return deductorName;
	}
	public void setDeductorName(String deductorName) {
		this.deductorName = deductorName;
	}
	public String getDeductorPan() {
		return deductorPan;
	}
	public void setDeductorPan(String deductorPan) {
		this.deductorPan = deductorPan;
	}
	public int getTaxDeposited() {
		return taxDeposited;
	}
	public void setTaxDeposited(int taxDeposited) {
		this.taxDeposited = taxDeposited;
	}
}






