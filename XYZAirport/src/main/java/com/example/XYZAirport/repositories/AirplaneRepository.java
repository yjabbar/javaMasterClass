package com.example.XYZAirport.repositories;

import com.example.XYZAirport.models.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {
}
