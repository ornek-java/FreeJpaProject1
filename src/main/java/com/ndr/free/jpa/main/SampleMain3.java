package com.ndr.free.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ndr.free.jpa.entity.SampleChildEntity;
import com.ndr.free.jpa.entity.SampleParentEntity;

public class SampleMain3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SAMPLE_PU_LOCAL");
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction trans = em.getTransaction();
			
			SampleParentEntity sampleParentEntity = new SampleParentEntity("strVal0");
			
			SampleChildEntity sampleChildEntity1 = new SampleChildEntity("strVal1");
			sampleChildEntity1.setSampleParentEntity(sampleParentEntity);
			sampleParentEntity.getLstChildEntity().add(sampleChildEntity1);
			
			SampleChildEntity sampleChildEntity2 = new SampleChildEntity("strVal2");
			sampleChildEntity2.setSampleParentEntity(sampleParentEntity);
			sampleParentEntity.getLstChildEntity().add(sampleChildEntity2);
			
			SampleChildEntity sampleChildEntity3 = new SampleChildEntity("strVal3");
			sampleChildEntity3.setSampleParentEntity(sampleParentEntity);
			sampleParentEntity.getLstChildEntity().add(sampleChildEntity3);
			
			trans.begin();
			em.persist(sampleParentEntity);
			trans.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		em.close();
		emf.close();
	}
	
}
