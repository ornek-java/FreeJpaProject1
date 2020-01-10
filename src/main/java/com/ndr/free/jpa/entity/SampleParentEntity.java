package com.ndr.free.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SAMPLE_PARENT_TABLE")
@NamedQuery(name="SampleParentEntity.findById", query="SELECT sampleParentEntity FROM SampleParentEntity sampleParentEntity WHERE sampleParentEntity.id = :id")
public class SampleParentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "STR_COL")
	private String strProperty;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="SAMPLE_PARENT_TABLE_ID")
	private List<SampleChildEntity> lstChildEntity = new ArrayList<SampleChildEntity>();
	
	public SampleParentEntity() {
		super();
	}

	public SampleParentEntity(String strProperty) {
		this.strProperty = strProperty;
	}

	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStrProperty() {
		return strProperty;
	}

	public void setStrProperty(String strProperty) {
		this.strProperty = strProperty;
	}

	public List<SampleChildEntity> getLstChildEntity() {
		return lstChildEntity;
	}
	
	
	
	
	
	
}
