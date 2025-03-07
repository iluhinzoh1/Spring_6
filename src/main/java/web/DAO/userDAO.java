package web.DAO;

import web.models.User;

import javax.persistence.EntityManager;
import java.util.List;


public interface userDAO {
    public List<User> getAllUsers();

    public void saveUsers(User user);

    public User getUser(long id);

    public void deleteUser(long id);
}
