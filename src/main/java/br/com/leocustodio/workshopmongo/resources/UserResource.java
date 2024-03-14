package br.com.leocustodio.workshopmongo.resources;

import org.springframework.web.bind.annotation.RestController;
import br.com.leocustodio.workshopmongo.domain.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1","Maria Brown","mariabrown@gmail.com");
        User alex = new User("2", "Alex Green", "alex@gmail.com");
        List<User> list = new ArrayList<>();
        list.add(maria);
        list.add(alex);
        return ResponseEntity.ok().body(list);
    }
}
