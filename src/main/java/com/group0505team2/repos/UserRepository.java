package com.group0505team2.repos;

import com.group0505team2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }

    public void create(User user) {
        if (read(user.getLogin()) == null) {
            users.add(user);
        } else throw new IllegalArgumentException("user with this login already exist");
    }

    public User read(String login){
        for(User user : users){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    public void update (User user){

    }

    public void delete (String login){
        for(User user : users) {
            if (user.getLogin().equals(login)) {
                users.remove(user);
                break;
            }
        }
    }

    public User findByLogin(String login){
        for(User user : users){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    public List<User> findAll(){
        return new ArrayList<>(users);
    }

}
