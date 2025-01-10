package com.notes.service;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.management.RuntimeErrorException;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {
	
	private String SecreteKey;
	
	
	public JwtService() {
		SecreteKey = generateKey();
	}
	
	private String generateKey() {
		try {
			KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
			SecretKey secretKey = keyGen.generateKey();
			System.out.println("SecretKey :"+secretKey.toString());
			return Base64.getEncoder().encodeToString(secretKey.getEncoded());
			
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Error Generating Key ",e); 
		}
		
	}


	public String getToken(String username) {
		Map<String,Object> claims = new HashMap<>();
		 
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(username)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() +1000*60*30))
				.signWith(getKey(), SignatureAlgorithm.HS256).compact();
				
	}
	
	private Key getKey() {
		byte[] keyBytes = Decoders.BASE64.decode(SecreteKey);
		return Keys.hmacShaKeyFor(keyBytes);
	}  

	public String extractUsername(String token) {
		return extractClaim(token, Claims::getSubject);
	}

	private <T> T extractClaim(String token,Function<Claims, T> claimResolver) {
		final Claims claims = extractAllClaims(token);
		return claimResolver.apply(claims);
	}

	private Claims extractAllClaims(String token) {
	    return Jwts.parserBuilder()
	               .setSigningKey(getKey())
	               .build()
	               .parseClaimsJws(token)
	               .getBody();
	}


	public boolean validateToken(String token, UserDetails userDetails) {
		final String userName = extractUsername(token);
		return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}

	private boolean isTokenExpired(String token) {
		return extractxpiration(token).before(new Date());
	}

	private Date extractxpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}

}
