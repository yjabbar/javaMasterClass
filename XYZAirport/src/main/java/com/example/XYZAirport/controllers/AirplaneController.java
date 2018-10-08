package com.example.XYZAirport.controllers;

import com.example.XYZAirport.models.Airplane;
import com.example.XYZAirport.repositories.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Optional;

public class AirplaneController {

    private static ArrayList<Airplane> airplanes = new ArrayList<>();

    @Autowired
    private AirplaneRepository airplaneRepository;

    //saves airplanes
    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public Airplane registerAirplane(@RequestBody Airplane airplane) {
        airplanes.add(airplane);
        return airplaneRepository.save(airplane);
    }
    //get plane id
    @RequestMapping(value= "/{id}", method = RequestMethod.GET)
    public Airplane getAirplaneById(@PathVariable int id) {
        Optional<Airplane> airplane = airplaneRepository.findById(id);

        if (airplane.isPresent()) {
            return airplane.get();
        }
        return null;
    }
}
