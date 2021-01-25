package br.gov.cmb.cea.enumerator;

public enum StatusRotinaEnum {

	ATIVADA("A", "Ativiada"), 
	DESATIVADA("D", "Desativada");

	private String codigo;
	private String descricao;

	public String getCodigo() {
		return this.codigo;
	}

	public String getDescricao() {
		return this.descricao;
	}

	StatusRotinaEnum() {
	}

	StatusRotinaEnum(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return this.codigo;
	}

}
