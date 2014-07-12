package org.upiita.spring.seguridad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class LoginExitosoManejador extends SavedRequestAwareAuthenticationSuccessHandler{
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Si el login es exitoso, reiniciamos el contador de loginsFallidos
		request.getSession().setAttribute("loginFallidos", 0);
		
		super.onAuthenticationSuccess(request, response, authentication);
	}

}
