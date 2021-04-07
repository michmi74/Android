package com.example.mapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.mapplication.Retrofit.ApiClient;
import com.example.mapplication.Retrofit.ApiInterface;
import com.example.mapplication.Retrofit.Example;

import java.io.Console;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_today extends Fragment {
    EditText textField;
    private static final String TAG = "MyActivity";
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View V=inflater.inflate(R.layout.fragment_today_layout, container, false);
        textField=V.findViewById(R.id.textField);
        textField.setText("salut");
      //TESSSSSSSSSSSSSSSSSSSSSSSSSST

        String username =getArguments().getString("Grenoble");
        Log.d("test",username);
        getWeatherDataToday();
        return V;

    }

    private void getWeatherDataToday()
    {

       ApiInterface apiInterface=ApiClient.getClient().create(ApiInterface.class);
       Call<Example> call=apiInterface.getWeatherData();
       call.enqueue(new Callback<Example>() {
           @Override
           public void onResponse(Call<Example> call, Response<Example> response) {

               Log.v("DATA", response.body().getMain().getTemp());
           }

           @Override
           public void onFailure(Call<Example> call, Throwable t) {

               Log.i(TAG, "MyClass.getView() — get item number " );

           }
       });


    }

}
