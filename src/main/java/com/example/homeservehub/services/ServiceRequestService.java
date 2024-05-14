package com.example.homeservehub.services;

import com.example.homeservehub.entities.ServiceRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ServiceRequestService {
    ServiceRequest saveServiceRequest(ServiceRequest serviceRequest);
    ServiceRequest updateServiceRequest(ServiceRequest serviceRequest);
    void deleteServiceRequestById(Long id);
    void deleteAllServiceRequests();
    ServiceRequest getServiceRequestById(Long id);
    List<ServiceRequest> getAllServiceRequest();
}
