package config;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenProvider {

	public final static String SECRET     = "iTHrq_DArQd6ufLDrmX4UD__Pdqa7xjkOw3bknsRuZ1G7AH8fuwT77fYvdQKy0YD6bvPBN4lVW0edmLshPhGsw";
	public final static Long   EXPIRATION = 86400000L;

	public String generateToken(String memberNumber, String fisrtName, String lastName, String email) {
		Claims claims = getPayload(memberNumber, fisrtName, lastName, email);

		Map<String, Object> headerClaims = new HashMap<String, Object>();
		headerClaims.put("kid", "app_5d9b7e8e8c98d1001084e75d");
		headerClaims.put("alg", "HS256");
		headerClaims.put("typ", "JWT");
		
		System.out.println("Date Expiration :" + new Date(System.currentTimeMillis() + EXPIRATION));
		
		return Jwts.builder()
				   .setHeader(headerClaims)
				   .setClaims(claims)
				   .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
				   .signWith(SignatureAlgorithm.HS512, SECRET.getBytes())
				   .compact();
	}

	private Claims getPayload(String memberNumber, String fisrtName, String lastName, String email) {
		 Claims claims = Jwts.claims().setSubject(memberNumber);
				claims.put("userId",    memberNumber);
				claims.put("fisrtName", fisrtName);
				claims.put("lastName",  lastName);
				claims.put("email",     email);
				claims.put("scope",     "appUser");

		return claims;
	}

	public boolean isValid(String token) {
		Claims claims = parseToken(token);

		if (claims != null) {

			String userId = claims.getSubject();
			Date expirationDate = claims.getExpiration();
			Date now = new Date(System.currentTimeMillis());

			if (userId != null && expirationDate != null && now.before(expirationDate)) {
				return true;
			}
		}
		return false;
	}

	private Claims parseToken(String token) {
		try {
			return Jwts.parser().setSigningKey(SECRET.getBytes()).parseClaimsJws(token).getBody();
		} catch (Exception e) {
			return null;
		}
	}

	public String getUserId(String token) {
		Claims claims = parseToken(token);
		if (claims != null) {
			return claims.getSubject();
		}
		return null;
	}
}
