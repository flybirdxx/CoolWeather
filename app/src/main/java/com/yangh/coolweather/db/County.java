package com.yangh.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yangH on 2019/2/19.
 */
public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int ciytyId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCiytyId() {
        return ciytyId;
    }

    public void setCiytyId(int ciytyId) {
        this.ciytyId = ciytyId;
    }
}
