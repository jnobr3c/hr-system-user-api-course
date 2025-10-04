package br.com.josenobre.userapi.services;

import br.com.josenobre.userapi.domain.User;

import java.util.List;


public interface UserService {

    User findById(Long id);
    List<User> findAll();

}
