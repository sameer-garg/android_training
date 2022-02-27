package com.example.training;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class media_player extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        final Button button = (Button) findViewById(R.id.play);
        Intent i1=new Intent(this ,song_service.class);
        Intent i2=new Intent(this ,song_service.class);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             startService(i1);
            }
        });
        final Button button1 = (Button) findViewById(R.id.stop_music);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopService(i2);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}