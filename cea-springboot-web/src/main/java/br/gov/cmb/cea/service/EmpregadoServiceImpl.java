package br.gov.cmb.cea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.gov.cmb.cea.model.Empregado;
import br.gov.cmb.cea.repository.EmpregadoRepository;

@Service
public class EmpregadoServiceImpl implements EmpregadoService{
	
	@Autowired
	EmpregadoRepository empregadoRepository;

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Empregado> getAll() {
		return (List<Empregado>) empregadoRepository.findAll();
	}

	@Override
	public Empregado getById(long id) {
		return empregadoRepository.findById(id).get();
	}	
	
	@Override
	public List<Empregado> getByNome(String nome) {
		return empregadoRepository.findByNome(nome);
	}
	
	@Override
	public List<Empregado> getByMatricula(String matricula) {
		return empregadoRepository.findByMatricula(matricula);
	}

	@Override
	public void saveOrUpdate(Empregado empregadoErp) {
		empregadoRepository.save(empregadoErp);		
	}

	@Override
	public void delete(long id) {
		empregadoRepository.deleteById(id);		
	}

	

}
