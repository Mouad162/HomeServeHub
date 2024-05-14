package com.example.homeservehub.repositories;

import com.example.homeservehub.entities.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceProviderRepos extends JpaRepository<ServiceProvider, Long > {
}
