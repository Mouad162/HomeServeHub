package com.example.homeservehub.repositories;

import com.example.homeservehub.entities.Servicee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceeRepos extends JpaRepository<Servicee, Long > {
}
