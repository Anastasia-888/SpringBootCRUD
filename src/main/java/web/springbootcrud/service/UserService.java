package web.springbootcrud.service;

import web.springbootcrud.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void add(User user);
    User getUserById(int id);
    void update(User newUser);
    void delete(User user);
}
