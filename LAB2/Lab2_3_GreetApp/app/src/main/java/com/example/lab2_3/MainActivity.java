package com.example.lab2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.Suomeksi).setOnClickListener(this);
        findViewById(R.id.Sverige).setOnClickListener(this);
        findViewById(R.id.English).setOnClickListener(this);
        findViewById(R.id.Surprise).setOnClickListener(this);

    }

    //Ottaa käyttäjän asettaman tekstin Edittextistä
    private String getTextFieldText()
    {
        EditText myGreetings = findViewById(R.id.Name);
        String text = myGreetings.getText().toString();
        myGreetings.setText(null);
        return text;
    }
@Override
//Asettaa tervehdystekstin napin painalluksesta
    public void onClick(View v)
{
    String addName = getTextFieldText();
    if(v.getId() == R.id.Suomeksi) {
    TextView greetingText = (TextView) findViewById(R.id.Greeting);
        greetingText.setText("Terve "+addName);
}
    if(v.getId() == R.id.Sverige) {
    TextView greetingText = (TextView) findViewById(R.id.Greeting);
    greetingText.setText("Hejssan "+addName);
}
    if(v.getId() == R.id.English) {
    TextView greetingText = (TextView) findViewById(R.id.Greeting);
    greetingText.setText("Hi "+addName);
}
    if(v.getId() == R.id.Surprise) {
        TextView greetingText = (TextView) findViewById(R.id.Greeting);
        greetingText.setText("Hola "+addName);
    }

}


}