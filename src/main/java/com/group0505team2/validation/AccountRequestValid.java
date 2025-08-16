package com.group0505team2.validation;

import com.group0505team2.dto.AccountRequestDTO;
import com.group0505team2.repository.UserRepository;

public class AccountRequestValid {
    public static void validationAccountRequest(AccountRequestDTO accountRequest, UserRepository userRepository) {
        if(accountRequest == null){
            throw new IllegalArgumentException("Account request can not be empty");
        }

        if(accountRequest.getAccountName() == null || accountRequest.getAccountName().trim().isEmpty()){
            throw new IllegalArgumentException("Account name can not be empty");
        }
        if(accountRequest.getUserId() == null || accountRequest.getUserId().trim().isEmpty()){
            throw new IllegalArgumentException("User id can not be empty");
        }

        if(!accountRequest.getUserId().matches("[0-9]+")){
            throw new IllegalArgumentException("User id can only consist of numbers");
        }
        if(userRepository.findById(Integer.parseInt(accountRequest.getUserId())).isEmpty()){
            throw new IllegalArgumentException("User with this id doesn't exist");
        }
    }
}
