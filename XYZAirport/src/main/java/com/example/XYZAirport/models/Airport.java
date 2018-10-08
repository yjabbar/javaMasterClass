package com.example.XYZAirport.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class Airport {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String name, location;

    @OneToMany
    private List<Airplane> airplanes;

    public Airport(String name, String location, List<Airplane> airplanes) {
        this.name = name;
        this.location = location;
        this.airplanes = airplanes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
}
