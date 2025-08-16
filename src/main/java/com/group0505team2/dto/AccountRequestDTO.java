package com.group0505team2.dto;

public class AccountRequestDTO {
    private String userId;
    private String accountName;

    public AccountRequestDTO() {
    }

    public AccountRequestDTO(String userId, String accountName) {
        this.userId = userId;
        this.accountName = accountName;
    }

    public String getUserId() {
        return userId;
    }

    public String getAccountName() {
        return accountName;
    }

}