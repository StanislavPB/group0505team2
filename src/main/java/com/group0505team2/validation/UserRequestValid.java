package com.group0505team2.validation;

import com.group0505team2.dto.UserRequestDTO;
import com.group0505team2.repository.UserRepository;

public class UserRequestValid {
    public static void validationUserRequest(UserRequestDTO userRequest, UserRepository userRepository) {
        if(userRequest == null){
            throw new IllegalArgumentException("User request can not be empty");
        }

        if(userRequest.getName() == null || userRequest.getName().trim().isEmpty()){
            throw new IllegalArgumentException("User name can not be empty");
        }
        if(userRequest.getLogin() == null || userRequest.getLogin().trim().isEmpty()){
            throw new IllegalArgumentException("User login can not be empty");
        }
        if(userRequest.getPassword() == null || userRequest.getPassword().trim().isEmpty()){
            throw new IllegalArgumentException("User password can not be empty");
        }
        if(userRequest.getAddress() == null || userRequest.getAddress().trim().isEmpty()){
            throw new IllegalArgumentException("User address can not be empty");
        }
        if(userRequest.getProfession() == null || userRequest.getProfession().trim().isEmpty()){
            throw new IllegalArgumentException("User profession can not be empty");
        }

        if(userRepository.findByLogin(userRequest.getLogin()).isPresent()){
            throw new IllegalArgumentException("User with this login already exists");
        }
        if(!userRequest.getName().matches("[A-Za-z]+")){
            throw new IllegalArgumentException("The name can only consist of Latin letters");
        }
        if(userRequest.getPassword().contains(" ")){
            throw new IllegalArgumentException("no spaces are allowed in password");
        }
        if(userRequest.getPassword().length() < 8 || userRequest.getPassword().length() > 15) {
            throw new IllegalArgumentException("Password must be at 8-15 characters long");
        }
    }
}
