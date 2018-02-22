package com.example.android.musicplayer;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by marti on 2/21/2018.
 */

public class PlayAdapter extends ArrayAdapter<Play> {
    public PlayAdapter(Context context, ArrayList<Play> plays) {
        super(context, 0, plays);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);


            // Get the {@link Play} object located at this position in the list
            Play currentPlay = getItem(position);

            // Find the TextView in the Activity_main.xml layout with the ID song.
            TextView nameSongView = (TextView) listItemView.findViewById(R.id.song);
            // Get the name Song from the currentPlay object and set this text on
            // the Song TextView.
            nameSongView.setText(currentPlay.getNameSong());

            // Find the TextView in the Activity_main.xml layout with the ID author.
            TextView nameAuthorView = (TextView) listItemView.findViewById(R.id.author);
            // Get the name Author from the currentPlay object and set this text on
            // the Author TextView.
            nameAuthorView.setText(currentPlay.getNameAuthor());


            // Find the ImageView in the Activity_main.xml layout with the ID image.
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
            // Check if an image is provided for this word or not
            if (currentPlay.hasImage()) {
                // If an image is available, display the provided image based on the resource ID
                imageView.setImageResource(currentPlay.getImageResourceId());
                // Make sure the view is visible
                imageView.setVisibility(View.VISIBLE);
            } else {
                // Otherwise hide the ImageView (set visibility to GONE)
                imageView.setVisibility(View.GONE);
            }
        }
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
