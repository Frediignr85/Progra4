package com.proyectoprogramacion4.proyectoprogra4.Objetos;

/**
 * Created by Fredy on 11/02/2018.
 */

public class Usuarios {
    String Nombres;
    String Nombre_Usuario;
    String Apellidos;
    String Correo;
    String Contraseña;
    String Ciudad;
    String Pais;
    int Edad;
    String Sexo;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellidos, String correo, String contraseña, String ciudad, String pais, int edad, String sexo, String nombreUsuario) {
        Nombres = nombre;
        Apellidos = apellidos;
        Correo = correo;
        Contraseña = contraseña;
        Ciudad = ciudad;
        Pais = pais;
        Edad = edad;
        Sexo = sexo;
        Nombre_Usuario = nombreUsuario;

    }

    public String getNombreUsuario() {
        return Nombre_Usuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        Nombre_Usuario = nombreUsuario;
    }

    public String getNombre() {
        return Nombres;
    }

    public void setNombre(String nombre) {
        Nombres = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }


}
