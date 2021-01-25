package br.gov.cmb.cea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cea.model.Rotina;

@Repository
public interface RotinaRepository extends JpaRepository<Rotina, Long>{
	

}

