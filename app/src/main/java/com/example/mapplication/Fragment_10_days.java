package com.example.mapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Fragment_10_days extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_forecast_layout, container, false);
        myrecyclerview=(RecyclerView) v.findViewById(R.id.weather_recycler);
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;

    }
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        lstContact=new ArrayList<>();
        lstContact.add(new Contact("Mehdi"));
        lstContact.add(new Contact("Clement"));
        lstContact.add(new Contact("Pierre"));
        lstContact.add(new Contact("Camille"));
    }

}
