package com.example.audioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play (View view){

        Button btn = (Button) view;

            MediaPlayer mPlayer = MediaPlayer.create(this, getResources().getIdentifier( btn.getTag().toString(), "raw", getPackageName()));
            mPlayer.start();
    }
}