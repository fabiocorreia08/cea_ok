package br.gov.cmb.cea.service;

import java.util.List;

import br.gov.cmb.cea.model.Afastamento;

public interface AfastamentoService {
	
	public List<Afastamento> getAll();	
	public Afastamento getById(long id);	

}
