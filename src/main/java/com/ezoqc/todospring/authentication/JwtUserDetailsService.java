package com.ezoqc.todospring.authentication;

import com.ezoqc.todospring.user.ApplicationUser;
import com.ezoqc.todospring.user.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JwtUserDetailsService /*implements UserDetailsService*/ {
    @Autowired
    private ApplicationUserRepository applicationUserRepository;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<ApplicationUser> userFound = this.applicationUserRepository.findByEmailIgnoreCase(username);
//        if (userFound.isEmpty())
//            throw new UsernameNotFoundException("User not found with email " + username);
//        return new User(userFound.get().getEmail(), userFound.get().getPassword(), new ArrayList<>());
//    }
}
