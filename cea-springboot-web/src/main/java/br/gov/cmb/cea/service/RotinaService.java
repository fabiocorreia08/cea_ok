package br.gov.cmb.cea.service;

import java.util.List;

import br.gov.cmb.cea.model.Rotina;

public interface RotinaService {
	
	public List<Rotina> getAll();

	public Rotina getById(long id);

	public void saveOrUpdate(Rotina rotinaLog);

	public void delete(long id);

}
