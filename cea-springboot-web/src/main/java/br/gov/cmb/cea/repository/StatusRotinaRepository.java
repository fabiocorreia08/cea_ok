package br.gov.cmb.cea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cea.model.StatusRotina;

@Repository
public interface StatusRotinaRepository extends JpaRepository<StatusRotina, Long>{
	
	@Query("SELECT MAX(s.value) FROM StatusRotina s")	
	public Boolean buscarStatusAtual();	

}

