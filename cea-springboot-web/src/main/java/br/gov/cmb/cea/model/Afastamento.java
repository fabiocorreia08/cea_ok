package br.gov.cmb.cea.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Afastamento {
	
	@EmbeddedId
	AfastamentoPK id;
	
	private String nome;
	private String lotacao;	
	
	private String fim;
		
	public AfastamentoPK getId() {
		return id;
	}
	public void setId(AfastamentoPK id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLotacao() {
		return lotacao;
	}
	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}	
	public String getFim() {
		return fim;
	}
	public void setFim(String fim) {
		this.fim = fim;
	}
}
