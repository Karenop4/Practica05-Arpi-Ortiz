/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;

/**
 *
 * @author karen
 */
public class Biblioteca {
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList <Libro> listaLibros;

    public Biblioteca() {
        listaLibros = new ArrayList();
    }

    public Biblioteca(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        listaLibros = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    public void anadirLibro(Libro libro){
        listaLibros.add(libro);
    }
    
    public void actualizarLibro(Libro libro){
        int cont =0;
        for(Libro libro2:listaLibros){
            if(libro2.getTitulo().equals(libro.getTitulo())){
                listaLibros.set(cont, libro2);
            }
        }
    }
    
    public void eliminarLibro(Libro libro){
        listaLibros.remove(libro);
    }
    
    public ArrayList<Libro> devolverLibros(){
        return listaLibros;
    }
    
    public Libro buscarLibro(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null; // Retornar null si no se encuentra el libro con el título dado
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.codigo;
        return hash;
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
        final Biblioteca other = (Biblioteca) obj;
        return this.codigo == other.codigo;
    }
    
    

    @Override
    public String toString() {
        return "Biblioteca{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
}
