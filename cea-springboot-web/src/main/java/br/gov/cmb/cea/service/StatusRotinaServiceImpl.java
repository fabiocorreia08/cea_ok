package br.gov.cmb.cea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.gov.cmb.cea.model.StatusRotina;
import br.gov.cmb.cea.repository.StatusRotinaRepository;

@Service
public class StatusRotinaServiceImpl implements StatusRotinaService{
	
	@Autowired
	StatusRotinaRepository StatusRotinaRepository;

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<StatusRotina> getAll() {
		return (List<StatusRotina>) StatusRotinaRepository.findAll();
	}

	@Override
	public StatusRotina getById(long id) {
		return StatusRotinaRepository.findById(id).get();
	}	
	
	@Override
	public StatusRotina save(StatusRotina statusRotina) {
		return StatusRotinaRepository.save(statusRotina);		
	}

	@Override
	public void delete(long id) {
		StatusRotinaRepository.deleteById(id);		
	}	
	
	@Override
	public Boolean buscarStatusAtual() {
		return StatusRotinaRepository.buscarStatusAtual();
	}

}
