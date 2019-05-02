package com.example.soundofmusic;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private String imageSource;
    private ArrayList<Song> songs;

    public Album(String albumName, String albumArtist,String albumImageSource, ArrayList<Song> albumSongs) {
        this.name = albumName;
        this.artist = albumArtist;
        this.songs = albumSongs;
        this.imageSource = albumImageSource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public String getName() {
        return this.name;
    }

    public String getArtist() {
        return this.artist;
    }
    public String getImageSource() {
        return this.imageSource;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }
}
