package com.example.soundofmusic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;


public class AlbumAdapter extends ArrayAdapter<Album> {
    private Context mycontext;

    public AlbumAdapter(Activity context, ArrayList<Album> albums) {

        super(context, 0, albums);

        mycontext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_list_item, parent, false);
        }

        final Album currentAlbum = getItem(position);


        Button nameButton = (Button) listItemView.findViewById(R.id.albumName);
        nameButton.setText(currentAlbum.getName());

        nameButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Globals.currentAlbum = currentAlbum;
                Intent songIntent = new Intent(getContext(), SongActivity.class);
                songIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mycontext.startActivity(songIntent);
            }
        });

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.albumArtist);
        artistTextView.setText(currentAlbum.getArtist());

              return listItemView;
    }


}
