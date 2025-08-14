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
        if (user == null) {
            throw new IllegalArgumentException("User can not be null");
        }
        if (user.getLogin() == null || user.getLogin().trim().isEmpty()) {
            throw new IllegalArgumentException("Login can not be empty");
        }
        if (read(user.getLogin()) != null) {
            throw new IllegalArgumentException("user with this login is already exist");
        }
        String password = user.getPassword();
        if (password == null || password.length() < 8 || password.length() > 15) {
            throw new IllegalArgumentException("Пароль должен быть от 8 до 15 символов");
        }
        users.add(user);
    }

    public User read(String login){
        for(User user : users){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        throw new IllegalArgumentException("User with this login doesn't exist");
    }

    public void update(User user) {
        if (user == null || user.getLogin() == null || user.getLogin().trim().isEmpty()) {
            throw new IllegalArgumentException("Некорректный пользователь или логин");
        }
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getLogin().equals(user.getLogin())) {
                String newPassword = user.getPassword();
                if (newPassword != null && !newPassword.equals(users.get(i).getPassword())) {
                    if (newPassword.length() < 8 || newPassword.length() > 15) {
                        throw new IllegalArgumentException("Пароль должен быть от 8 до 15 символов");
                    }
                }
                users.set(i, user);
                return;
            }
        }
        throw new IllegalArgumentException("User with this login doesn't exist");
    }

    public void delete (String login){
        for(User user : users) {
            if (user.getLogin().equals(login)) {
                users.remove(user);
                break;
            }
        }
        throw new IllegalArgumentException("User with this login doesn't exist");
    }

    public User findByLogin(String login) {
        return read(login);
    }

    public boolean existingId(int id){
        for(User user : users){
            if(user.getId() == id){
                return true;
            }
        }
        return false;
    }

    public List<User> findAll(){
        return new ArrayList<>(users);
    }

}
