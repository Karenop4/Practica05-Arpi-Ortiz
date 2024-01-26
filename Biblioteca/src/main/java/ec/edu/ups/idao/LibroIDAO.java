/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Libro;
import java.util.List;

/**
 *
 * @author karen
 */
public interface LibroIDAO {
    void create(Libro libro);
    Libro read(String titulo);
    void update(String titulo, Libro libro);
    void delete(String titulo);
    List<Libro> list();
    void leerArchivo();
    void actualizarArchivo();
}
