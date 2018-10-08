package com.example.XYZAirport.controllers;

import com.example.XYZAirport.models.AirPlane;
import com.example.XYZAirport.repositories.AirPlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Optional;

public class AirPlaneController {

    private static ArrayList<AirPlane> airplanes = new ArrayList<>();

    @Autowired
    private AirPlaneRepository airPlaneRepository;

    //saves airplanes
    @RequestMapping(value ="/add", method = RequestMethod.POST)
    public AirPlane registerAirplane(@RequestBody AirPlane airplane) {
        airplanes.add(airplane);
        return airPlaneRepository.save(airplane);
    }
    //get plane id
    @RequestMapping(value= "/{id}", method = RequestMethod.GET)
    public AirPlane getAirplaneById(@PathVariable int id) {
        Optional<AirPlane> airplane = airPlaneRepository.findById(id);

        if (airplane.isPresent()) {
            return airplane.get();
        }
        return null;
    }
}
