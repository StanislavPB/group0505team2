package com.group0505team2.dto;

import com.group0505team2.entity.Transaction;
import com.group0505team2.entity.User;

import java.util.List;

public class AccountRequestDTO {
    private int userId;
    private String accountName;

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
