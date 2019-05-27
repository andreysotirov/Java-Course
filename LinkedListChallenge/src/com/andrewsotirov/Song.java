package com.andrewsotirov;

import java.util.ArrayList;

public class Song {

    private String name;
    private double duration;
    private ArrayList<Song> songs;


    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
        this.songs = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return (name + ": " + duration);
    }
}
