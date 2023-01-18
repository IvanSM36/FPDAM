package com.example.appsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    /* *
     * Constructor
     * @param Context context -- contexto de la aplicacion
     * @param String name -- nombre de la BBDD
     * @param CursosFactory factory -- en principio sera null
     * @param version -- version de la BBDD
     */
    public ConexionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    /* *
     * Genera las tablas de nuestra BBDD
     */
    public void onCreate(SQLiteDatabase db) {
        //Ejecuta la sentencia SQL que crea la tabla Usuario
        db.execSQL("CREATE TABLE usuario (id INTEGER, nombre TEXT, telefono TEXT)");
        // db.execSQL(Utilidades.CREAR_TABLA_USUARIO);
    }

    /* *
     *  Si existe una version antigua de la BBDD, la elimina y se uqeda con la nueva
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Si existe la tabla usuarios. la borra y la vuelve a crear
        db.execSQL("DROP TABLE IF EXISTS usuarios");
        onCreate(db);
    }

}
