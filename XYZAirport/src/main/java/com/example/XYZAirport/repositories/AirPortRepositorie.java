package com.example.XYZAirport.repositories;

import com.example.XYZAirport.models.AirPort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface AirPortRepositorie extends CrudRepository<AirPort, Integer> {
}

