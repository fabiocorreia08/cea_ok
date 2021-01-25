package br.gov.cmb.cea.enumerator;

public enum TipoContaEnum {
	
	NORMAL_ACCOUNT("512","Enabled Account") /* tipoConta.NORMAL_ACCOUNT=Enabled Account */,
	DISABLED_ACCOUNT("514","Disabled Account") /* tipoConta.DISABLED_ACCOUNT=Disabled Account */;

	private String codigo;
	private String descricao;
	
	private TipoContaEnum() {
	}
	
	TipoContaEnum(String codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
}
