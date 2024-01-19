/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.PrestamoIDAO;
import ec.edu.ups.interfaces.IPrestable;
import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Prestamo;
import ec.edu.ups.modelo.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author arpi
 */
public class PrestamoControlador {
    private IPrestable prestable;
    private PrestamoIDAO prestamoDao;

    public PrestamoControlador(PrestamoIDAO prestamoDao) {
        this.prestamoDao = prestamoDao;
    }
    
    public void create(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion){
        Prestamo prestamo = new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion);
        prestamoDao.create(usuario, prestamo);
        libro.prestar(libro);
    }
    
    public void delete(Usuario usuario, Libro libro){
        prestamoDao.delete(usuario, libro);
        libro.devolver(libro);
    }
       
    public List<Prestamo> list(Usuario usuario){
        return usuario.getListaPrestamos();
    }
  
    
}
