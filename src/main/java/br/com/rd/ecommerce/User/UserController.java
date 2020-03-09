package br.com.rd.ecommerce.User;

import br.com.rd.ecommerce.User.model.User;
import br.com.rd.ecommerce.User.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create-user")
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

}
