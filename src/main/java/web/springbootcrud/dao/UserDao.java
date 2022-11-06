package web.springbootcrud.dao;

import web.springbootcrud.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void add(User user);

    User getUserById(int id);

    void update(User newUser, int id);

    void delete(User user);
}
