package com.group0505team2.dto;

public class AccountRequestDTO {
    private final int userId;
    private final String accountName;

    public AccountRequestDTO(int userId, String accountName) {
        this.userId = userId;
        this.accountName = accountName;
    }

    public int getUserId() {
        return userId;
    }

    public String getAccountName() {
        return accountName;
    }

}