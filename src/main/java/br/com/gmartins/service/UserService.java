package br.com.gmartins.service;

import br.com.gmartins.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    User findByUsername(String username);

    List<String> findUsers(List<Integer> idList);

    List<User> findAllUsers();

    User findUserByIdAndUsername(User user);
}
