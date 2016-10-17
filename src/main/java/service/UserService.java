package service;

import entity.User;

/**
 * Created by Aleksey on 23.09.2016.
 */
public interface UserService {

    void addUser(User user);
    void updateUser(User user);
    User getByUsername(String username);






}
