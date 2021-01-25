package br.gov.cmb.cea.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UsuarioAD {
	
	@Id
	private Long id;
	private String fullName;	
	private String physicalDeliveryOfficeName;	
	private String description;	
	private String userAccountControl;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhysicalDeliveryOfficeName() {
		return physicalDeliveryOfficeName;
	}
	public void setPhysicalDeliveryOfficeName(String physicalDeliveryOfficeName) {
		this.physicalDeliveryOfficeName = physicalDeliveryOfficeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUserAccountControl() {
		return userAccountControl;
	}
	public void setUserAccountControl(String userAccountControl) {
		this.userAccountControl = userAccountControl;
	}

}
