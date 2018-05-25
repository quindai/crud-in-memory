package br.ufal.dbteste.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Tenista")
public class Tenista {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTenista;
	private String nome;
	private String genero;
}
