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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_activity);

        otraVezBoton = findViewById(R.id.otraVezBoton);
        mensajeEdit = findViewById(R.id.mensajeEdit);
        notaFinal = findViewById(R.id.notaFinal);
        otraVezBoton.setOnClickListener(this);
        String variableNombre = getSharedPreferences("nombreEstudiante", MODE_PRIVATE).getString("nombre", "No hay nombre");
        mensajeEdit.setText("Hola " + variableNombre + ", tu nota final es de:");

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.otraVezBoton:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
        }
    }
}