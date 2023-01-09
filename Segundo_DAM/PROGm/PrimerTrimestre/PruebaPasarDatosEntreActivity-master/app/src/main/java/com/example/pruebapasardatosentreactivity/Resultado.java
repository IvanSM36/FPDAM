package com.example.pruebapasardatosentreactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        Bundle dat = getIntent().getExtras();

        int num = dat.getInt("editText01");
        int num2 = dat.getInt("editText02");

        int result = num + num2;

        TextView valorResult = (TextView) findViewById(R.id.textResultado);

        valorResult.setText(result);

    }
}
