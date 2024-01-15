/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Prestamo;
import java.util.List;

/**
 *
 * @author karen
 */
public interface PrestamoIDAO {
    public void create(Prestamo prestamo);
    public void delete(Libro libro);
    public List<Prestamo> list();
}
