package com.example.appsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
       // registrarUsuarios();
        registrarUsuariosSql();
    }

    private void registrarUsuariosSql(){
        //Hago la conexion con la BBDD
        ConexionSQLiteHelper con = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);
        SQLiteDatabase db = con.getWritableDatabase(); // Edito la BBDD

        //insert into usuario (id, noombree, telefono) values (123, 'Ivan', '685489562')
    }

}