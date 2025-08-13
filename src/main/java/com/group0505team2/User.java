package com.group0505team2;

import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private String login;
    private String password;
    private String address;
    private String profession;
    private List<Account> accounts;

    public User(String name, String login, String password, String address, String profession, List<Account> accounts) {
        this.name = name;
        this.login = login;
        this.password = password;
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

    public String getPassword() {
        return password;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", profession='" + profession + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login, password, address, profession, accounts);
    }
}
