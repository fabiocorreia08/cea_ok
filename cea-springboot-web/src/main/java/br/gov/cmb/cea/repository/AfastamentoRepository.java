package br.gov.cmb.cea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cea.model.Afastamento;
import br.gov.cmb.cea.model.AfastamentoPK;

@Repository
public interface AfastamentoRepository extends JpaRepository<Afastamento, AfastamentoPK>{
	

}

