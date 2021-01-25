package br.gov.cmb.cea.service;

import java.util.List;

import br.gov.cmb.cea.model.StatusRotina;

public interface StatusRotinaService {
	
	public List<StatusRotina> getAll();

	public StatusRotina getById(long id);

	public StatusRotina save(StatusRotina statusRotina);

	public void delete(long id);
	
	public Boolean buscarStatusAtual();

}
