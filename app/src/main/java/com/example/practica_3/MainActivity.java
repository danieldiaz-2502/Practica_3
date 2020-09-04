package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button azulBoton;
    private Button blancoBoton;
    private Button negroBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                Intent i = new Intent(this, user_activity.class);
                startActivity(i);
                break;
            case R.id.blancoBoton:
                Intent e = new Intent(this, user_activity.class);
                startActivity(e);
                break;
            case R.id.negroBoton:
                Intent o = new Intent(this, user_activity.class);
                startActivity(o);
                break;
        }
    }
}