package com.example.SimpleSpringBoot.manager;

import com.example.SimpleSpringBoot.beans.Weather;
import com.example.SimpleSpringBoot.services.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherManager {

    public static final Logger logger = LoggerFactory.getLogger(WeatherManager.class);
    @Autowired
    private WeatherService weatherService;

    public Weather getDetails(String cityName){

        Weather wSO = weatherService.getWeatherService(cityName);

        return wSO;
    }

}
