package com.example.homeservehub.services;

import com.example.homeservehub.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUser(User user);
    User updateUser(User user);
    void deleteUserById(Long id);
    void deleteAllUsers();
    User getUserById(Long id);
    User getUserBy(String id);

    List<User> getAllUser();
    Page<User> getAllUserByPage(int page, int size);

}
