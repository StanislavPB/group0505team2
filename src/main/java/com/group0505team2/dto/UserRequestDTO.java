package com.group0505team2.dto;

import com.group0505team2.entity.Account;

import java.util.List;

public class UserRequestDTO {
    private String name;
    private String login;
    private String password;
    private String address;
    private String profession;

    public UserRequestDTO() {
    }

    public UserRequestDTO(String name, String login, String password, String address, String profession) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.address = address;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getProfession() {
        return profession;
    }
}
