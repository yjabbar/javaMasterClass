package com.example.XYZAirport.repositories;

import com.example.XYZAirport.models.AirPlane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirPlaneRepositorie extends CrudRepository<AirPlane, Integer> {
}
