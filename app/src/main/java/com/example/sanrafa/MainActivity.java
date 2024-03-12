package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio = MediaPlayer.create(this,R.raw.ceramicaintro);
        audio.start();


        //se detiene despues de los 8 segundos
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                audio.stop();
            }
        }, 8000);
        TimerTask inicioAPP=new TimerTask() {
            @Override
            public void run() {

                Intent nuevaActividad=new Intent(MainActivity.this,Home.class);
                startActivity(nuevaActividad);
            }
        };
        Timer tiempo=new Timer();
        tiempo.schedule(inicioAPP,6000);


    }

}