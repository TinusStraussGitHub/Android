package com.example.soundofmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        SongAdapter adapter = new SongAdapter(this, Globals.getAllSongs() );

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        if (Globals.currentSong != null) {
            TextView nowPlayingTextView = (TextView) findViewById(R.id.nowPlayingName);
            nowPlayingTextView.setText(Globals.currentSong.getName());
        }

        Button playing = (Button) findViewById(R.id.navigateToCurrentPlayingFromSong);

        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(AllSongsActivity.this, SongPlayingActivity.class);
                playingIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(playingIntent);
            }
        });

        Button backHome = (Button) findViewById(R.id.navigateToHomeFromSong);

        backHome.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(AllSongsActivity.this, MainActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(homeIntent);
            }
        });
    }

}
