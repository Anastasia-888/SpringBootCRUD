package web.springbootcrud.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.springbootcrud.dao.UserDao;
import web.springbootcrud.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void update(User newUser, int id) {
        userDao.update(newUser, id);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userDao.delete(user);
    }
}
