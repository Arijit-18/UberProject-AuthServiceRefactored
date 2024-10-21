package com.example.UberProject_AuthService2.dto;

import com.example.UberProject_AuthService2.models.Passenger;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PassengerDto {
    private String id;
    private String name;
    private String email;
    private String password; //encrypted password
    private String phoneNumber;
    private Date createdAt;
    private Date updatedAt;

    public static PassengerDto from(Passenger p) {
        return PassengerDto.builder()
                .id(p.getId().toString())
                .name(p.getName())
                .email(p.getEmail())
                .password(p.getPassword())
                .phoneNumber(p.getPhoneNumber())
                .build();
    }
}
