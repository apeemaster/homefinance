package service;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.UserRepository;

/**
 * Created by Aleksey on 23.09.2016.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void addUser(User user) {
        userRepository.saveAndFlush(user);
    }
    @Override
    @Transactional
    public User getByUsername(String username){
    return userRepository.findByUsername(username);
}
    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }
}
