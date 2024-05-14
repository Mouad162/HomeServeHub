package com.example.homeservehub.entities;

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
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long providerId;

    private String name;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;
    private String specialty;
    private String availability;

    @OneToMany(mappedBy = "serviceProvider",fetch = FetchType.LAZY)
    private List<ServiceRequest> serviceRequests = new ArrayList<>();
}
