package web.springbootcrud.service;

import org.springframework.stereotype.Service;
import web.springbootcrud.repository.UserRepository;
import web.springbootcrud.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void update(User newUser) {
        userRepository.save(newUser);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
