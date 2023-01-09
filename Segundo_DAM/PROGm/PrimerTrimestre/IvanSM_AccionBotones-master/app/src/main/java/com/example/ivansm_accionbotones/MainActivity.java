package com.example.ivansm_accionbotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;

    }

    public void sumarCont(View vista){
        contador ++;

        mostrarResultado();
    }

    public void restarCont(View vista){
        contador --;
        mostrarResultado();
    }

    public void resetearCont(View vista){
        contador = 0;
        mostrarResultado();
    }

    public void mostrarResultado(){
        TextView textoResultado =(TextView)findViewById(R.id.contadorPulsaciones);
        textoResultado.setText("Contador: " + contador);
    }
}