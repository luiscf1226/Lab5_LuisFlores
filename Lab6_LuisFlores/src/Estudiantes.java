/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Carlos Flores
 */
public class Estudiantes {
    private String nombre,apellido,genero;
    private int cuenta;
    private int edad;
    Carrera c;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, String genero, int cuenta, int edad, Carrera c) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.cuenta = cuenta;
        this.edad = edad;
        this.c = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carrera getC() {
        return c;
    }

    public void setC(Carrera c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", cuenta=" + cuenta + ", edad=" + edad + ", c=" + c + '}';
    }

    
    
}
