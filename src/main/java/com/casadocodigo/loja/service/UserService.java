package com.casadocodigo.loja.service;

import com.casadocodigo.loja.domain.User;
import com.casadocodigo.loja.exception.UserNameNotFoundException;
import com.casadocodigo.loja.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    UserRepository userRepository;

    public User getUserByEmail(String email){
        User user = userRepository.loadUserByUsername(email);
        if (user == null) {
            throw new UserNameNotFoundException("Usuário "  + email + " não foi encontrado");
        }
        return user;
    }

    public void record(User user){
        userRepository.save(user);
    }

}
