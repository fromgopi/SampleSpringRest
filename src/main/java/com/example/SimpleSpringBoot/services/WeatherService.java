package com.example.SimpleSpringBoot.services;

import com.example.SimpleSpringBoot.beans.Weather;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    public static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

    private String baseURL = "http://api.openweathermap.org/data/2.5/weather?APPID=59ee4271096216bf0f9f3bfb07ef0b59&units=metric&mode=json&q=";

    private RestTemplate restTemplate = new RestTemplate();

    /**
     * Simple Service function which will interact with external API and gets current temperature of the place.
     * @param cityName
     * @return weather service Object.
     */

    public Weather getWeatherService(String cityName) {

        String weatherJson = restTemplate.getForObject(baseURL+cityName, String.class);
        Weather weatherSO = extractWeather(weatherJson);
        return weatherSO;
    }

    /**
     * Simple method which will parse the response and returns the weather details.
     * @param weatherJson
     * @return weather service Object
     * @throws JSONException
     */

    private Weather extractWeather(String weatherJson) throws JSONException {

        Weather weatherSo = new Weather();
        JSONObject obj = new JSONObject(weatherJson);
        JSONObject main = obj.getJSONObject("main");
        weatherSo.setTemp(main.get("temp"));
        return weatherSo;
    }
}
