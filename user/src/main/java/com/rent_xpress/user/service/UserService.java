package com.rent_xpress.user.service;

import com.rent_xpress.user.model.User;
import com.rent_xpress.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository repoUser;
    @Override
    public User createUser(User user) {
        return repoUser.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return repoUser.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return repoUser.findAll();
    }

    @Override
    public User updateUser(Long id, User user) {
        User dbUser = repoUser.findById(id).orElse(null);
        if (dbUser!=null){
            dbUser.setUsername(user.getUsername());
            dbUser.setPassword(user.getPassword());
            dbUser.setEmail(user.getEmail());
            dbUser.setPhoneNumber(user.getPhoneNumber());
            dbUser.setFullName(user.getFullName());
            dbUser.setAddress(user.getAddress());
            dbUser.setRegistrationDate(user.getRegistrationDate());
            repoUser.save(dbUser);
        }
        return dbUser;
    }

    @Override
    public boolean deleteUser(Long id) {
        repoUser.deleteById(id);
        return true;
    }
}
