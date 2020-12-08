package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author zwp
 * @description:
 * @date: 2020/12/7 16:50
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
