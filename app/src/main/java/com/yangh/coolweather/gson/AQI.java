package com.yangh.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yangH on 2019/2/19.
 */
public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
