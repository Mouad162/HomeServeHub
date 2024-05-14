package com.example.homeservehub.entities;

import com.example.homeservehub.enums.ServiceState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Servicee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;

    private String serviceName;
    private String description;
    private ServiceState serviceState = ServiceState.New ;

    @OneToMany(mappedBy = "servicee",fetch = FetchType.LAZY)
    private List<ServiceRequest> serviceRequests = new ArrayList<>();

}

