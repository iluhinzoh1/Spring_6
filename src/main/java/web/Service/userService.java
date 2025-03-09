package web.Service;


import web.models.User;

import java.util.List;

public interface userService {
    public List<User> getAllUsers();

    public void saveUsers(User user);

    public User getUser(long id);

    public void deleteUser(long id);

    public void updateUser(User user);
}
