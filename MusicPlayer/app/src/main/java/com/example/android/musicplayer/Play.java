package com.example.android.musicplayer;

/**
 * Created by marti on 2/21/2018.
 */

public class Play {

    /**
     * Song name
     */
    private int mNameSong;

    /**
     * Author name
     */
    private int mNameAuthor;

    /**
     * Image resource ID for the Play
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this Play
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Play object.
     *
     * @param nameSong   is the play song name
     * @param nameAuthor is the play author name
     */

    public Play(int nameSong, int nameAuthor, int imageResourceId) {
        mNameSong = nameSong;
        mNameAuthor = nameAuthor;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the Song name of the Play.
     */
    public int getNameSong() {
        return mNameSong;
    }

    /**
     * Get the Author name of the Play.
     */
    public int getNameAuthor() {
        return mNameAuthor;
    }

    /**
     * Return the image resource ID of the play.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this play.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

