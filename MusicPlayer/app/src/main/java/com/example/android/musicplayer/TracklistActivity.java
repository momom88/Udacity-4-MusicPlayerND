package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TracklistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);

        // Create a list of plays
        final ArrayList<Play> plays = new ArrayList<Play>();
        plays.add(new Play(R.string.name, R.string.name1, R.drawable.ic_action_music_1));
        plays.add(new Play(R.string.song1, R.string.author1, R.drawable.ic_action_music_1));
        plays.add(new Play(R.string.song2, R.string.authoe2, R.drawable.ic_action_music_1));
        plays.add(new Play(R.string.song3, R.string.author3, R.drawable.ic_action_music_1));
        plays.add(new Play(R.string.song4, R.string.author4, R.drawable.ic_action_music_1));
        plays.add(new Play(R.string.song5, R.string.author5, R.drawable.ic_action_music_1));
        plays.add(new Play(R.string.song6, R.string.author6, R.drawable.ic_action_music_1));
        plays.add(new Play(R.string.song7, R.string.author7, R.drawable.ic_action_music_1));
        plays.add(new Play(R.string.song8, R.string.author8, R.drawable.ic_action_music_1));
        plays.add(new Play(R.string.song9, R.string.author9, R.drawable.ic_action_music_1));


        // Create an {@link PlayAdapter}, whose data source is a list of {@link Play}s. The
        // adapter knows how to create list items for each item in the list.
        PlayAdapter adapter = new PlayAdapter(this, plays);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // play_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlayAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Play} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Play currentItem = plays.get(position);
                Intent intent = new Intent(TracklistActivity.this, MusicPlayer.class);
                intent.putExtra("nameSong", getString(currentItem.getNameSong()));
                intent.putExtra("image", currentItem.getImageResourceId());
                intent.putExtra("authorName", getString(currentItem.getNameAuthor()));
                startActivity(intent);

            }
        });

    }
}
