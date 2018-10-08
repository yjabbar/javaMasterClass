package com.example.XYZAirport.controllers;

import com.example.XYZAirport.models.AirPort;
import com.example.XYZAirport.repositories.AirPortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping ("/api/airport/")
public class AirPortController {

    @Autowired
    private AirPortRepository airportRepository;

    //saves plane to repo
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createAirport(AirPort airport) {
        this.airportRepository.save(airport);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public AirPort getAirportByID(@PathVariable int id) {
        Optional<AirPort> airport = airportRepository.findById(id);

        if (airport.isPresent()) {
            return airport.get();
        }
        return null;
    }
    //gets all the planes from the repo
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<AirPort> getAll() {
        return this.airportRepository.findAll();
    }


}
