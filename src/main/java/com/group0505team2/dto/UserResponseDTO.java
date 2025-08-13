package com.group0505team2.dto;

import com.group0505team2.entity.Account;

import java.util.List;

public class UserResponseDTO {
    private String name;
    private String login;
    private String address;
    private String profession;
    private List<Account> accounts;

    public UserResponseDTO(String name, String login, String address, String profession, List<Account> accounts) {
        this.name = name;
        this.login = login;
        this.address = address;
        this.profession = profession;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getAddress() {
        return address;
    }

    public String getProfession() {
        return profession;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
