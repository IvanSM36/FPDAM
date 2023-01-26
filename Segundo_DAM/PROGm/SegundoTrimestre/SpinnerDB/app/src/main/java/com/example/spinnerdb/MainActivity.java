package com.example.spinnerdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view){
        Intent miIntent = null;

        switch (view.getId()){
            case R.id.btnRegistro:
                miIntent = new Intent(MainActivity.this, RegistroUsuario.class);
                startActivity(miIntent);
                break;
            case R.id.btnConsultarUser:
                miIntent = new Intent(MainActivity.this, ConsultarUsuario.class);
                startActivity(miIntent);
                break;
        }
    }


}