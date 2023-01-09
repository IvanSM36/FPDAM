package com.example.ivansm_p08_listviewimg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Instanciamos el ArrayList
    private ArrayList<Cancion> album;
    private String nombres []={"Survivor","Michael Jackson", "Mojinos Escocios", "Rihana"};

    //Instanciamos los elementos
    private TextView txtView01;
    private ImageView imgViewCan;
    private ListView listView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializamos el ArrayList
        album = new ArrayList<Cancion>();

        //Insertamos los datos creando un objeto Disco
        album.add(new Cancion("Eyes of the Tiger", "Rock"));
        album.add(new Cancion("Beat it", "Pop"));
        album.add(new Cancion("Las niñas de la Saye", ""));
        album.add(new Cancion("Umbrella", ""));



        //Inicializamos los elementos
        txtView01 = (TextView)findViewById(R.id.textView01);
        imgViewCan =(ImageView)findViewById(R.id.imgViewCancion);
        listView01 = (ListView)findViewById(R.id.list01);

        //Recoge los datos del array nombres y los agrega a la listView de res/layout/lista_Canciones.xml
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, R.layout.lista_canciones, nombres);
        listView01.setAdapter(adaptador);

        //Creamos el metodo para darle accion a los items de la lista
        listView01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Cambia y muestra  el titulo adecuado
                txtView01.setText("Titulo: " + album.get(i).getTitulo());

                //Si el genero es Rock muestra la imagen Rock
                if(album.get(i).getGenero().equals("Rock"))
                    imgViewCan.setImageResource(R.mipmap.rock);
                    //Si el genero es Pop muestra la imagen Pop
                else if(album.get(i).getGenero().equals("Pop")){
                    imgViewCan.setImageResource(R.mipmap.pop);
                    //Si el genero no esta establecido muestra la imagen por defecto
                } else{
                    imgViewCan.setImageResource(R.mipmap.caratula);

                }
            }
        });
    }

}


