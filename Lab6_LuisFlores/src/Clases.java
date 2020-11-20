/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Carlos Flores
 */
public class Clases {
    private String nombre;
    private String seccion;
    private int edificio;
    private int salon;
    private String acondicionado;

    public Clases() {
    }

    public Clases(String nombre, String seccion, int edificio, int salon, String acondicionado) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.acondicionado = acondicionado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public String getAcondicionado() {
        return acondicionado;
    }

    public void setAcondicionado(String acondicionado) {
        this.acondicionado = acondicionado;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", seccion=" + seccion + '}';
    }
    
}
