package com.example.spinnerdb;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.spinnerdb.entidades.Usuario;
import com.example.spinnerdb.utilidades.Utilidades;

import java.util.ArrayList;

public class ConsultarSpinner extends AppCompatActivity {

    Spinner spinPersona;
    TextView txtNombre, txtDocumento, txtTelefono;
    ArrayList<String> listInfoPersonas; // Contiene informacion del Combo o Spinner
    ArrayList<Usuario> listaPersonas; // Objetos de la clase Usuario

    ConexionSQLiteHelper con; // Conexion a nuestra BBDD

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_spinner);

        con = new ConexionSQLiteHelper(getApplicationContext(), "bd_usuarios", null, 1);

        spinPersona = (Spinner) findViewById(R.id.spinner);

        txtDocumento = (TextView) findViewById(R.id.txtViewResulDocumento);
        txtNombre = (TextView) findViewById(R.id.txtViewResulNombre);
        txtTelefono = (TextView) findViewById(R.id.txtViewResulTelefono);

        //  Llamamos a la BBDD y obtenemos la lista de personas
        consultarListaPersonas();
        //Hasta aqui obtengo los datos de la BBDD y los vuelco en un arraylist llamado listaPersonas con usuarios
        //De este listaPersonas obtengo el ID y el nombre y los concateno en un string para mostrarlos a traves del listInfoPersonas

        //Despues de llamar al metodo anterior, debemos cargar los valores en el combo o Spinner
        ArrayAdapter<CharSequence> adaptador = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listInfoPersonas);

        spinPersona.setAdapter(adaptador); // Con esto rellenamos el Spinner

        //A cada item del spinner, vamos a lanzarle un evento para recoger el valor en loscmapos id,
        //nombre y telefono
        spinPersona.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Position es la posicion del elemento que selecciono dentro del Spinner
                if(position!=0){
                    txtDocumento.setText(listaPersonas.get(position-1).getId().toString()); //Position -1 porque tengo un Seleccione como primer campo
                    txtNombre.setText(listaPersonas.get(position-1).getNombre());
                    txtTelefono.setText(listaPersonas.get(position-1).getTelefono());
                }else{
                    txtDocumento.setText("");
                    txtNombre.setText("");
                    txtTelefono.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void consultarListaPersonas(){
        SQLiteDatabase db = con.getReadableDatabase(); //Leemos de la BBDD

        Usuario persona = null;
        listaPersonas = new ArrayList<Usuario>(); //ArrayList de Usuarios
        Cursor cursor = db.rawQuery("SELECT * FROM " + Utilidades.TABLA_USUARIO, null); // sin parametros

        // Si hay mas de un registro en el cursor, lo vamos recorriendo
        while (cursor.moveToNext()){
            persona = new Usuario(); //Genero un objeto nuevo para ir llenandolo
            persona.setId(cursor.getInt(0));
            persona.setNombre(cursor.getString(1));
            persona.setTelefono(cursor.getString(2));

            Log.i("id", persona.getId().toString());
            Log.i("Nombre", persona.getNombre());
            Log.i("Tel", persona.getTelefono());

            listaPersonas.add(persona); //Llenamos el arraylist con objetos de usuario
        }

        obtenerLista(); //Vamos a meter los elementos en el combo o Spinner.

    }

    private void obtenerLista(){
        listInfoPersonas = new ArrayList<String>();
        listInfoPersonas.add("Seleccione");

        //Recogemos la lista de objetos que obtuvimos anteriormente
        for (int i = 0; i<listaPersonas.size(); i++){
            listInfoPersonas.add(listaPersonas.get(i).getId() + " - " + listaPersonas.get(i).getNombre());
        }

    }
}