package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nota_activity extends AppCompatActivity implements View.OnClickListener {

    private Button calcularBoton;
    private EditText proyecto1Edit;
    private EditText proyecto2Edit;
    private EditText quicesEdit;
    private EditText parcial1Edit;
    private EditText parcial2Edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota_activity);

        calcularBoton = findViewById(R.id.calcularBoton);
        proyecto1Edit = findViewById(R.id.proyecto1Edit);
        proyecto2Edit = findViewById(R.id.proyecto2Edit);
        quicesEdit = findViewById(R.id.quicesEdit);
        parcial1Edit = findViewById(R.id.parcial1Edit);
        parcial2Edit = findViewById(R.id.parcial2Edit);
        calcularBoton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.calcularBoton:
                Intent i = new Intent(this, resultado_activity.class);
                startActivity(i);
                break;

        }
    }
}