package br.gov.cmb.cea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.cmb.cea.model.UsuarioAD;
import br.gov.cmb.cea.repository.UsuarioADRepository;



@Service
public class UsuarioADServiceImpl implements UsuarioADService{
	
	@Autowired
	UsuarioADRepository usuarioADRepository;

	@Override
	public List<UsuarioAD> getAll() {
		return (List<UsuarioAD>) usuarioADRepository.findAll();
	}	

	@Override
	public UsuarioAD getById(long id) {
		return usuarioADRepository.getOne(id);		
	}	

}
