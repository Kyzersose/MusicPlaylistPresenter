package com.example.shaefferm.musicplaylistpresenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    
}

//TODO Access the storage
//TODO Simple UI to find, and play music
//TODO Scan the contents of the android music directory, AudioManager
//https://developer.android.com/guide/topics/media-apps/audio-app/building-an-audio-app.html
//TODO ListView to display the music content (artist, album, songs)
//TODO Options per object to add to playlist, play now, shuffle now?
//TODO Content Resolver to share playlists to other apps?
