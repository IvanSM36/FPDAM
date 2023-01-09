package com.example.ivansm_p06_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    //Iniciamos un sppiner
    Spinner spinnerNivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Le declaramos para indicarle el boton del Spinner
        spinnerNivel = (Spinner)findViewById(R.id.spinnerNiveles);

        //Creamos un array con el contenido del array.xml
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.niveles, android.R.layout.simple_spinner_item );
        spinnerNivel.setAdapter(adapter);
    }

}