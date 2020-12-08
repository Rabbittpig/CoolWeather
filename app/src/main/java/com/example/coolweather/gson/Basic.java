package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author zwp
 * @description:
 * @date: 2020/12/7 16:46
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
