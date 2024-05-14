package com.example.homeservehub.entities;

import com.example.homeservehub.enums.UserState;
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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userId;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phoneNumber;
    private String userType;
    private UserState userState = UserState.New;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<ServiceRequest> serviceRequests = new ArrayList<>();


}

