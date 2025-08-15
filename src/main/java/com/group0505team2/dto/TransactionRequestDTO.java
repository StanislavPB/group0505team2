package com.group0505team2.dto;


public class TransactionRequestDTO {
    private String desc;
    private String categoryName;
    private Double amount;
    private int accountName;

    public TransactionRequestDTO(String desc, String categoryName, Double amount, int accountName) {

        this.desc = desc;
        this.categoryName = categoryName;
        this.amount = amount;
        this.accountName = accountName;
    }


    public String getDesc() {
        return desc;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Double getAmount() {
        return amount;
    }

    public int getAccountName() {
        return accountName;
    }
}
