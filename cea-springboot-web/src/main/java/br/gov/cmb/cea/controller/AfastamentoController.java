package br.gov.cmb.cea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.cea.model.Afastamento;
import br.gov.cmb.cea.model.UsuarioAD;
import br.gov.cmb.cea.service.AfastamentoService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/afastamentos")
public class AfastamentoController {
	
	@Autowired
	AfastamentoService afastamentoService;	
	
	@GetMapping
	public ResponseEntity<List<Afastamento>> listaUsuarioADs(){		
		return ResponseEntity.ok().body(afastamentoService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UsuarioAD> buscaPorId(@PathVariable Long id){
		//return ResponseEntity.ok().body(afastamentoRepo.findById(id).get());
		return null;
	}	
	
}
