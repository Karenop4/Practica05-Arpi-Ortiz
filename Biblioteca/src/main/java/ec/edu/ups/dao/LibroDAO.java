/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.LibroIDAO;
import ec.edu.ups.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karen
 */
public class LibroDAO implements LibroIDAO{
    private List <Libro> listaLibros;
    
    public LibroDAO (){
        listaLibros = new ArrayList();
    }

    @Override
    public void create(Libro libro) {
        listaLibros.add(libro);
    }

    @Override
    public Libro read(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(String titulo, Libro libro) {
        for (int i=0; i<listaLibros.size();i++){
            Libro libroBuscado = listaLibros.get(i);
            if (libroBuscado.getTitulo().equals(titulo)){
                listaLibros.set(i, libro);
                break;
            }
        }
    }

    @Override
    public void delete(String titulo) {
        for (int i=0; i<listaLibros.size();i++){
            Libro libroBuscado = listaLibros.get(i);
            if (libroBuscado.getTitulo().equals(titulo)){
                listaLibros.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Libro> list() {
        return listaLibros;
    }
    
    
}
