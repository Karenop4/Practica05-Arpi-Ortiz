/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author arpi
 */
public class Usuario extends Persona{
    private String direccion;
    private String telefono;
    private ArrayList<Prestamo> listaPrestamos;

    public Usuario(){
        this.listaPrestamos = new ArrayList();
    }

    public Usuario(String identificacion, String nombre, String direccion, String telefono) {
        super(identificacion, nombre);
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaPrestamos = new ArrayList();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.direccion, other.direccion);
    }

    @Override
    public String toString() {
        return "Usuario: " + "ID[" + super.getIdentificacion() + "] " + "Nombre[" + super.getNombre() + "]" + "Direccion[" + direccion + "]";
    }    
}
