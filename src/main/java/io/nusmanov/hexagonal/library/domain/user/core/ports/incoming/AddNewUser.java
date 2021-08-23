package io.nusmanov.hexagonal.library.domain.user.core.ports.incoming;

import io.nusmanov.hexagonal.library.domain.user.core.model.AddUserCommand;
import io.nusmanov.hexagonal.library.domain.user.core.model.UserIdentifier;

public interface AddNewUser {
    UserIdentifier handle(AddUserCommand addUserCommand);
}
