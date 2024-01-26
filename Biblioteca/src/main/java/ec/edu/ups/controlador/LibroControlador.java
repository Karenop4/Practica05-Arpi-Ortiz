/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.LibroIDAO;
import ec.edu.ups.modelo.Libro;
import java.util.List;

/**
 *
 * @author karen
 */
public class LibroControlador {
    private LibroIDAO libroDAO;
    private Libro libro;

    public LibroControlador(LibroIDAO libroDAO) {
        this.libroDAO = libroDAO;
    }
    
    public void create(int codigoBiblio, String titulo, String autor, String genero, int anho){
        libro = new Libro(codigoBiblio,titulo, autor, genero, anho, true);
        libroDAO.create(libro);
        libroDAO.actualizarArchivo();
    }
    
    public Libro read (String titulo){
        libro = libroDAO.read(titulo);
        return libro;
    }
    
    public void delete(String titulo){
        libroDAO.delete(titulo);
        libroDAO.actualizarArchivo();
    }
    
    public void update (String titulo, String autor, String genero, int anho, boolean disponible){
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setGenero(genero);
        libro.setAnho(anho);
        libro.setDisponoible(disponible);
        libroDAO.update(titulo, libro);
        libroDAO.actualizarArchivo();
    }
    
    public List <Libro> list (){
        return libroDAO.list();
    }
}
