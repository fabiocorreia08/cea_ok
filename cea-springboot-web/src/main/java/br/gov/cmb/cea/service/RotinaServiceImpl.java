package br.gov.cmb.cea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.gov.cmb.cea.model.Rotina;
import br.gov.cmb.cea.repository.RotinaRepository;

@Service
public class RotinaServiceImpl implements RotinaService{
	
	@Autowired
	RotinaRepository rotinaLogRepository;

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Rotina> getAll() {
		return (List<Rotina>) rotinaLogRepository.findAll();
	}

	@Override
	public Rotina getById(long id) {
		return rotinaLogRepository.findById(id).get();
	}	
	
	@Override
	public void saveOrUpdate(Rotina rotinaLog) {
		rotinaLogRepository.save(rotinaLog);		
	}

	@Override
	public void delete(long id) {
		rotinaLogRepository.deleteById(id);		
	}	

}
