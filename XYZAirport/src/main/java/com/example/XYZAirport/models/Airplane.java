package com.example.XYZAirport.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Airplane {

        @Id
        @GeneratedValue (strategy = GenerationType.AUTO)
        private int id;
        private int fuel;
        private String name;
        private String location;

        public Airplane(String name, String location) {
                this.name = name;
                this.location = location;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getFuel() {
                return fuel;
        }

        public void setFuel(int fuel) {
                this.fuel = fuel;
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
}
