package com.group0505team2.repos;

import com.group0505team2.entity.Account;
import com.group0505team2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private List<Account> accounts = new ArrayList<>();
    private UserRepository userRepository;
    private int count = 1;

    public AccountRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Account create(Account account){
        if(account == null){
            throw new IllegalArgumentException("account can not be empty");
        }
        if(account.getAccountName() == null || account.getAccountName().trim().isEmpty()){
            throw new IllegalArgumentException("account name can not be empty");
        }
        if(!userRepository.existingId(account.getUserId())){
            throw new IllegalArgumentException("user with this id doesn't exist");
        }

        account.setId(count++);
        accounts.add(account);
        return account;
        // после возвращения этого объекта в СЕРВИСЕ нужно будет обратится к UserService чтобы в User
        // в List<Account> сохранить этот аккаунт

    }

    public Account read(int id){
        for(Account acc : accounts){
            if(acc.getId() == id){
                return acc;
            }
        }
        throw new IllegalArgumentException("Account with this name doesn't exist");
    }

    public void update(Account account){
        if(account == null){
            throw new IllegalArgumentException("account can not be empty");
        }
        if(account.getAccountName() == null || account.getAccountName().trim().isEmpty()){
            throw new IllegalArgumentException("account name can not be empty");
        }
        if(!userRepository.existingId(account.getUserId())){
            throw new IllegalArgumentException("user with this id doesn't exist");
        }

        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getId() == account.getId()){
                accounts.set(i, account);
                return;
            }
        }
        throw new IllegalArgumentException("account with this id doesn't exist");
    }

    public void delete (Account account){
        for(Account acc : accounts){
            if(acc.getId() == account.getId()){
                accounts.remove(account);
            }
        }
        throw new IllegalArgumentException("account with this id doesn't exist");
    }

    public Account findById(int id){
        return read(id);
    }

    public List<Account> findAll(){
        return new ArrayList<>(accounts);
    }
}