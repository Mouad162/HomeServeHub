package com.example.homeservehub.services;

import com.example.homeservehub.entities.ServiceProvider;
import com.example.homeservehub.repositories.ServiceProviderRepos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServiceProviderServiceImpl implements ServiceProviderService {

    private ServiceProviderRepos serviceProviderRepos;
    @Override
    public ServiceProvider saveServiceProvider(ServiceProvider serviceProvider) {
        return serviceProviderRepos.save(serviceProvider);
    }

    @Override
    public ServiceProvider updateServiceProvider(ServiceProvider serviceProvider) {
        return serviceProviderRepos.save(serviceProvider);
    }

    @Override
    public void deleteServiceProviderById(Long id) {
    serviceProviderRepos.deleteById(id);
    }

    @Override
    public void deleteAllServiceProviders() {
    serviceProviderRepos.deleteAll();
    }

    @Override
    public ServiceProvider getServiceProviderById(Long id) {
        return serviceProviderRepos.findById(id).get();
    }

    @Override
    public List<ServiceProvider> getAllServiceProvider() {
        return serviceProviderRepos.findAll();
    }
}
