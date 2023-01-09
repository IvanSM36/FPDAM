package com.example.pruebapasardatosentreactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irResultado (View view){
        EditText text1 =(EditText) findViewById(R.id.editText01);
        EditText text2 =(EditText) findViewById(R.id.editText02);

        int n1 = Integer.parseInt(text1.getText().toString());
        int n2 = Integer.parseInt(text2.getText().toString());

        Intent i = new Intent(this, Resultado.class);

        i.putExtra("editText01", n1);
        i.putExtra("editText02", n2);

        startActivity(i);
    }
}