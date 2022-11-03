package com.ezoqc.todospring.components;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.function.Function;

@Component
public class JwtUtils {
    public static final long TOKEN_VALIDITY = 8 * 60 * 60;

    @Value("${jwt.secret}")
    private String secret;

//    public String generateToken(UserDetails userDetails) {
//        return Jwts.builder()
//                .setClaims(new HashMap<>())
//                .setSubject(userDetails.getUsername())
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() + TOKEN_VALIDITY * 1000))
//                .signWith(SignatureAlgorithm.HS512, this.secret)
//                .compact();
//    }
//
//    public String getUsernameFromToken(String token) {
//        Function<Claims, String> claimsResolver = Claims::getSubject;
//        Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//        return claimsResolver.apply(claims);
//    }
//
//    public Boolean validateToken(String token, UserDetails userDetails) {
////        final String username = getUsernameFromToken(token);
////        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
//    	return true;
//    }
//
//    private Boolean isTokenExpired(String token) {
//        Function<Claims, Date> claimsResolver = Claims::getExpiration;
//        Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//        final Date expiration = claimsResolver.apply(claims);
//        return expiration.before(new Date());
//    }

}
