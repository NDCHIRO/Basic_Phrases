package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Boolean isPlaying=false;
    public void playPhrases(View view)
    {
        Button audioBtn = (Button) view;
        //check if there is an audio already playing or no so there will not be two audio playing in the same time
        // last button only will continue the audio
        // isplaying was used as first time there will be no media player created so the app will crash
        if (isPlaying == true)
            isAudioplaying();

        //start the audio using button tag as the name of the audio
        mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(audioBtn.getTag().toString(), "raw", getPackageName()));
        mediaPlayer.start();
        isPlaying = true;
    }

    public void isAudioplaying()
    {
        mediaPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}