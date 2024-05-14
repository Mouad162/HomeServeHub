package com.example.homeservehub.services;

import com.example.homeservehub.entities.User;
import com.example.homeservehub.repositories.UserRepos;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepos userRepos;
    @Override
    public User saveUser(User user) {
        return userRepos.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepos.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
    userRepos.deleteById(id);
    }

    @Override
    public void deleteAllUsers() {
    userRepos.deleteAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepos.findById(id).get();
    }

    @Override
    public User getUserBy(String id) {
        return userRepos.findUserByEmail(id);
    }

    @Override
    public List<User> getAllUser() {
        return userRepos.findAll();
    }

    @Override
    public Page<User> getAllUserByPage(int page, int size) {
        return userRepos.findAll(PageRequest.of(page,size));
    }

}
