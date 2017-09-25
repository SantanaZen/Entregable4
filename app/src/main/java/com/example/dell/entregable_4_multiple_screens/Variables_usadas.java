package com.example.dell.entregable_4_multiple_screens;

import java.io.Serializable;

/**
 * Created by Dell on 24/09/2017.
 */

public class Variables_usadas implements Serializable {

    private String nombre;
    private String descripcion;
    private int meme;

    public Variables_usadas(String nombre, String descripcion, int meme) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.meme = meme;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMeme() {
        return meme;
    }

    public void setMeme(int meme) {
        this.meme = meme;
    }
}
