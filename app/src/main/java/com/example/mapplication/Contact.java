package com.example.mapplication;

public class Contact {

    private String Name;
    private int Photo;


    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    public Contact(String name)
    {
        Name=name;

    }



    //Getter

    public String getName() {
        return Name;
    }

    //Setter

    public void setName(String name) {
        Name = name;
    }
}
