package com.yangh.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yangH on 2019/2/19.
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public update update;

    public class update {
        @SerializedName("loc")
        public String updateTime;
    }
}
