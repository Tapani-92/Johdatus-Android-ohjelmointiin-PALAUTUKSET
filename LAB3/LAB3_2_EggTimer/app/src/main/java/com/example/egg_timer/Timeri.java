package com.example.egg_timer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Timeri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeri);

        // Vastaanottaa Edittextin, joka asetetaan message nimiseen Stringiin
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

//Muuttaa Stringiksi saadun viestin integeriksi
        int rightTime = Integer.parseInt(message);
        final TextView timeText = (TextView)findViewById(R.id.TextView2);

//Timerin toiminnallisuus, jossa integer tyyppinen rightTime on asetettu timeriin
        new CountDownTimer(rightTime*1000, 1000) {

            public void onTick(long millisUntilFinished)
            {
                timeText.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            //Kun timeri loppuu syntyy ääni
            public void onFinish()
            {
                MediaPlayer ring = MediaPlayer.create(Timeri.this,R.raw.elephant);
                ring.start();
                timeText.setText("done!");
            }
        }.start();

    }



}
