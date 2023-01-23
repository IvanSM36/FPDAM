package com.example.appsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appsqlite.utilidades.Utilidades;

public class RegistroUsuario extends AppCompatActivity {

    EditText campoId;
    EditText campoNombre;
    EditText campoTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        campoId = (EditText) findViewById(R.id.ediTxtId);
        campoNombre = (EditText) findViewById(R.id.ediTxtNombre);
        campoTelefono = (EditText) findViewById(R.id.ediTxtTelefono);

    }

    public void onClick(View view){
        registrarUsuarios();
        //registrarUsuariosSql();
    }

   /* private void registrarUsuariosSql(){
        //Hago la conexion con la BBDD
        ConexionSQLiteHelper con = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);
        SQLiteDatabase db = con.getWritableDatabase(); // Edito la BBDD

        //insert into usuario (id, nombre, telefono) values (123, 'Ivan', '685489562')

        String insert = "INSERT INTO " + Utilidades.TABLA_USUARIO
                + " ( " + Utilidades.CAMPO_ID+ ", " + Utilidades.CAMPO_NOMBRE + ", " + Utilidades.CAMPO_TELEFONO + ")" +
                "VALUES (" + campoId.getText().toString() + ", " + campoNombre.getText().toString() + ", "
                + campoTelefono.getText().toString() + "')";
        db.execSQL(insert);

        Toast.makeText(getApplicationContext(), "Ha insertado un valor en la tabla Usuario", Toast.LENGTH_SHORT).show();
        db.close();
    }*/


        private void registrarUsuarios(){
            // Hago la conexion con la BBDD
            ConexionSQLiteHelper con = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);
             SQLiteDatabase db = con.getWritableDatabase(); // Edito la BBDD

             ContentValues values = new ContentValues();
             values.put(Utilidades.CAMPO_ID, campoId.getText().toString());
             values.put(Utilidades.CAMPO_NOMBRE, campoNombre.getText().toString());
             values.put(Utilidades.CAMPO_TELEFONO, campoTelefono.getText().toString());

             //Hacemos el INSERT en la BBDD -- Base de datos, el campo que nos dedvuelve, valores a insertar
             Long idResultante = db.insert(Utilidades.TABLA_USUARIO,Utilidades.CAMPO_ID, values);

             Toast.makeText(getApplicationContext(), "Id Registro: " + idResultante, Toast.LENGTH_SHORT).show();
             db.close();
        }



}