package com.ndr.free.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ndr.free.jpa.entity.SampleEntity;

public class SampleMain1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SAMPLE_PU_LOCAL");
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction trans = em.getTransaction();
			SampleEntity sampleEntity = new SampleEntity(1, "strVal");
			trans.begin();
			em.persist(sampleEntity);
			trans.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		em.close();
		emf.close();
	}
	
}
