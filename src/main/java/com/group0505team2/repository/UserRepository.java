package com.group0505team2.repository;

import com.group0505team2.entity.User;
import com.group0505team2.repository.repositoryinterface.UserRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements UserRepositoryInterface {
    private final List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    @Override
    public User create(User user) {
        users.add(user);
        return user;
    }

    @Override
    public void update(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    @Override
    public Optional<User> findByLogin(String login) {
        return users.stream()
                .filter(user -> user.getLogin().equals(login)).findFirst();
    }

    @Override
    public Optional<User> findById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id).findFirst();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

}