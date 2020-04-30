package com.example.lab2_4;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.CreateCall).setOnClickListener(this);
        findViewById(R.id.OpenMap).setOnClickListener(this);
        findViewById(R.id.GoWeb).setOnClickListener(this);
    }

//Menee puhelinnumero näkymään mihin on asetettu valmiiksi numero
    public void callToPerson()
    {
        String phoneNumber = "0401415510";
        Intent call = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",phoneNumber,null));
        startActivity(call);
    }
    //Avaa Kotkantien karttanäkymän
    public void getMap()
    {
        Uri location = Uri.parse("geo:0,0?q=,+Kotkantie,+Oulu");
        Intent map = new Intent(Intent.ACTION_VIEW, location);
        startActivity(map);
    }


//Ottaa edittextiin asetetunweb sivu osoitteen ja aloittaa Activityn
    public void showWeb()
    {
        EditText editor = findViewById(R.id.EditText);
        String name = editor.getText().toString();

        Uri internet = Uri.parse(name);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, internet);
        startActivity(webIntent);
    }

    @Override
    //Nappien toiminnallisuudet
    public void onClick(View view) {
                if(view.getId() == R.id.OpenMap) {
            getMap();

        }
        else if(view.getId() == R.id.CreateCall) {
            callToPerson();
        }
        else if(view.getId() == R.id.GoWeb) {
            showWeb();
        }
    }
}
