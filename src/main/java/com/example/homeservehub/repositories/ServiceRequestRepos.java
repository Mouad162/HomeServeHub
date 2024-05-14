package com.example.homeservehub.repositories;

import com.example.homeservehub.entities.ServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRequestRepos extends JpaRepository<ServiceRequest, Long > {
}
