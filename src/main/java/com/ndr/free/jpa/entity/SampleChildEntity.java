package com.ndr.free.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SAMPLE_CHILD_TABLE")
public class SampleChildEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;
	
	@Column(name ="SAMPLE_PARENT_TABLE_ID")
	private Long sampleParentTableId;
	
	@Column(name = "STR_COL")
	private String strProperty;
	
	@ManyToOne
	private SampleParentEntity sampleParentEntity;
	
	
	
	public SampleChildEntity() {
		super();
	}

	

	public SampleChildEntity(String strProperty) {
		
		this.strProperty = strProperty;
	}

	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public Long getSampleParentTableId() {
		return sampleParentTableId;
	}



	public void setSampleParentTableId(Long sampleParentTableId) {
		this.sampleParentTableId = sampleParentTableId;
	}



	public String getStrProperty() {
		return strProperty;
	}

	public void setStrProperty(String strProperty) {
		this.strProperty = strProperty;
	}

	public SampleParentEntity getSampleParentEntity() {
		return sampleParentEntity;
	}

	public void setSampleParentEntity(SampleParentEntity sampleParentEntity) {
		this.sampleParentEntity = sampleParentEntity;
	}

		
}
