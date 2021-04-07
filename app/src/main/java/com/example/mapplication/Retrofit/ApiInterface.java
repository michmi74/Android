package com.example.mapplication.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("weather?q=Grenoble,fr&units=metric&lang=fr&appid=9387d7732a59e17de90e4c91d32b1936")
    Call<Example> getWeatherData();

}
