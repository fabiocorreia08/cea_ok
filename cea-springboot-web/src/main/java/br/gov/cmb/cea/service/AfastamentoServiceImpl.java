package br.gov.cmb.cea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cmb.cea.model.Afastamento;
import br.gov.cmb.cea.repository.AfastamentoRepository;

@Service
public class AfastamentoServiceImpl implements AfastamentoService{
	
	@Autowired
	AfastamentoRepository afastamentoRepo;

	@Override
	public List<Afastamento> getAll() {
		return (List<Afastamento>) afastamentoRepo.findAll();
	}	

	@Override
	public Afastamento getById(long id) {
		//return afastamentoRepository.findById(id).get();
		return null;
	}		
		

}
