package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MusicPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        // Find the TextView in the MusicPlayer.xml layout with the ID song.
        TextView songTextView = (TextView) findViewById(R.id.song);

        // Find the ImageView in the MusicPlayer.xml layout with the ID image.
        ImageView Image = (ImageView) findViewById(R.id.image);

        // Find the TextView in the MusicPlayer.xml layout with the ID author.
        TextView authorTextView = (TextView) findViewById(R.id.author);

        // Receiving the intent extras that were put in the fragments
        final Bundle extras = getIntent().getExtras();

        // Getting the Views from xml

        songTextView.setText(extras.getString("authorName"));
        authorTextView.setText(extras.getString("nameSong"));
        Image.setImageResource(extras.getInt("image"));

        // Find the ImageView in the MusicPlayer.xml layout with the ID image.
        ImageView stopImage = (ImageView) findViewById(R.id.stop);

        // Find the ImageView in the MusicPlayer.xml layout with the ID image.
        ImageView playImage = (ImageView) findViewById(R.id.play);

        // Find the ImageView in the MusicPlayer.xml layout with the ID image.
        ImageView pauseImage = (ImageView) findViewById(R.id.pause);

        // Find the ImageView in the MusicPlayer.xml layout with the ID image.
        ImageView backImage = (ImageView) findViewById(R.id.back);

        //after clicking on the image Stop, Toust writes a message: Stop

        stopImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MusicPlayer.this,
                        "Stop",
                        Toast.LENGTH_LONG).show();
            }
        });

        // after clicking on the image Play, Toust writes a message: Play
        playImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MusicPlayer.this,
                        "Play",
                        Toast.LENGTH_LONG).show();
            }
        });

        // after clicking on the image pause, Toust writes a message: Pause
        pauseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MusicPlayer.this,
                        "Pause",
                        Toast.LENGTH_LONG).show();
            }
        });

        // after clicking on the image back, Start activity TracklistActivity
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MusicPlayer.this, TracklistActivity.class);
                startActivity(intent);
            }
        });

    }
}