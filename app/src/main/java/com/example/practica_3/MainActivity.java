package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button configBoton;
    public Button continuarBoton;
    public EditText nombreEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configBoton = findViewById(R.id.configBoton);
        continuarBoton = findViewById(R.id.continuarBoton);
        nombreEstudiante = findViewById(R.id.nombreEstudiante);

        configBoton.setOnClickListener(this);
        continuarBoton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.configBoton:
                Intent i = new Intent(this, user_activity.class);
                startActivity(i);
                break;
            case R.id.continuarBoton:
                String nombre = nombreEstudiante.getText().toString();
                SharedPreferences preferences = getSharedPreferences("nombreEstudiante",MODE_PRIVATE);
                preferences.edit().putString("nombre", nombre).apply();
                Intent e = new Intent(this, nota_activity.class);
                startActivity(e);
                break;
        }

    }
}
