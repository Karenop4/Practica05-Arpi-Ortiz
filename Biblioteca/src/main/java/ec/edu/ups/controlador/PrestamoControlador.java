/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.PrestamoIDAO;
import ec.edu.ups.interfaces.IPrestable;
import ec.edu.ups.modelo.Biblioteca;
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
	private Prestamo prestamo;
        private Usuario usuario;
        private Biblioteca biblioteca; 

    public PrestamoControlador(PrestamoIDAO prestamoDao) {
        this.prestamoDao = prestamoDao;
    }
    
    public void create(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion){
        Prestamo prestamo = new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion);
        prestable.prestar(libro);
    }
    
    public void delete(Libro libro){
        prestamoDao.delete(libro);
        prestable.devolver(libro);
    }
       
    public List<Prestamo> list(Usuario usuario){
        return usuario.getListaPrestamos();
    }
  
    
}
