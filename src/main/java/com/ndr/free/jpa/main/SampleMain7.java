package com.ndr.free.jpa.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.ndr.free.jpa.entity.SampleChildEntity;
import com.ndr.free.jpa.entity.SampleParentEntity;

public class SampleMain7 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SAMPLE_PU_LOCAL");
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createNativeQuery("SELECT * FROM SAMPLE_PARENT_TABLE WHERE ID = :id", SampleParentEntity.class);
			query.setParameter("id", new Long(1));
			SampleParentEntity sampleParentEntity = (SampleParentEntity) query.getSingleResult();
			if ( sampleParentEntity != null ){
				System.out.println("Parent id: " + sampleParentEntity.getId() + " strProperty: " + sampleParentEntity.getStrProperty());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		em.close();
		emf.close();
	}
	
}
