/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Biblioteca;
import java.util.List;

/**
 *
 * @author karen
 */
public interface BibliotecaIDAO {
    void create(Biblioteca biblioteca);
    Biblioteca read(int codigo);
    void update(int codigo, Biblioteca biblioteca);
    void delete(int codigo);
    List<Biblioteca> list();
}
