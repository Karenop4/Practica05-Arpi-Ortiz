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
    
    public void create(String titulo, String autor, String genero, int anho){
        libro = new Libro(titulo, autor, genero, anho, true);
        libroDAO.create(libro);
    }
    
    public Libro read (String titulo){
        libro = libroDAO.read(titulo);
        return libro;
    }
    
    public Libro read (String titulo, String autor){
        libro = libroDAO.read(titulo, autor);
        return libro;
    }
    
    public Libro readAutor(String autor){
        libro = libroDAO.readAutor(autor);
        return libro;
    }
    
    public void delete(String titulo){
        libroDAO.delete(titulo);
    }
    
    public void update (String titulo, String autor, String genero, int anho, boolean disponible){
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setGenero(genero);
        libro.setAnho(anho);
        libro.setDisponoible(disponible);
        libroDAO.update(titulo, libro);
    }
    
    public List <Libro> list (){
        return libroDAO.list();
    }
}
