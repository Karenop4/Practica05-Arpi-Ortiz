/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.BibliotecaIDAO;
import ec.edu.ups.idao.LibroIDAO;
import ec.edu.ups.idao.UsuarioIDAO;
import ec.edu.ups.modelo.Biblioteca;
import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Usuario;
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
    
    private UsuarioIDAO usuarioDAO;
    private UsuarioControlador usuarioControlador;

    public BibliotecaControlador(BibliotecaIDAO bibliotecaDAO, LibroIDAO libroDAO, UsuarioIDAO usuarioDAO) {
        this.bibliotecaDAO = bibliotecaDAO;
        this.libroDAO = libroDAO;
        this.usuarioDAO = usuarioDAO;
        this.libroControlador = new LibroControlador(libroDAO);
        this.usuarioControlador = new UsuarioControlador(usuarioDAO);
    }
    
    public void leerArchivo(){
        bibliotecaDAO.leerArchivo();
        
    }
    
    //////////////////////BIBLIOTECA/////////////////////
    
    public void create(int codigo, String nombre, String direccion, String telefono){
        biblioteca = new Biblioteca(codigo, nombre, direccion, telefono);
        bibliotecaDAO.create(biblioteca);
        bibliotecaDAO.actualizarArchivo();
    }
    
    public Biblioteca read (int codigo){
        biblioteca = bibliotecaDAO.read(codigo);
        return biblioteca;
    }
    
    public void delete(int codigo){
        bibliotecaDAO.delete(codigo);
        bibliotecaDAO.actualizarArchivo();
    }
    
    public void update (int codigo, String nombre, String direccion, String telefono){
        biblioteca.setCodigo(codigo);
        biblioteca.setDireccion(direccion);
        biblioteca.setNombre(nombre);
        biblioteca.setTelefono(telefono);
        bibliotecaDAO.update(codigo, biblioteca);
        bibliotecaDAO.actualizarArchivo();
    }
    
    public List <Biblioteca> list (){
        return bibliotecaDAO.list();
    }
    
    /////////////////////LIBRO//////////////////////
    public void leerArchivoLibro(){
        libroDAO.leerArchivo();
        biblioteca.eliminarListaLibros();
        for(Libro libro : libroDAO.list()){
            if(libro.getCodigoBiblio()==biblioteca.getCodigo()){
                biblioteca.anadirLibro(libro);
            }
        }
    }
    
    public void createLIbro(String titulo, String autor, String genero, int anho){
        libroControlador.create(biblioteca.getCodigo(),titulo, autor, genero, anho);
        Libro libro = new Libro();
        libro.setCodigoBiblio(biblioteca.getCodigo());
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
        return biblioteca.devolverLibros();
    }
    
    ///////////////////////////////////USUARIO/////////////////////////////////////////
    public void leerArchivoUsuario(){
        usuarioDAO.leerArchivo();
        biblioteca.eliminarListaUsuarios();
        for(Usuario usuario : usuarioDAO.list()){
            if(usuario.getCodigoBiblio()==biblioteca.getCodigo()){
                biblioteca.anadirUsuario(usuario);
            }
        }
    }
    
    public void createUsuario(String identificacion, String nombre, String direccion, String telefono){
        usuarioControlador.create(biblioteca.getCodigo(),identificacion, nombre, direccion, telefono);
        Usuario usuario = new Usuario(biblioteca.getCodigo(),identificacion, nombre, direccion, telefono);
        biblioteca.anadirUsuario(usuario);
    }
    
    public Usuario readUsuario (String id){
        return biblioteca.buscarUsuario(id);
    }
    
    public void deleteUsuario(String id){
        usuarioControlador.delete(id);
    }
    
    public void updateUsuario (String identificacion, String nombre, String direccion, String telefono){
        System.out.println(identificacion);
        usuarioControlador.update(biblioteca.getCodigo(),identificacion, nombre, direccion, telefono);
        Usuario usuario = new Usuario(biblioteca.getCodigo(),identificacion, nombre, direccion, telefono);
        biblioteca.actualizarUsuario(usuario);
    }
    
    public ArrayList <Usuario> listUsuario (){
        return biblioteca.devolverUsuarios();
    }
}
