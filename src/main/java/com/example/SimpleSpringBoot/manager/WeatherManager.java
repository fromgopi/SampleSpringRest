package com.example.SimpleSpringBoot.manager;

import com.example.SimpleSpringBoot.beans.Cities;
import com.example.SimpleSpringBoot.beans.Weather;
import com.example.SimpleSpringBoot.dao.CityWeatherDaoImpl;
import com.example.SimpleSpringBoot.services.WeatherService;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class WeatherManager {

    public static final Logger logger = LoggerFactory.getLogger(WeatherManager.class);
    @Autowired
    private WeatherService weatherService;

    @Autowired
    private CityWeatherDaoImpl cityRepository;

    /**
     * Simple manager function which will accepts city name as parameter and combine weather details and famous places.
     * @param cityName
     * @return Weather Business object.
     * @throws SQLException
     */

    public Weather getDetails(String cityName) throws SQLException, JSONException {
        Weather wSO = weatherService.getWeatherService(cityName);
        List<Cities> citySO = cityRepository.getCityDetails(cityName);

        return extractCityDetails(wSO, citySO);
    }

    private Weather extractCityDetails(Weather wSO, List<Cities> citySO) {

        Weather weatherBO = new Weather();
        weatherBO.setCountry(citySO.get(0).getCountry());
        weatherBO.setCity_name(citySO.get(0).getCity());
        for(Cities SO : citySO){
            weatherBO.setFamous_place(SO.getFamous_place());
        }
        weatherBO.setTemp(wSO.getTemp());
        return weatherBO;
    }

}
