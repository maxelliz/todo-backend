package com.ezoqc.todospring.components;

import com.ezoqc.todospring.authentication.JwtUserDetailsService;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtRequestFilter /*extends OncePerRequestFilter*/ {
    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

//    @Autowired
//    private JwtUtils jwtUtils;
//
//    @Override
//    protected void doFilterInternal(
//            HttpServletRequest httpServletRequest,
//            HttpServletResponse httpServletResponse,
//            FilterChain filterChain)
//    throws ServletException, IOException {
//        final String requestTokenHeader = httpServletRequest.getHeader("Authorization");
//        String username = null;
//        String token = null;
//        if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
//            token = requestTokenHeader.substring(7);
//            try {
//                username = this.jwtUtils.getUsernameFromToken(token);
//            } catch (IllegalArgumentException e) {
//                System.out.println("Unable to get JWT Token");
//            } catch (ExpiredJwtException e) {
//                System.out.println("JWT Token has expired");
//            }
//        } else {
//            System.out.println("No JWT provided");
//        }
//        
//        username = "sylvain.cloutier@ezoqc.com";
//        
//        if (token != null && username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//            UserDetails userDetails = this.jwtUserDetailsService.loadUserByUsername(username);
//
//            if (this.jwtUtils.validateToken(token, userDetails)) {
//                UsernamePasswordAuthenticationToken usrPwdToken = new UsernamePasswordAuthenticationToken(
//                        userDetails, null, userDetails.getAuthorities());
//                usrPwdToken
//                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
//                SecurityContextHolder.getContext().setAuthentication(usrPwdToken);
//            }
//        }
//
//        filterChain.doFilter(httpServletRequest, httpServletResponse);
//    }
}