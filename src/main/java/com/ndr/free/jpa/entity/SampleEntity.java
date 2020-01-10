package com.ndr.free.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SAMPLE_TABLE")
public class SampleEntity {

	@Id
	@Column(name = "ID")
	private long longProperty;
	@Column(name = "STR_COL")
	private String strProperty;
	
	
	
	public SampleEntity() {
		super();
	}

	public SampleEntity(long longProperty, String strProperty) {
		this.longProperty = longProperty;
		this.strProperty = strProperty;
	}

	public long getLongProperty() {
		return longProperty;
	}

	public void setLongProperty(long longProperty) {
		this.longProperty = longProperty;
	}

	public String getStrProperty() {
		return strProperty;
	}

	public void setStrProperty(String strProperty) {
		this.strProperty = strProperty;
	}
	
	
	
	
	
}
