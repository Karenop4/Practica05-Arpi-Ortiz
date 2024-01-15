/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.BibliotecaIDAO;
import ec.edu.ups.idao.LibroIDAO;
import ec.edu.ups.modelo.Biblioteca;
import ec.edu.ups.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karen
 */
public class BibliotecaControlador {
    private BibliotecaIDAO bibliotecaDAO;
    private Biblioteca biblioteca;
    
    private LibroIDAO libroDAO;
    private LibroControlador libroControlador;

    public BibliotecaControlador(BibliotecaIDAO bibliotecaDAO, LibroIDAO libroDAO) {
        this.bibliotecaDAO = bibliotecaDAO;
        this.libroDAO = libroDAO;
        this.libroControlador = new LibroControlador(libroDAO);
    }
    
    //////////////////////BIBLIOTECA/////////////////////
    public void create(int codigo, String nombre, String direccion, String telefono){
        biblioteca = new Biblioteca(codigo, nombre, direccion, telefono);
        bibliotecaDAO.create(biblioteca);
    }
    
    public Biblioteca read (int codigo){
        biblioteca = bibliotecaDAO.read(codigo);
        return biblioteca;
    }
    
    public void delete(int codigo){
        bibliotecaDAO.delete(codigo);
    }
    
    public void update (int codigo, String nombre, String direccion, String telefono){
        biblioteca.setCodigo(codigo);
        biblioteca.setDireccion(direccion);
        biblioteca.setNombre(nombre);
        biblioteca.setTelefono(telefono);
        bibliotecaDAO.update(codigo, biblioteca);
    }
    
    public List <Biblioteca> list (){
        return bibliotecaDAO.list();
    }
    
    /////////////////////LIBRO//////////////////////
    public void createLIbro(String titulo, String autor, String genero, int anho){
        libroControlador.create(titulo, autor, genero, anho);
        Libro libro = new Libro();
        libro.setAnho(anho);
        libro.setAutor(autor);
        libro.setDisponoible(true);
        libro.setGenero(genero);
        libro.setTitulo(titulo);
        biblioteca.anadirLibro(libro);
    }
    
    public Libro readLibro (String titulo){
        return biblioteca.buscarLibro(titulo);
    }
    
    public void deleteLibro(String titulo){
        libroControlador.delete(titulo);
    }
    
    public void updateLibro (String titulo, String autor, String genero, int anho, boolean disponible){
        libroControlador.update(titulo, autor, genero, anho, disponible);
        Libro libro = new Libro();
        libro.setAnho(anho);
        libro.setAutor(autor);
        libro.setDisponoible(disponible);
        libro.setGenero(genero);
        libro.setTitulo(titulo);
        biblioteca.actualizarLibro(libro);
    }
    
    public ArrayList <Libro> listLibro (){
        //biblioteca = bibliotecaDAO.read(codigoBiblio);
        return biblioteca.devolverLibros();
    }
}
