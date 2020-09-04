package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultado_activity extends AppCompatActivity implements View.OnClickListener{

    private TextView notaFinal;
    private Button otraVezBoton;
    private TextView mensajeEdit;
    float proyecto1;
    float proyecto2;
    float quices;
    float parcial1;
    float parcial2;
    float ejercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_activity);

        otraVezBoton = findViewById(R.id.otraVezBoton);
        mensajeEdit = findViewById(R.id.mensajeEdit);
        notaFinal = findViewById(R.id.notaFinal);
        otraVezBoton.setOnClickListener(this);
        proyecto1 = Float.parseFloat(getIntent().getExtras().getString("proyecto1"));
        proyecto2 = Float.parseFloat(getIntent().getExtras().getString("proyecto2"));
        quices = Float.parseFloat(getIntent().getExtras().getString("quices"));
        parcial1= Float.parseFloat(getIntent().getExtras().getString("parcial1"));
        parcial2 = Float.parseFloat(getIntent().getExtras().getString("parcial2"));
        ejercicios = Float.parseFloat(getIntent().getExtras().getString("ejercicios"));
        String variableNombre = getSharedPreferences("nombreEstudiante", MODE_PRIVATE).getString("nombre", "No hay nombre");
        mensajeEdit.setText("Hola " + variableNombre + ", tu nota final es de:");
        calcularResultado();

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.otraVezBoton:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                finish();
                break;
        }
    }
    public void calcularResultado(){
        float project1 = (float) (proyecto1 * 0.25);
        float project2 = (float) (proyecto2 * 0.25);
        float quiz = (float) (quices * 0.15);
        float exam1 = (float) (parcial1 * 0.15);
        float exam2 = (float) (parcial2* 0.15);
        float exer = (float) (ejercicios * 0.05);
        float resultado = project1 + project2 + quiz + exam1 + exam2 + exer;
        notaFinal.setText(resultado + "");
    }
}