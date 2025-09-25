package br.com.josenobre.userapi.services.impl;

import br.com.josenobre.userapi.domain.User;
import br.com.josenobre.userapi.repositories.UserRepository;
import br.com.josenobre.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
