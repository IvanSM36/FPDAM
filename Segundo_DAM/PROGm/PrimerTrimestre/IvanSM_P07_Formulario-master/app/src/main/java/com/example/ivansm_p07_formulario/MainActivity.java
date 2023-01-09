package com.example.ivansm_p07_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Instanciamos los botones
    private Button btnRemitir;
    private EditText editTXT_Tarea;
    private EditText editText_Persona_Enc;
    private RadioGroup radioGroup;
    private CheckBox chBox_Externo;
    private CheckBox chBox_Copia;
    private Spinner spinDiaInicio;
    private Spinner spinMesInicio;
    private Spinner spinAnioInicio;
    private Spinner spinDiaFin;
    private Spinner spinMesFin;
    private Spinner spinAnioFin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializamos y viculamos las variables con los botones
        btnRemitir = (Button)findViewById(R.id.btnRemitir);
        editTXT_Tarea = (EditText)findViewById(R.id.editTextTarea);
        editText_Persona_Enc = (EditText)findViewById(R.id.editTextEncargada);
        chBox_Externo = (CheckBox) findViewById(R.id.checkExterno);
        chBox_Copia = (CheckBox) findViewById(R.id.checkCopia);
        spinDiaInicio = (Spinner)findViewById(R.id.spinDiaInicio);
        spinMesInicio = (Spinner)findViewById(R.id.spinMesInicio);
        spinAnioInicio = (Spinner)findViewById(R.id.spinAnioInicio);
        spinDiaFin = (Spinner)findViewById(R.id.spinDiaFin);
        spinMesFin = (Spinner)findViewById(R.id.spinMesFin);
        spinAnioFin =(Spinner)findViewById(R.id.spinAnioFin);

        //Creamos unlos arrays y lo rellenamos con el contenido del archivo array.xml en res/values/array.xml
        ArrayAdapter<CharSequence> diaInicio = ArrayAdapter.createFromResource(this, R.array.dia, android.R.layout.simple_spinner_item );
        spinDiaInicio.setAdapter(diaInicio);

        ArrayAdapter<CharSequence> mesInicio = ArrayAdapter.createFromResource(this, R.array.mes, android.R.layout.simple_spinner_item );
        spinMesInicio.setAdapter(mesInicio);

        ArrayAdapter<CharSequence> anioInicio = ArrayAdapter.createFromResource(this, R.array.anio, android.R.layout.simple_spinner_item );
        spinAnioInicio.setAdapter(anioInicio);

        ArrayAdapter<CharSequence> diaFin = ArrayAdapter.createFromResource(this, R.array.dia, android.R.layout.simple_spinner_item );
        spinDiaFin.setAdapter(diaFin);

        ArrayAdapter<CharSequence> mesFin = ArrayAdapter.createFromResource(this, R.array.mes, android.R.layout.simple_spinner_item );
        spinMesFin.setAdapter(mesFin);

        ArrayAdapter<CharSequence> anioFin = ArrayAdapter.createFromResource(this, R.array.anio, android.R.layout.simple_spinner_item );
        spinAnioFin.setAdapter(anioFin);

    }

    /*
     * Metodo que comprueba los campos y genera mensajes toast si falta alguno por rellenar
     */
    public void comprobar (View view) {
        String tarea = editTXT_Tarea.getText().toString();
        String persona = editText_Persona_Enc.getText().toString();
        RadioGroup rGDepartamento = (RadioGroup) findViewById(R.id.radioGDepartamento);
        RadioGroup rGEstado = (RadioGroup) findViewById(R.id.radioGEstado);

        // Si la tarea esta vacia saldra un mensaje toast
        if (tarea.equals("")){
            Toast.makeText(this, "Por favor, introduzca una tarea", Toast.LENGTH_SHORT).show();

            editTXT_Tarea.requestFocus();
        }
        if (persona.equals("")){
            Toast.makeText(this, "Por favor, introduzca una persona encargada", Toast.LENGTH_SHORT).show();

            editText_Persona_Enc.requestFocus();
        }

        if (rGDepartamento.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, selecciona un departamento", Toast.LENGTH_SHORT).show();
        }

        if (rGEstado.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Por favor, seleciona un estado de la tarea", Toast.LENGTH_SHORT).show();
        }

        String s = "Estado externo: " + (chBox_Externo.isChecked() ? "Activado" : "No esta activado");
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();

        s = "Estado de la copia: " + (chBox_Copia.isChecked() ? "Activada" : "No está activada");
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }

}