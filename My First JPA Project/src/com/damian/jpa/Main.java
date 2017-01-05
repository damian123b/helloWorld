package com.damian.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("myDatabase");//atrybut name z persistence-unit
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.close();
		factory.close();
	}

}
