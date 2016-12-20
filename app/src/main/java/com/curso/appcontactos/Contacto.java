package com.curso.appcontactos;

import android.util.Log;

/**
 * Created by quevivalapauli on 14/12/16.
 */

public class Contacto {
    private  String nombre;
    private  int dia;
    private int mes;
    private int anyo;
    private  String telefono;
    private  String email;
    private  String descripcion;





    //private static final String TAG = "Contacto";

    public Contacto() {
        this.nombre = "El nombre del constructor";
    }

    public Contacto(String nombre, int dia, int mes, int anyo, String telefono, String email, String descripcion) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        this.telefono = telefono;
        this.email = email;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesripcion() {
        return descripcion;
    }

    public void setDesripcion(String desripcion) {
        this.descripcion = desripcion;
    }


}


