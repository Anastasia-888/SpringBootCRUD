package web.springbootcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.springbootcrud.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
