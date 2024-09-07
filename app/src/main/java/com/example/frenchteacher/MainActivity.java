package com.example.frenchteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView text;
Button black,green,red,yellow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        black=findViewById(R.id.black);
        green = findViewById(R.id.green);
        red =findViewById(R.id.red);
        yellow= findViewById(R.id.yellow);

        black.setOnClickListener(this);
        green.setOnClickListener(this);
        red.setOnClickListener(this);
        yellow.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int clickedId = v.getId();

        if(clickedId == R.id.black){
            playSound(R.raw.black);
        }
        else if(clickedId == R.id.red){
            playSound(R.raw.red);
        }
        else if(clickedId == R.id.green){
            playSound(R.raw.green);
        }
        else {
            playSound(R.raw.yellow);
        }

    }
    public void playSound(int id){
        MediaPlayer mediaPlayer =  MediaPlayer.create(this,id);
                mediaPlayer.start();
    }
}