package com.example.soundofmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        AlbumAdapter adapter = new AlbumAdapter(this, Globals.albumList);

        GridView listView = (GridView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        if (Globals.currentSong != null) {
            TextView nowPlayingTextView = (TextView) findViewById(R.id.nowPlayingName);
            nowPlayingTextView.setText(Globals.currentSong.getName());
        }

        Button playing = (Button) findViewById(R.id.navigateToCurrentPlayingFromAlbum);

        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(AlbumActivity.this, SongPlayingActivity.class);
                playingIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(playingIntent);
            }
        });

        Button backHome = (Button) findViewById(R.id.navigateToHomeFromAlbum);

        backHome.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(AlbumActivity.this, MainActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(homeIntent);
            }
        });
    }


}
