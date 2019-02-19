package com.yangh.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yangH on 2019/2/19.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
