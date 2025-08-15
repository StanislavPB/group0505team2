package com.group0505team2.validation;

import com.group0505team2.dto.AccountRequestDTO;
import com.group0505team2.dto.TransactionRequestDTO;
import com.group0505team2.dto.UserRequestDTO;
import com.group0505team2.entity.User;
import com.group0505team2.enums.Category;

import java.util.ArrayList;
import java.util.List;

public class Validation {
    public static List<String> validate(AccountRequestDTO accountRequestDTO) {
        List<String> errors = new ArrayList<>();
        if (accountRequestDTO.getUserId() <= 0) {
            errors.add("userId should be greater than 0");
        }
        if (accountRequestDTO.getAccountName() == null
                || !accountRequestDTO.getAccountName().matches("^[A-Za-zА-Яа-яЁё0-9]{3,30}$")) ;
        {
            errors.add("accountName should not be empty");
        }
        return errors;

    }

    public static List<String> validate(TransactionRequestDTO transactionRequest) {
        List<String> errors = new ArrayList<>();
        if (transactionRequest.getDesc() != null && (transactionRequest.getDesc().length() < 3
                || transactionRequest.getDesc().length() > 30)) {
            errors.add("length of desc should be between 3 and 30");
        }
        if (!containsInEnum(transactionRequest.getCategoryName())) {
            errors.add("categoryName should contains valued 'category'");
        }
        if (transactionRequest.getAmount() == null) {
            errors.add("amount should not be null");
        }

        return errors;
    }

    public static List<String> validate(UserRequestDTO userRequest) {
        List<String> errors = new ArrayList<>();
        if (userRequest.getName() == null || !userRequest.getName().matches("^[A-ZА-ЯЁ][a-zа-яё]{2,29}$")) {
            errors.add("Name must start with a capital letter and contain only letters (3–30 characters)");
        }
        if (userRequest.getLogin() == null || !userRequest.getLogin().matches("^[A-Za-z]{3,12}$")) {
            errors.add("login must be written in Latin and contain 3-12 characters and not contain special characters");
        }
        if (userRequest.getPassword() == null || !userRequest.getPassword().matches("^(?=.*[A-Z])(?=.*[^A-Za-z0-9])[A-Za-z[^A-Za-z0-9]]{8,20}$")) {
            errors.add("the password must not be empty and must contain a capital letter, only Latin, contains 1 special character, minimum 8 characters, maximum 20");
        }
        if (userRequest.getAddress() == null || !userRequest.getAddress().matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            errors.add("not correct E-mail address format");
        }
        if (userRequest.getProfession() == null || !userRequest.getProfession().matches("^[A-Z][a-zA-Z]{2,29}$")) {
            errors.add("Profession must start with a capital letter and contain only letters (3–30 characters");
        }
        return errors;
    }

    private static boolean containsInEnum(String categoryName) {
        for (Category category : Category.values()) {
            if (categoryName.equals(category.name())) {
                return true;
            }
        }
        return false;
    }
}
