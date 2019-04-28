package com.example.soundofmusic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView positionTextView = (TextView) listItemView.findViewById(R.id.songPosition);
        positionTextView.setText(currentSong.getPosition());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.songName);
        nameTextView.setText(currentSong.getName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.songArtist);
        numberTextView.setText(currentSong.getArtist());

        return listItemView;
    }


}
