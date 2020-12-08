package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @author zwp
 * @description:
 * @date: 2020/12/7 17:10
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
