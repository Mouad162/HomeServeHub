package com.example.homeservehub.services;

import com.example.homeservehub.entities.Servicee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceeService {
    Servicee saveServicee(Servicee servicee);
    Servicee updateServicee(Servicee servicee);
    void deleteServiceeById(Long id);
    void deleteAllServicees();
    Servicee getServiceeById(Long id);
    List<Servicee> getAllServicee();
}
