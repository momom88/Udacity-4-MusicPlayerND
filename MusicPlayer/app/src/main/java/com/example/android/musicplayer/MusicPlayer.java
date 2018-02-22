package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MusicPlayer extends AppCompatActivity implements View.OnClickListener {

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
        songTextView.setText(extras.getString("nameSong"));
        authorTextView.setText(extras.getString("authorName"));
        Image.setImageResource(extras.getInt("image"));

        // Find the ImageView in the MusicPlayer.xml layout with the ID image.
        ImageView stopImage = (ImageView) findViewById(R.id.stop);
        stopImage.setOnClickListener(this);
        // Find the ImageView in the MusicPlayer.xml layout with the ID image.
        ImageView playImage = (ImageView) findViewById(R.id.play);
        playImage.setOnClickListener(this);
        // Find the ImageView in the MusicPlayer.xml layout with the ID image.
        ImageView pauseImage = (ImageView) findViewById(R.id.pause);
        pauseImage.setOnClickListener(this);
        // Find the ImageView in the MusicPlayer.xml layout with the ID image.
        ImageView backImage = (ImageView) findViewById(R.id.back);
        backImage.setOnClickListener(this);
    }

    //implement the onClick method here for image : stop,play,pause and back
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stop:
                Toast.makeText(MusicPlayer.this,
                        "Stop",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.play:
                Toast.makeText(MusicPlayer.this,
                        "Play",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.pause:
                Toast.makeText(MusicPlayer.this,
                        "Pause",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.back:
                Intent intent = new Intent(this, TracklistActivity.class);
                startActivity(intent);
                break;

        }
    }
}