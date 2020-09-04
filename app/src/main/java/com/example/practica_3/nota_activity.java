package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class nota_activity extends AppCompatActivity {

    private Button calcularBoton;
    private EditText proyecto1Edit;
    private EditText proyecto2Edit;
    private EditText quicesEdit;
    private EditText parcial1Edit;
    private EditText parcial2Edit;
    private EditText ejercicios;

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
        ejercicios = findViewById(R.id.ejercicios);
        calcularBoton.setOnClickListener(
                (view)->{
                    Intent i = new Intent(this, resultado_activity.class);
                    String proyecto1 = proyecto1Edit.getText().toString();
                    String proyecto2 = proyecto2Edit.getText().toString();
                    String quices = quicesEdit.getText().toString();
                    String parcial1 = parcial1Edit.getText().toString();
                    String parcial2 = parcial2Edit.getText().toString();
                    String ejerciciosCalculo = ejercicios.getText().toString();
                    i.putExtra("proyecto1", proyecto1);
                    i.putExtra("proyecto2", proyecto2);
                    i.putExtra("quices", quices);
                    i.putExtra("parcial1", parcial1);
                    i.putExtra("parcial2", parcial2);
                    i.putExtra("ejercicios", ejerciciosCalculo);
                    startActivity(i);
                }
        );
    }
}