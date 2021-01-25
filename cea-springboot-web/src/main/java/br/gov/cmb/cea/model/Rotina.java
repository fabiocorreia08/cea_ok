package br.gov.cmb.cea.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Rotina {
	
	@Id
	private Long id;
	private String matricula;	
	private String nome;	
	private String acao;
	private String data;
	private String tipoExecucao;
	private String executante;
	private String descricao;	
	private String lotacao;
	
	public Rotina() {
		
	}
	//data, tipoRotinaEnum.toString(), descricao, matricula, nome, lotacao
	public Rotina(String data, String acao, String descricao, String matricula, String nome, String lotacao) {		
		this.data = data;
		this.acao = acao;
		this.descricao = descricao;
		this.matricula = matricula;
		this.nome = nome;		
		this.lotacao = lotacao;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTipoExecucao() {
		return tipoExecucao;
	}
	public void setTipoExecucao(String tipoExecucao) {
		this.tipoExecucao = tipoExecucao;
	}
	public String getExecutante() {
		return executante;
	}
	public void setExecutante(String executante) {
		this.executante = executante;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLotacao() {
		return lotacao;
	}
	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}	

}
