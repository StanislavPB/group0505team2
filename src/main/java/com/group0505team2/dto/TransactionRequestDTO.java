package com.group0505team2.dto;


import com.group0505team2.enums.Category;

public class TransactionRequestDTO {
    private String description;
    private String categoryName;
    private String amount;
    private String accountId;

    public TransactionRequestDTO() {
    }

    public TransactionRequestDTO(String description, String categoryName, String amount, String accountId) {

        this.description = description;
        this.categoryName = categoryName;
        this.amount = amount;
        this.accountId = accountId;
    }


    public String getDescription() {
        return description;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getAmount() {
        return amount;
    }

    public String getAccountId() {
        return accountId;
    }
}
