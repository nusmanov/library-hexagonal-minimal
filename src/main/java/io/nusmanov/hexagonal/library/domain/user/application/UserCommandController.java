package io.nusmanov.hexagonal.library.domain.user.application;

import io.nusmanov.hexagonal.library.domain.user.core.ports.incoming.AddNewUser;
import io.nusmanov.hexagonal.library.domain.user.core.model.AddUserCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserCommandController {

    private final AddNewUser addNewUser;

    @PostMapping("")
    public ResponseEntity<String> addNewUser(@RequestBody AddUserCommand addUserCommand){
        addNewUser.handle(addUserCommand);
        return new ResponseEntity<>("New user was added to library", HttpStatus.CREATED);
    }
}
