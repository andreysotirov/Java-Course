package com.andrewsotirov;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String albumName;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addNewSong(String songName, double songDuration) {
        if (findSong(songName) == null) {
            songs.add(new Song(songName, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong(String songName){
        for (Song checkedSong : songs){
            if (checkedSong.getName().equals(songName)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList (int trackNumber, LinkedList<Song> playList){
        int index = trackNumber-1;
        if (index >= 0 && index <= songs.size()){
            playList.add(songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return true;
    }
    public boolean addToPlayList (String songName, LinkedList<Song> playList){
        Song checkedSong = findSong(songName);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("Song " + songName + " is not in the album.");
        return false;
    }
}
