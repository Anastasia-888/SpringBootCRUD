package web.springbootcrud.dao;

import org.springframework.stereotype.Repository;
import web.springbootcrud.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(User newUser, int id) {
        Query query = entityManager.createQuery
                ("UPDATE User SET name=:name, surname=:surname, age=:age WHERE id=:id");
        query.setParameter("name", newUser.getName());
        query.setParameter("surname", newUser.getName());
        query.setParameter("age", newUser.getAge());
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void delete(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }
}
