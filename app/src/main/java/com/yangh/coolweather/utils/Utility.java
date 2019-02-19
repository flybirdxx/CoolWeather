package com.yangh.coolweather.utils;

import android.text.TextUtils;
import android.view.TextureView;

import com.yangh.coolweather.db.City;
import com.yangh.coolweather.db.County;
import com.yangh.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.security.auth.callback.Callback;

/**
 * Created by yangH on 2019/2/19.
 */
public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvince = new JSONArray(response);
                for (int i = 0; i < allProvince.length(); i++) {
                    JSONObject provinceObject = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String reponse, int provinceId) {
        if (!TextUtils.isEmpty(reponse)) {
            try {
            JSONArray allCity = new JSONArray(reponse);

                for (int i = 0; i < allCity.length(); i++) {
                    JSONObject cityObject = allCity.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }


    /**
     * 解析和处理服务器返回的县级数据
     */
    public static boolean handleCountyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCountise = new JSONArray(response);
                for (int i = 0; i < allCountise.length(); i++) {
                    JSONObject countiseObject = allCountise.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countiseObject.getString("name"));
                    county.setCiytyId(cityId);
                    county.setWeatherId(countiseObject.getString("weather_id"));
                    county.save();
                }
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
}

