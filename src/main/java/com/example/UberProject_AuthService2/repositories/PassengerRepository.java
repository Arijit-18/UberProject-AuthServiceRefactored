package com.example.UberProject_AuthService2.repositories;

import com.example.UberProject_AuthService2.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
