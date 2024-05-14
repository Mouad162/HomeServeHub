package com.example.homeservehub.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    private Long userId;
    private Long serviceId;
    private Long providerId;
    private Date requestDate;
    private String status;

    @ManyToOne
    private User user;
    @ManyToOne
    private ServiceProvider serviceProvider;
    @ManyToOne
    private Servicee servicee;

}
