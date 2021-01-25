package br.gov.cmb.cea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.cmb.cea.model.StatusRotina;
import br.gov.cmb.cea.service.StatusRotinaService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/status")
public class StatusRotinaController {
	
	@Autowired
	StatusRotinaService statusRotinaService;
	
	@GetMapping
	public ResponseEntity<List<StatusRotina>> listaStatus(){		
		return ResponseEntity.ok().body(statusRotinaService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<StatusRotina> buscaPorId(@PathVariable Long id){
		return ResponseEntity.ok().body(statusRotinaService.getById(id));
	}
	
	@GetMapping("/buscarStatusAtual")
	public ResponseEntity<Boolean> buscaStatusAtual(){		
		return ResponseEntity.ok().body(statusRotinaService.buscarStatusAtual());
	}
	
	@PostMapping("/salvar")
	public StatusRotina salvar(@RequestBody StatusRotina statusRotina) {
		return statusRotinaService.save(statusRotina);
	}	
		
}