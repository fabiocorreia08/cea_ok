package br.gov.cmb.cea.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AfastamentoPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String matricula;
	private String inicio;	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}		
	
}
