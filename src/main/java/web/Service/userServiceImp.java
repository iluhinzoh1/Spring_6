package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.userDAO;
import web.models.User;

import java.util.List;

@Service
@Transactional
public class userServiceImp implements userService {

    @Autowired
    private userDAO users;

    @Override

    public List<User> getAllUsers() {
        return users.getAllUsers();
    }

    @Override
    public void saveUsers(User user) {
        users.saveUsers(user);
    }

    @Override
    public User getUser(long id) {
        return users.getUser(id);
    }

    @Override
    public void deleteUser(long id) {
        users.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        users.updateUser(user);
    }
}
