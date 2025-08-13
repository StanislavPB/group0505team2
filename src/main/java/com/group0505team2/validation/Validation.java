package com.group0505team2.validation;

import com.group0505team2.dto.AccountRequestDTO;
import com.group0505team2.dto.UserRequestDTO;
import com.group0505team2.entity.User;

import java.util.List;

public class Validation {
    public static void validationUserRequest(UserRequestDTO userRequest, List<User> users) {
        if (userRequest.getName() == null || userRequest.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("name can not be empty");
        }
        if (!userRequest.getName().contains("A-Za-z")) {
            throw new IllegalArgumentException("name can be containing of letters");
        }
        if (userRequest.getLogin() == null || userRequest.getLogin().trim().isEmpty()) {
            throw new IllegalArgumentException("login can not be empty");
        }
        boolean loginExist = users.stream().anyMatch(user -> user.getLogin().equals(userRequest.getLogin()));
        if(loginExist){
            throw new IllegalArgumentException("user with this login already exists");
        }
        if (userRequest.getPassword() == null || userRequest.getPassword().trim().isEmpty()) {
            throw new IllegalArgumentException("password can not be empty");
        }
        if(userRequest.getPassword().length() < 8 || userRequest.getPassword().length() > 15){
            throw new IllegalArgumentException("password must be 8-15 symbols");
        }
        if (userRequest.getAddress() == null || userRequest.getAddress().trim().isEmpty()) {
            throw new IllegalArgumentException("address can not be empty");
        }
        if (userRequest.getProfession() == null || userRequest.getProfession().trim().isEmpty()) {
            throw new IllegalArgumentException("profession can not be empty");
        }
    }

    public static void validationAccountRequest(AccountRequestDTO accountRequest, List<User> users){
        if(accountRequest.getUser() == null){

        }
    }
}
