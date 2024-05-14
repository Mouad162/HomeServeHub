package com.example.homeservehub.services;

import com.example.homeservehub.entities.Servicee;
import com.example.homeservehub.repositories.ServiceeRepos;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ServiceeServiceImpl implements ServiceeService {

    private ServiceeRepos serviceeRepos;
    @Override
    public Servicee saveServicee(Servicee servicee) {
        return serviceeRepos.save(servicee);
    }

    @Override
    public Servicee updateServicee(Servicee servicee) {
        return serviceeRepos.save(servicee);
    }

    @Override
    public void deleteServiceeById(Long id) {
    serviceeRepos.deleteById(id);
    }

    @Override
    public void deleteAllServicees() {
    serviceeRepos.deleteAll();
    }

    @Override
    public Servicee getServiceeById(Long id) {
        return serviceeRepos.findById(id).get();
    }

    @Override
    public List<Servicee> getAllServicee() {
        return serviceeRepos.findAll() ;
    }
}
