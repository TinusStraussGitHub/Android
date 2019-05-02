package com.example.soundofmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SongPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_playing);

        if (Globals.currentSong != null) {
            TextView nowPlayingPositionTextView = (TextView) findViewById(R.id.songPosition);
            nowPlayingPositionTextView.setText(String.valueOf(Globals.currentSong.getPosition()));

            TextView nowPlayingNameTextView = (TextView) findViewById(R.id.songName);
            nowPlayingNameTextView.setText(String.valueOf(Globals.currentSong.getName()));

            TextView nowPlayingArtistTextView = (TextView) findViewById(R.id.songArtist);
            nowPlayingArtistTextView.setText(String.valueOf(Globals.currentSong.getArtist()));
        }

        Button backHome = (Button) findViewById(R.id.navigateToHomeFromPlayingSong);

        backHome.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SongPlayingActivity.this, MainActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(homeIntent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        if (Globals.currentSong != null) {
            TextView nowPlayingPositionTextView = (TextView) findViewById(R.id.songPosition);
            nowPlayingPositionTextView.setText(String.valueOf(Globals.currentSong.getPosition()));

            TextView nowPlayingNameTextView = (TextView) findViewById(R.id.songName);
            nowPlayingNameTextView.setText(String.valueOf(Globals.currentSong.getName()));

            TextView nowPlayingArtistTextView = (TextView) findViewById(R.id.songArtist);
            nowPlayingArtistTextView.setText(String.valueOf(Globals.currentSong.getArtist()));
        }
    }
}
