package com.example.tripapp;

public class DestinationM {

    private String Name;

    private int Thumbnail;

    public String getName() {
        return Name;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public DestinationM(String name, int thumbnail) {
        Name = name;
        Thumbnail = thumbnail;
    }
}
