/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Prestamo;
import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author karen
 */
public interface PrestamoIDAO {
    public void create(Usuario usuario, Prestamo prestamo);
    public void delete(Usuario usuario, Libro libro);
    public List<Prestamo> list();
    public void leerArchivo();
    public void actualizarArchivo();
}
