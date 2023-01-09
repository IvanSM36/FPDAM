package com.example.practica02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate La actividad esta creada", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "OnStart La actividad está a punto de hacerse visible", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "OnResumen La actividad se ha vuelto visible", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "OnPause Enfocarse en otra actividad", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad (esta actividad está a punto de ser detenida)
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "OnStop La actividad no esta disponible", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible(ahora esta "detenida")
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "OnDestroy La actividad esta apunto de ser destruida", Toast.LENGTH_SHORT).show();
        //La aactividad esta apunto de ser destruida
    }

}