package com.group0505team2.validation;

import com.group0505team2.dto.TransactionRequestDTO;
import com.group0505team2.enums.Category;
import com.group0505team2.repository.AccountRepository;

public class TransactionRequestValid {
    public static void validationTransactionRequest(TransactionRequestDTO transactionRequest, AccountRepository accountRepository) {
        if(transactionRequest == null){
            throw new IllegalArgumentException("Transaction request can not be empty");
        }

        if(transactionRequest.getAccountId() == null || transactionRequest.getAccountId().trim().isEmpty()){
            throw new IllegalArgumentException("Account id can not be empty");
        }
        if(transactionRequest.getDescription() == null || transactionRequest.getDescription().trim().isEmpty()){
            throw new IllegalArgumentException("Description can not be empty");
        }
        if(transactionRequest.getCategoryName() == null || transactionRequest.getCategoryName().trim().isEmpty()){
            throw new IllegalArgumentException("Category name can not be empty");
        }
        if(transactionRequest.getAmount() == null){
            throw new IllegalArgumentException("Amount field can not be empty");
        }

        if(transactionRequest.getDescription().length() > 200){
            throw new IllegalArgumentException("the description should be no more than 200 characters");
        }
        if(!Category.isValidCategory(transactionRequest.getCategoryName())){
            throw new IllegalArgumentException("Invalid category name");
        }
        if(!transactionRequest.getAccountId().matches("[0-9]+")){
            throw new IllegalArgumentException("Account id can only consist of numbers");
        }
        if(accountRepository.findById(Integer.parseInt(transactionRequest.getAccountId())).isEmpty()){
            throw new IllegalArgumentException("Account with this id doesn't exist");
        }

        try{
            Double.parseDouble(transactionRequest.getAmount().replace(',', '.'));
        } catch(NumberFormatException e){
            throw new IllegalArgumentException("Invalid amount format");
        }
        if(Double.parseDouble(transactionRequest.getAmount()) <= 0){
            throw new IllegalArgumentException("Amount can not be equal to 0 and should be positive");
        }
    }
}
