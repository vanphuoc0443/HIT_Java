package service;

import model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
        users.add(new User("admin", "admin123", "admin@example.com", "0901234567"));
        users.add(new User("user1", "pass123", "user1@example.com", "0912345678"));
        users.add(new User("user2", "pass456", "user2@example.com", "0923456789"));
        users.add(new User("user3", "pass789", "user3@example.com", "0934567890"));
        users.add(new User("user4", "pass2024", "user4@example.com", "0945678901"));
    }

    public User getUserById(String userId) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean addUser(User user) {
        if (findByUsername(user.getUsername()) != null) {
            return false;
        }
        users.add(user);
        return true;
    }
}