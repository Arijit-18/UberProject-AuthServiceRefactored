package com.example.UberProject_AuthService2.services;


import com.example.UberProject_AuthService2.dto.PassengerDto;
import com.example.UberProject_AuthService2.dto.PassengerSignupRequestDto;
import com.example.UberProject_AuthService2.models.Passenger;
import com.example.UberProject_AuthService2.repositories.PassengerRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final PassengerRepository passengerRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthService(PassengerRepository passengerRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.passengerRepository = passengerRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public PassengerDto signupPassenger(PassengerSignupRequestDto passengerSignupRequestDto)
    {
        Passenger passenger = Passenger.builder()
                .email(passengerSignupRequestDto.getEmail())
                .name(passengerSignupRequestDto.getName())
                .password(bCryptPasswordEncoder.encode(passengerSignupRequestDto.getPassword())) //TODO : encrypt the password
                .phoneNumber(passengerSignupRequestDto.getPhoneNumber())
                .build();

        Passenger newPassenger = passengerRepository.save(passenger);
        return PassengerDto.from(newPassenger);
    }
}
