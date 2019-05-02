package com.example.soundofmusic;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {


    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_item, parent, false);
        }

        final Song currentSong = getItem(position);

        TextView positionTextView = (TextView) listItemView.findViewById(R.id.songPosition);
        positionTextView.setText(String.valueOf(currentSong.getPosition()));

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.songName);
        nameTextView.setText(currentSong.getName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.songArtist);
        numberTextView.setText(currentSong.getArtist());

        ImageButton playButton = listItemView.findViewById(R.id.playButton);

        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Globals.currentSong = currentSong;

            }
        });

//
        return listItemView;
    }


}
