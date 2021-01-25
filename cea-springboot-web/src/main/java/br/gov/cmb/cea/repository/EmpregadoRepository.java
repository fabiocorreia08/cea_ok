package br.gov.cmb.cea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cea.model.Empregado;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long>{
		
		List<Empregado> findByNome(String nome);
		List<Empregado> findByMatricula(String matricula);

}
