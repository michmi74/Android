package com.example.mapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Contact> mData;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v;
       v= LayoutInflater.from(mContext).inflate(R.layout.item_weather_forecast,parent,false);
       MyViewHolder vHolder= new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.tv_name.setText(mData.get(position).getName());

    }

    @Override
    public int getItemCount() {
       return mData.size() ;}

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_name;
        private ImageView img;


        public MyViewHolder(View itemView){
            super(itemView);
            tv_name=(TextView) itemView.findViewById(R.id.name_contact);

        }
    }
}
