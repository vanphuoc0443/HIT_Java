package service;

import model.User;

public class AuthService {
    private UserService userService;

    public AuthService(UserService userService) {
        this.userService = userService;
    }

    public User login(String username, String password) {
        User user = userService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public boolean register(String username, String password, String email, String phoneNumber) {
        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()) {
            return false;
        }

        User newUser = new User(username, password, email, phoneNumber);
        return userService.addUser(newUser);
    }

    public boolean changePassword(String userId, String newPassword, String confirmNewPassword) {
        if (!newPassword.equals(confirmNewPassword)) {
            return false;
        }

        User user = userService.getUserById(userId);
        if (user != null) {
            user.setPassword(newPassword);
            return true;
        }
        return false;
    }
}