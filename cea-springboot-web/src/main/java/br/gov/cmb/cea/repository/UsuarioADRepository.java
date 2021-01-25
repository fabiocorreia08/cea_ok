package br.gov.cmb.cea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.cmb.cea.model.UsuarioAD;

@Repository
public interface UsuarioADRepository extends JpaRepository<UsuarioAD, Long>{
	
	@Query("SELECT u FROM UsuarioAD u WHERE u.fullName like ?1")
	List<UsuarioAD> findByNome(String fullName);
	
	@Query("SELECT u FROM UsuarioAD u WHERE u.physicalDeliveryOfficeName like ?1")
	List<UsuarioAD> findByMatricula(String physicalDeliveryOfficeName);

}
