package com.ndr.free.jpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ndr.free.jpa.entity.SampleEntity;

public class SampleMain2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SAMPLE_PU_LOCAL");
		EntityManager em = emf.createEntityManager();
		SampleEntity sampleEntity = em.find(SampleEntity.class, new Long(1));
		System.out.println(sampleEntity.getStrProperty());
		em.close();
		emf.close();
	}
	
}
