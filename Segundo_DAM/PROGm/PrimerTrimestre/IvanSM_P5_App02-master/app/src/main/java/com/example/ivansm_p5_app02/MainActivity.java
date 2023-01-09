package com.example.ivansm_p5_app02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaramos el TextView sin valor para luego acceder desde cualquier metodo y cambiar su valor
    public TextView mostrarResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamos el metodo y lo vinculamos con el elemento fisico
        mostrarResultado = (TextView) findViewById(R.id.textViewMedia) ;
    }
    //Metodo que calcula la media de los valores recogidos de los EditText
    public void calcularMedia (View vista){

        //Instanciamos los editText para recoger los valores
        EditText nota = (EditText) findViewById(R.id.editTextNota);
        EditText nota2 = (EditText) findViewById(R.id.editTexNota2);
        EditText nota3 = (EditText) findViewById(R.id.editTexNota3);

        //Pasamos el contenido a una variable int para parsear de EditText a Int y poder realizar operaciones
        int notaRecogida = Integer.parseInt(nota.getText().toString()) ;
        int nota2Recogida = Integer.parseInt((nota2.getText().toString()));
        int nota3Recogida = Integer.parseInt(nota3.getText().toString());

        //Calculamos la operacion
        int media = ((notaRecogida + nota2Recogida + nota3Recogida)/3);

        //Segun el resultado de la media mostrara si esta aprobado o no
        if(media < 5){
            mostrarResultado.setText("Suspenso" );
        }
        if(media >= 5 && media <=7){
            mostrarResultado.setText("Aprobado");
        }
        if (media >=8 && media <=9){
            mostrarResultado.setText("Notable");
        }
        if(media == 10){
            mostrarResultado.setText("Sobresaliente");
        }

    }


}