package br.gov.cmb.cea.enumerator;

public enum PerfilUsuarioEnum {

	ADMIN("ADMIN","Administrador"), 
	SUPERINTENDENTE("SUPERINTENDENTE","Superintendente"), 
	DIRETOR("DIRETOR","Diretor"), 
	SECRETARIA("SECRETARIA","Secretária(o)"), 
	FINANCEIRO("FINANCEIRO", "Financeiro"), 
	PRESIDENTE("PRESIDENTE","Presidente"),
	AUDITOR("AUDITOR","Auditor"),
	DEPARTAMENTO_PESSOAL("DEPARTAMENTO_PESSOAL","Departamento Pessoal");

	private final String name;
	private final String descricao;

	private PerfilUsuarioEnum(String s,String descricao) {
		name = s;
		this.descricao = descricao;
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return name;
	}

	public String getDescricao(){
		return this.descricao;
	}

	private static PerfilUsuarioEnum[] values = null;

	public static PerfilUsuarioEnum fromInt(int i) {
		if(PerfilUsuarioEnum.values == null) {
			PerfilUsuarioEnum.values = PerfilUsuarioEnum.values();
		}
		return PerfilUsuarioEnum.values[i - 100];
	}
}
