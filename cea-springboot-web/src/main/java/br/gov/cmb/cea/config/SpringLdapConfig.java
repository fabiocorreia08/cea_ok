package br.gov.cmb.cea.config;

import org.springframework.ldap.core.support.BaseLdapPathBeanPostProcessor;

//@Configuration
public class SpringLdapConfig {
	
	//@Value("${spring.ldap.base}")
    private String baseDn;

    //@Bean
    public BaseLdapPathBeanPostProcessor ldapPathBeanPostProcessor(){
        BaseLdapPathBeanPostProcessor baseLdapPathBeanPostProcessor = new BaseLdapPathBeanPostProcessor();
        baseLdapPathBeanPostProcessor.setBasePath(baseDn);
        return baseLdapPathBeanPostProcessor;
    }

}
