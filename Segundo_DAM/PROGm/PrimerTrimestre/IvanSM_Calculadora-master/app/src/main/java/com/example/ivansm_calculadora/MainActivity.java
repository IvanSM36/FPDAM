package com.example.ivansm_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variable que recoge los datos num y num2
    public int num = 0;
    public int num2 = 0;
    //Variable que recoge el tipo de operador
    public String calcular = "";
    //Mostrara el resultado al textview
    public TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicializamos el textview resultado
        resultado = findViewById(R.id.textViewPantalla);

    }

    //Metodo que cuando se pulsa un numero se envia al textView resultado
    public void escribirCero(View view){
        //Si el primer contenido del textview es 0 se mantendra el 0 y no lo repetirá
        if(resultado.getText().toString().equals("0")){
            resultado.setText("0");
        }else{
            //Si tiene algo ya escrito le concatenamos el 0
            resultado.setText(resultado.getText() + "0");
        }
    }

    public void escribirUno(View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("1");
        }else{
            resultado.setText(resultado.getText() + "1");
        }
    }

    public void escribirDos(View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("2");
        }else{
            resultado.setText(resultado.getText() + "2");
        }
    }

    public void escribirTres(View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("3");
        }else{
            resultado.setText(resultado.getText() + "3");
        }
    }

    public void escribirCuatro(View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("4");
        }else{
            resultado.setText(resultado.getText() + "4");
        }
    }

    public void escribirCinco(View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("5");
        }else{
            resultado.setText(resultado.getText() + "5");
        }
    }

    public void escribirSeis(View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("6");
        }else{
            resultado.setText(resultado.getText() + "6");
        }
    }

    public void escribirSiete(View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("7");
        }else{
            resultado.setText(resultado.getText() + "7");
        }
    }

    public void escribirOcho(View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("8");
        }else{
            resultado.setText(resultado.getText() + "8");
        }
    }

    public void escribirNueve(View view){
        if(resultado.getText().toString().equals("0")){
            resultado.setText("9");
        }else{
            resultado.setText(resultado.getText() + "9");
        }
    }

    //Metodo que indica el tipo de operador
    public void sumar(View view){
       //Al pulsar sumar indicara suma
        calcular = "+";
        //Guardamos con un metodo los valores del num
        guardarNum(view);
    }

    public void restar(View view){
        calcular = "-";
        guardarNum(view);
    }

    public void multiplicar(View view){
        calcular = "*";
        guardarNum(view);
    }

    public void dividir(View view){
        calcular = "/";
        guardarNum(view);
    }

    public void potencia(View view){
        calcular = "^";
        guardarNum(view);
    }

    //Metodo que borra el ultimo digito insertado
    public void borrar(View view){
        String text = resultado.getText().toString();
        resultado.setText((text.substring(0, text.length() - 1)));
    }

    // Metodo que resetea el textview a 0
    public void resetear(View view){
        num = 0;
        num2 = 0;
        calcular = "";
        resultado.setText("0");
    }

    //Metodo que guarda el valor de num para que no se pierda
    public void guardarNum(View view){
        num = Integer.parseInt(resultado.getText().toString());
        resultado.setText("0");
    }

    //Metodo que realizara el calculo y lo mostrará por el textview
    public void botonIgual(View view) {
        double resultadoFinal = 0;
        num2 = Integer.parseInt(resultado.getText().toString());

        //Suma
        //Si calcular es igual a + hara´el calculo sumar
        if (calcular.equals("+")) {
           resultadoFinal = num + num2;
           //Lo parseamos a string para mostrarlo por el textview
           resultado.setText(String.valueOf(resultadoFinal));
        }
        //Restar
        if(calcular.equals("-")){
            resultadoFinal = num - num2;
            resultado.setText(String.valueOf(resultadoFinal));
        }
        //Multiplicar
        if(calcular.equals("*")){
            resultadoFinal = num * num2;
            resultado.setText(String.valueOf(resultadoFinal));
        }
        //Dividir
        if(calcular.equals("/")){
            resultadoFinal = num / num2;
            resultado.setText(String.valueOf(resultadoFinal));
        }
        //Potencia
        if (calcular.equals("^")){
            resultadoFinal = Math.pow(num, num2);
            resultado.setText(String.valueOf(resultadoFinal));
        }


    }
}