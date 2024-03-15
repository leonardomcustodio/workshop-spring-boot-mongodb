package br.com.leocustodio.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leocustodio.workshopmongo.domain.User;
import br.com.leocustodio.workshopmongo.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
    
}
