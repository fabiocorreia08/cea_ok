package br.gov.cmb.cea.enumerator;

public enum TipoRotinaEnum {
	
	BLOQUEIO("Conta Bloqueada") /* tipoConta.NORMAL_ACCOUNT=Enabled Account */,
	DESBLOQUEIO("Conta Desbloqueada") /* tipoConta.DISABLED_ACCOUNT=Disabled Account */,
	SEM_DESCRICAO("Mensagem Retirada") /* tipoConta.DISABLED_ACCOUNT=Disabled Account */;
	
	private String descricao;	
	
	public String getString() {
		return this.descricao;
	}	
	
	TipoRotinaEnum() {
	}
	
	TipoRotinaEnum(String descricao) {
		
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}

}
