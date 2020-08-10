package com.sdk.securedsuperheroes.service;

import com.sdk.securedsuperheroes.entity.ApplicationUser;
import com.sdk.securedsuperheroes.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserService {

    @Autowired
    ApplicationUserRepository repository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public ApplicationUser getByUsername(String username) {
        return repository.findByUsername(username);
    }

    public void addUser(ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        repository.save(user);
    }
    
}
