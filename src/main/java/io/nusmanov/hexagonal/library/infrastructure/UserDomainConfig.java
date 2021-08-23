package io.nusmanov.hexagonal.library.infrastructure;

import io.nusmanov.hexagonal.library.domain.user.core.ports.incoming.AddNewUser;
import io.nusmanov.hexagonal.library.domain.user.core.ports.outgoing.UserDatabase;
import io.nusmanov.hexagonal.library.domain.user.core.UserFacade;
import io.nusmanov.hexagonal.library.domain.user.infrastructure.UserDatabaseAdapter;
import io.nusmanov.hexagonal.library.domain.user.infrastructure.UserRepository;
import org.springframework.context.annotation.Bean;

public class UserDomainConfig {

    @Bean
    public UserDatabase userDatabase(UserRepository userRepository){
        return new UserDatabaseAdapter(userRepository);
    }

    @Bean
    public AddNewUser addNewUser(UserDatabase userDatabase){
        return new UserFacade(userDatabase);
    }
}
