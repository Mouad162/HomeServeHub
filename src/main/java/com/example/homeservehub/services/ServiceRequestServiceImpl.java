package com.example.homeservehub.services;

import com.example.homeservehub.entities.ServiceProvider;
import com.example.homeservehub.entities.ServiceRequest;
import com.example.homeservehub.repositories.ServiceRequestRepos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceRequestServiceImpl implements ServiceRequestService {

    private ServiceRequestRepos serviceRequestRepos;
    @Override
    public ServiceRequest saveServiceRequest(ServiceRequest serviceRequest) {
        return serviceRequestRepos.save(serviceRequest);
    }

    @Override
    public ServiceRequest updateServiceRequest(ServiceRequest serviceRequest) {
        return serviceRequestRepos.save(serviceRequest);
    }

    @Override
    public void deleteServiceRequestById(Long id) {
    serviceRequestRepos.deleteById(id);
    }

    @Override
    public void deleteAllServiceRequests() {
    serviceRequestRepos.deleteAll();
    }

    @Override
    public ServiceRequest getServiceRequestById(Long id) {
    return serviceRequestRepos.findById(id).get();
    }

    @Override
    public List<ServiceRequest> getAllServiceRequest() {
        return serviceRequestRepos.findAll();
    }
}
