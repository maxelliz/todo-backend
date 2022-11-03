package com.ezoqc.todospring.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Long> {
    Optional<ApplicationUser> findByEmailIgnoreCase(String email);
}
