package com.example.XYZAirport.repositories;

import com.example.XYZAirport.models.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface AirportRepository extends CrudRepository<Airport, Integer> {
}

