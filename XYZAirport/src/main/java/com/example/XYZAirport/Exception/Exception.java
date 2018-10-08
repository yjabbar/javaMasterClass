package com.example.XYZAirport.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No airplane with that id found")
public class Exception extends RuntimeException{
}