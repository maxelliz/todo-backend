package com.ezoqc.todospring;

//import com.ezoqc.todospring.authentication.dto.AuthenticationResponseDTO;
//import com.ezoqc.todospring.authentication.dto.AuthenticationRequestDTO;
//import com.ezoqc.todospring.authentication.JwtUserDetailsService;
import com.ezoqc.todospring.components.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @Autowired
    private JwtUtils jwtUtils;

//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private JwtUserDetailsService jwtUserDetailsService;
//
//    @PostMapping("/authenticate")
//    public AuthenticationResponseDTO authenticate(@RequestBody AuthenticationRequestDTO authDto) {
//        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(authDto.email, authDto.password);
//        this.authenticationManager.authenticate(authToken);
//        UserDetails userDetails = this.jwtUserDetailsService.loadUserByUsername(authDto.email);
//        String token = this.jwtUtils.generateToken(userDetails);
//        AuthenticationResponseDTO response = new AuthenticationResponseDTO();
//        response.token = token;
//        return response;
//    }
}
