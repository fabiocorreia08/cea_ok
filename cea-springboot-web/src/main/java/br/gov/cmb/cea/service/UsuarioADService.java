package br.gov.cmb.cea.service;

import java.util.List;

import br.gov.cmb.cea.model.UsuarioAD;

public interface UsuarioADService {
	
	public List<UsuarioAD> getAll();	
	public UsuarioAD getById(long id);

}
