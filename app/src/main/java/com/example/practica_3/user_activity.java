package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class user_activity extends AppCompatActivity implements View.OnClickListener {

    public Button configBoton;
    public Button continuarBoton;
    public EditText nombreEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_activity);

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
                String nombre = nombreEstudiante.getText().toString();
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                i.putExtra("nombre", nombre);
                break;
            case R.id.continuarBoton:
                Intent e = new Intent(this, nota_activity.class);
                startActivity(e);
                break;
        }

    }
}