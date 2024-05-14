package com.example.homeservehub.repositories;

import com.example.homeservehub.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepos extends JpaRepository<User, Long > {
    User findUserByEmail(String email);
}
