package com.ndr.free.jpa.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ndr.free.jpa.entity.SampleChildEntity;
import com.ndr.free.jpa.entity.SampleParentEntity;

public class SampleMain5 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SAMPLE_PU_LOCAL");
		EntityManager em = emf.createEntityManager();
		try {
			Query query = em.createQuery("Select sampleChildEntity from SampleChildEntity sampleChildEntity",SampleChildEntity.class);
			List<SampleChildEntity> sampleChildEntityLst = query.getResultList();
			for(SampleChildEntity sampleChildEntity: sampleChildEntityLst){
					System.out.println("Parent id: " + sampleChildEntity.getSampleParentEntity().getId() 
							+ " Child id: " + sampleChildEntity.getId() + " strProperty: " + sampleChildEntity.getStrProperty());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}	em.close();
		emf.close();
	}
	
}
