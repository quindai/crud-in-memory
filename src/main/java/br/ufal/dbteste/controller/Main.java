package br.ufal.dbteste.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("conecta-hsqldb");
		EntityManager em = emf.createEntityManager();
	}

}
