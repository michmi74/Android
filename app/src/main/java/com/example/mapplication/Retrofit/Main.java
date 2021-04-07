package com.example.mapplication.Retrofit;

import com.google.gson.annotations.SerializedName;

public class Main {


    @SerializedName("temp")
    String temp;
    @SerializedName("humidity")
    String humidity;
    @SerializedName("feels_like")
    String feels_like;
    @SerializedName("visibility")
    String visibility;
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(String feels_like) {
        this.feels_like = feels_like;
    }
}
