package web.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.springbootcrud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
