package br.gov.cmb.cea.security;
/*
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.NotAuthorizedException;

import br.gov.cmb.common.ejb.anotacao.RegraDeValidacao;
import br.gov.cmb.common.ejb.configuracao.Configuracao;
import br.gov.cmb.common.ejb.vo.UsuarioVO;
import br.gov.cmb.common.exception.ValidacaoException;
import br.gov.cmb.common.rest.security.Authentication;
import br.gov.cmb.common.rest.security.AuthenticationContext;
import br.gov.cmb.common.rest.security.AuthenticationProvider;
import br.gov.cmb.common.rest.util.JwtTokenHelper;
import br.gov.cmb.common.security.rest.client.UsuarioClient;
import br.gov.cmb.common.security.rest.request.UsuarioRequest;
import br.gov.cmb.simeq.dao.TecnicoDAO;
import br.gov.cmb.simeq.entidade.Tecnico;
import br.gov.cmb.simeq.enums.PerfilEnum;

@Named
@RequestScoped
public class CeaAuthenticationProvider implements AuthenticationProvider {

	@Inject
	private HttpServletRequest request;
	
	@Inject AuthenticationContext authenticationContext;

	@Inject @Configuracao("jwt.tempoexpiracao")
	private Integer tempoExpiracao;

	@Inject @Configuracao("jwt.signkey")
	private String signKey;
	
	@Inject @Configuracao("simeq.idSistema")
	private Long idSistema;
	
	@Inject 
	private TecnicoDAO tecnicoDAO;
	
	AuthenticationContext aute;
	

	@Override
	public Authentication authenticate(Authentication authentication) {
		JwtTokenHelper jwtTokenHelper = new JwtTokenHelper(tempoExpiracao, signKey);
		
		UsuarioRequest usuarioRequest = createUsuarioRequest(authentication);
		UsuarioVO usuario = new UsuarioClient().autenticar(usuarioRequest);
		if (usuario == null) {
			throw new NotAuthorizedException("Wrong user or password");
		}
		SimeqAuthentication simeq = getAuthentication(usuario);
			
		this.validaUsuario(simeq);
					
		String token = jwtTokenHelper.generateToken(simeq);
		simeq.setToken(token);
		authenticationContext.setAuthentication(simeq);
		return simeq;	
	}
	
	private void validaUsuario(SimeqAuthentication simeqAuthentication) {
		if(simeqAuthentication.getDetails().getPerfis().isEmpty()) {
			throw new ValidacaoException("Usuário não encontrado.");
		}
		
		if (simeqAuthentication.getDetails().getPermissao().isEmpty()) {
			throw new ValidacaoException("Usuário não encontrado." + 
					"Por favor, entre em contato com a Casa da Moeda do Brasil. Para o caso de usuários inválidos.");
		}
		
		if(PerfilEnum.TECNICO.getIdPerfil().intValue() == simeqAuthentication.getDetails().getPerfis().iterator().next().getId()) {
			this.isTecnicoValido(simeqAuthentication);
		}
	}
	
	@RegraDeValidacao
	public void isTecnicoValido(SimeqAuthentication simeqAuthentication) {
		Tecnico tecnico = tecnicoDAO.buscarTecnicoPorMatricula(simeqAuthentication.getUsername());
		if(tecnico == null) {
			throw new ValidacaoException("Você não está cadastrado nesse sistema. Por gentileza entre em contato com o administrador para regularizar o seu cadastro.");
		}
	}
	
	private UsuarioRequest createUsuarioRequest(Authentication authentication) {
		String usuario = authentication.getUsername();
		String senha = ((SimeqAuthentication) authentication).getSenha();
		UsuarioRequest usuarioRequest = new UsuarioRequest(usuario, senha, idSistema);
		return usuarioRequest;
	}
	
	private SimeqAuthentication getAuthentication(UsuarioVO usuario) {
		SimeqAuthentication authentication = new SimeqAuthentication(usuario.getMatricula(), usuario);
		authentication.setDetails(usuario);
		return authentication;
	}

	@Override
	public List<String> getPermissions() {
		return this.getAuthentication().getPermissions();
	}

	@Override
	public Authentication getAuthentication() {
		JwtTokenHelper jwtTokenHelper = new JwtTokenHelper(tempoExpiracao, signKey);
		String token = request.getHeader(JwtTokenHelper.HEADER_TOKEN);
		List<String> permissions = jwtTokenHelper.getPermissions(token);
		String username = jwtTokenHelper.getUsername(token);
		Object details = jwtTokenHelper.getDetails(token);
		
		return new SimeqAuthentication(username, permissions, details);
	}
}
*/
