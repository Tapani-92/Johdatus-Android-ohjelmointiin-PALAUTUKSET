package com.example.egg_timer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

//Lähettää edittextiin asetetun numeron Timeri luokkaan
    public void sendTime(View view)
    {
        Intent classIntent = new Intent(this, Timeri.class);
        EditText editText = (EditText) findViewById(R.id.EditText);
        String message = editText.getText().toString();
        classIntent.putExtra(EXTRA_MESSAGE, message);
        startActivity(classIntent);
    }

}
