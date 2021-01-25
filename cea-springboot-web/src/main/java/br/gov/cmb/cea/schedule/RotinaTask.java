package br.gov.cmb.cea.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class RotinaTask {
	
	@Autowired
	//RotinaController  rotinaController;	
		
	//@Scheduled(cron = "0 25 15 * * *")
	public void iniciar(){		
		//rotinaController.iniciar();
	}	

}
