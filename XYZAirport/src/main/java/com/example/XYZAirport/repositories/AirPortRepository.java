package com.example.XYZAirport.repositories;

import com.example.XYZAirport.models.AirPort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface AirPortRepository extends CrudRepository<AirPort, Integer> {
}

