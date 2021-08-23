package io.nusmanov.hexagonal.library.domain.user.infrastructure;

import io.nusmanov.hexagonal.library.domain.user.core.ports.outgoing.UserDatabase;
import io.nusmanov.hexagonal.library.domain.user.core.model.User;
import io.nusmanov.hexagonal.library.domain.user.core.model.UserIdentifier;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserDatabaseAdapter implements UserDatabase {

    private final UserRepository userRepository;

    @Override
    public UserIdentifier save(User user) {
        User savedUser = userRepository.save(user);
        return new UserIdentifier(savedUser.getIdentifierAsLong());
    }
}
