package com.example.SimpleSpringBoot.controller;

import com.example.SimpleSpringBoot.beans.Weather;
import com.example.SimpleSpringBoot.exception.NotFoundException;
import com.example.SimpleSpringBoot.manager.WeatherManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    WeatherManager weatherManager;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

        ErrorResponse error = new ErrorResponse();
        if (ex instanceof  IllegalArgumentException ){
            error.setErrorCode(HttpStatus.BAD_REQUEST.value());
            error.setMessage (ex.getMessage());
        }else if (ex instanceof NotFoundException){
            error.setErrorCode(HttpStatus.NOT_FOUND.value());
            error.setMessage (ex.getMessage());
        }else{
            error.setErrorCode(500);
            error.setMessage (" Unknown error occured. Contact support center");
        }
        error.setMessage (ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @RequestMapping("/weather/{city}")
    public Weather getWeatherDetailsByCity(@PathVariable("city") String city) throws Exception {

        Weather weatherOBJ = weatherManager.getDetails(city);

        if(weatherOBJ.getTemp() == null){
            throw new NotFoundException("Unable to locate the Weather");
        }

        return weatherOBJ;
    }

}
