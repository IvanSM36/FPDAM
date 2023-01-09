package com.example.ivansm_p5_app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int contador;
    //Declaramos el TextView sin valor para luego acceder desde cualquier metodo y cambiar su valor
    public TextView mostrarTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamos el metodo y lo vinculamos con el elemento fisico
        mostrarTexto =(TextView)findViewById(R.id.textViewContValor);
        contador = 0;
    }

    // Hace que el boton + suma 1 el contador y lo muestra
    public void sumarContador(View vista){
        contador ++;
        mostrarTexto.setText("" + contador);
    }

    //Hace que el boton - reste 1 el contador y lo muestra
    public void restarContador(View vista){
        contador--;
        //Si el contador es menor que 0
        if(contador < 0){
            //instanciamos un checkbox para relacionarlo con el boton CheckBox
            CheckBox numNegativo = (CheckBox)findViewById(R.id.checkBoxNegativo);
            // Comprueba, si no esta chekeado se mantendra a 0, si esta checkeado contara numeros negativos
            if(!numNegativo.isChecked()){
                contador = 0;
            }
        }
        //Mostramos el resultado
        mostrarTexto.setText("" + contador);
    }

    //Metodo que resetea el contador a 0 o el que introduzcamos en el EditText
    public void resetearContador(View vista){
        contador=0;
        //Iniciamos el editText para que se vincule con el elemento editText
        EditText numReset = (EditText)findViewById(R.id.editTexNumeroRest);
        //Parseamos el contenido del edit text a Stringr
        String valorReset = numReset.getText().toString();

        //Comparamos si el String tiene contenido el contador tendra el valor del String
        if(!valorReset.isEmpty()){
            //Parseamos de String a Int
            contador = Integer.parseInt(valorReset);
            //Mostramos el conetido
            mostrarTexto.setText("" + contador);
        }
        else{ //Si no se reseteara siempre a 0
            contador = 0;
            mostrarTexto.setText("" + contador);
        }
    }
}