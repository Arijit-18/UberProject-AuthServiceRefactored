package com.example.UberProject_AuthService2.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PassengerSignupRequestDto {

    private String email;
    private String password;
    private String phoneNumber;
    private String name;
}
