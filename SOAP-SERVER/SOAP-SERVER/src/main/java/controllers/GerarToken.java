package controllers;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

import config.TokenProvider;

@WebService
public class GerarToken {

	private static Logger logger = LoggerFactory.getLogger(GerarToken.class);

	@WebMethod
	public String getToken( @WebParam(name = "memberNumber") String memberNumber
			               ,@WebParam(name = "fisrtName")    String fisrtName
			               ,@WebParam(name = "lastName")     String lastName
			               ,@WebParam(name = "email")        String email
			              ) {
		
		
		return getTokenJWT(memberNumber, fisrtName, lastName, email);
		
		//return gerarTokenOP1(memberNumber, fisrtName, lastName, email);
	}
	
	private String getTokenJWT(String memberNumber, String fisrtName, String lastName, String email) {
		TokenProvider tokenProvider = new TokenProvider();
		String tokenGerado = tokenProvider.generateToken(memberNumber, fisrtName, lastName, email);
		return tokenGerado;
	}

	private String gerarTokenOP1(String memberNumber, String fisrtName, String lastName, String email) {
		JWT.create();
		String token = "";
		try {
			Algorithm algorithm = Algorithm.HMAC256("iTHrq_DArQd6ufLDrmX4UD__Pdqa7xjkOw3bknsRuZ1G7AH8fuwT77fYvdQKy0YD6bvPBN4lVW0edmLshPhGsw");
			Map<String, Object> headerClaims = new HashMap<String, Object>();
								headerClaims.put("kid", "app_5d9b7e8e8c98d1001084e75d");
								headerClaims.put("alg", "HS256");
								headerClaims.put("typ", "JWT");

			token = JWT.create()
					   .withHeader(headerClaims)
					   .withClaim("userId",     memberNumber)
					   .withClaim("fisrtName",  fisrtName)
					   .withClaim("lastName",   lastName)
					   .withClaim("email",      email)
					   .withClaim("scope",      "appUser")
					   .sign(algorithm);
		} catch (JWTCreationException exception) {
			logger.error("não foi possivel gerar JWT para o messager smooch", exception);
		}
		return token;
	}

	
	
}
