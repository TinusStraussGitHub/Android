package com.example.soundofmusic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Globals {

    public static ArrayList<Album> albumList;
    public static Album currentAlbum;
    public static Song currentSong;

    public static ArrayList<Album> CreateAlbumsList() {
        ArrayList<Album> albumList = new ArrayList<Album>();

        int songCounter = 1;

        Album darkside = new Album("Dark Side of the Moon", "Pink Floyd", "", null);
        ArrayList<Song> darksideSongs = new ArrayList<Song>();
        darksideSongs.add(new Song(songCounter, "Speak to Me", "Pink Floyd"));
        songCounter++;
        darksideSongs.add(new Song(songCounter, "Breathe", "Pink Floyd"));
        songCounter++;
        darksideSongs.add(new Song(songCounter, "On the Run", "Pink Floyd"));
        songCounter++;
        darksideSongs.add(new Song(songCounter, "Time", "Pink Floyd"));
        songCounter++;
        darksideSongs.add(new Song(songCounter, "The Great Gig in the Sky", "Pink Floyd"));
        darkside.setSongs(darksideSongs);
        albumList.add(darkside);

        songCounter = 1;
        Album thriller = new Album("Thriller", "Michael Jackson", "", null);
        ArrayList<Song> thrillerSongs = new ArrayList<Song>();
        thrillerSongs.add(new Song(songCounter, "Wanna Be Startin' Somethin'", "Michael Jackson"));
        songCounter++;
        thrillerSongs.add(new Song(songCounter, "Baby Be Mine", "Michael Jackson"));
        songCounter++;
        thrillerSongs.add(new Song(songCounter, "The Girl Is Mine", "Michael Jackson"));
        songCounter++;
        thrillerSongs.add(new Song(songCounter, "Thriller", "Michael Jackson"));
        thriller.setSongs(thrillerSongs);
        albumList.add(thriller);

        songCounter = 1;
        Album revolver = new Album("Revolver", "The Beatles", "", null);
        ArrayList<Song> revolverSongs = new ArrayList<Song>();
        revolverSongs.add(new Song(songCounter, "Taxman", "Harrison"));
        songCounter++;
        revolverSongs.add(new Song(songCounter, "Eleanor Rigby", "McCartney"));
        songCounter++;
        revolverSongs.add(new Song(songCounter, "I'm Only Sleeping", "Lennon"));
        songCounter++;
        revolverSongs.add(new Song(songCounter, "Love You To", "Harrison"));
        songCounter++;
        revolverSongs.add(new Song(songCounter, "Here, There and Everywhere", "McCartney"));
        songCounter++;
        revolverSongs.add(new Song(songCounter, "Yellow Submarine", "Starr"));
        songCounter++;
        revolverSongs.add(new Song(songCounter, "She Said She Said", "Lennon"));
        revolver.setSongs(revolverSongs);
        albumList.add(revolver);


        return albumList;
    }

    public static ArrayList<Song> getAllSongs() {
        ArrayList<Song> combineList = new ArrayList<Song>();
        int songCounter = 1;
        if (albumList != null) {
            for (int i = 0; i < albumList.size(); i++) {

                if (albumList.get(i).getSongs() != null) {

                    for (int j = 0; j < albumList.get(i).getSongs().size(); j++) {
                        Song addSong = new Song(songCounter, albumList.get(i).getSongs().get(j).getName(), albumList.get(i).getSongs().get(j).getArtist());
                        songCounter++;
                        combineList.add(addSong);
                    }

                }
            }
        }
        return combineList;
    }
}
