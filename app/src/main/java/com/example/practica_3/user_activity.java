package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class user_activity extends AppCompatActivity implements View.OnClickListener {

    private Button azulBoton;
    private Button blancoBoton;
    private Button negroBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_activity);

        azulBoton = findViewById(R.id.azulBoton);
        negroBoton = findViewById(R.id.negroBoton);
        blancoBoton = findViewById(R.id.blancoBoton);

        azulBoton.setOnClickListener(this);
        negroBoton.setOnClickListener(this);
        blancoBoton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.azulBoton:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.blancoBoton:
                Intent e = new Intent(this, MainActivity.class);
                startActivity(e);
                break;
            case R.id.negroBoton:
                Intent o = new Intent(this, MainActivity.class);
                startActivity(o);
                break;
        }
    }
}