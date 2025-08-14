package com.group0505team2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private static int nextId = 1;
    private int id;
    private String name;
    private String login;
    private String password;
    private String address;
    private String profession;
    private List<Account> accounts;

    public User(String name, String login, String password, String address, String profession) {
        this.id = nextId++;
        this.name = name;
        this.login = login;
        this.password = password;
        this.address = address;
        this.profession = profession;
        this.accounts = new ArrayList<>();
    }

    public int getId() {
        return id;
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

    public void addNewAcc(Account account){
        accounts.add(account);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", profession='" + profession + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, login, password, address, profession, accounts);
    }
}
