
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Carlos Flores
 */
public class Maestros {
    private String nombre,apellido;
    private float salario;
    private int edad;
    private ArrayList <Clases> lista=new ArrayList();

    public Maestros() {
    }

    public Maestros(String nombre, String apellido, float salario, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Clases> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Clases> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Maestros{" + "nombre=" + nombre + '}';
    }
    
}
