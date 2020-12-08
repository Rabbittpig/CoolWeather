package com.example.coolweather.gson;

/**
 * @author zwp
 * @description:
 * @date: 2020/12/7 16:49
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
