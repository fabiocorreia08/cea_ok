package br.gov.cmb.cea.service;

import java.util.List;

import br.gov.cmb.cea.model.Empregado;

public interface EmpregadoService {
	
	public List<Empregado> getAll();

	public Empregado getById(long id);

	public List<Empregado> getByNome(String nome);

	public List<Empregado> getByMatricula(String matricula);

	public void saveOrUpdate(Empregado empregado);

	public void delete(long id);

}
