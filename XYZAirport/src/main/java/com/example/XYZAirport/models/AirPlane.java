package com.example.XYZAirport.models;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class AirPlane {

        @Id
        @GeneratedValue (strategy = GenerationType.AUTO)
        private int id, fuel;
        private String name, location;
}
