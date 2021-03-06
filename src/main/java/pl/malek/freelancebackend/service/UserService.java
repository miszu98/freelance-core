package pl.malek.freelancebackend.service;

import org.springframework.validation.BindingResult;
import pl.malek.freelancebackend.dto.Credentials;
import pl.malek.freelancebackend.dto.JwtResponse;
import pl.malek.freelancebackend.dto.User;
import pl.malek.freelancebackend.dto.UserExistResponse;
import pl.malek.freelancebackend.exception.UserAccountValidationException;
import pl.malek.freelancebackend.exception.UserAlreadyExistException;

public interface UserService {

    void register(User user, BindingResult result)
            throws UserAccountValidationException, UserAlreadyExistException;

    UserExistResponse checkIfUserExist(String email);

    JwtResponse authenticate(Credentials credentials) throws Exception;

}
