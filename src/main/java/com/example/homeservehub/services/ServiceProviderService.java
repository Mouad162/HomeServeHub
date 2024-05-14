package com.example.homeservehub.services;

import com.example.homeservehub.entities.ServiceProvider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceProviderService {
    ServiceProvider saveServiceProvider(ServiceProvider serviceProvider);
    ServiceProvider updateServiceProvider(ServiceProvider serviceProvider);
    void deleteServiceProviderById(Long id);
    void deleteAllServiceProviders();
    ServiceProvider getServiceProviderById(Long id);

    List<ServiceProvider> getAllServiceProvider();
}
