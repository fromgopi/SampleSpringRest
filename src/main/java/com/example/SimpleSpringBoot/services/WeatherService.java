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
    //private String baseURL = "http://api.apixu.com/v1/current.json?key=04a9c3fd79944ce4bf243847180105&q=Chennai";

    private RestTemplate restTemplate = new RestTemplate();

    public Weather getWeatherService(String cityName) {

        String weatherJson = restTemplate.getForObject(baseURL+cityName, String.class);
        Weather weatherSO = extractWeather(weatherJson);
        return weatherSO;
    }

    private Weather extractWeather(String weatherJson) throws JSONException {

        Weather weatherSo = new Weather();
        JSONObject obj = new JSONObject(weatherJson);
        JSONObject main = obj.getJSONObject("main");
        weatherSo.setTemp(main.get("temp"));
        weatherSo.setTemp_max(main.get("temp_max"));
        weatherSo.setTemp_min(main.get("temp_min"));
        return weatherSo;
    }
}
