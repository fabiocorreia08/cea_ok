package br.gov.cmb.cea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.cea.model.Rotina;
import br.gov.cmb.cea.service.RotinaService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/rotinas")
public class RotinaController {
	
	@Autowired
	RotinaService rotinaService;
	
	@GetMapping
	public ResponseEntity<List<Rotina>> listaRotinas(){		
		return ResponseEntity.ok().body(rotinaService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Rotina> buscaPorId(@PathVariable Long id){
		return ResponseEntity.ok().body(rotinaService.getById(id));
	}	
	
	@GetMapping("/iniciar")
	public void iniciar(){
		System.out.println("entrou aquiiiiiiiiiiiiii");
		
	}
		
}