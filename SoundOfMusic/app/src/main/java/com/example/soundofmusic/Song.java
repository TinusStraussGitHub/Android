package com.example.soundofmusic;

public class Song {
    private int position;
    private String name;
    private String artist;

    public Song(int songPositionInAlbum, String songName, String songArtist) {
        this.position = songPositionInAlbum;
        this.name = songName;
        this.artist = songArtist;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    public String getArtist() {
        return this.artist;
    }

}
