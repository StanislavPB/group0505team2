package com.group0505team2.repository.repositoryinterface;

import com.group0505team2.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryInterface {
    User create(User user);

    boolean update(User user);

    boolean delete(int id);

    Optional<User> findByLogin(String login);

    Optional<User> findById(int id);

    List<User> findAll();
}