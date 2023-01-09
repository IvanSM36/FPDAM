package com.example.ivansm_p08_listviewimg;

public class Cancion {
    private String titulo;
    private String genero;

    public Cancion(String titulo, String genero) {
        this.titulo=titulo;
        this.genero=genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
