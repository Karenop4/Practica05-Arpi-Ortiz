/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.BibliotecaIDAO;
import ec.edu.ups.modelo.Biblioteca;
import java.util.List;

/**
 *
 * @author karen
 */
public class BibliotecaControlador {
    private BibliotecaIDAO bibliotecaDAO;
    private Biblioteca biblioteca;

    public BibliotecaControlador(BibliotecaIDAO bibliotecaDAO) {
        this.bibliotecaDAO = bibliotecaDAO;
    }
    
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
}
