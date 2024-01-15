/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.PrestamoIDAO;
import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Prestamo;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arpi
 */
public class PrestamoDAO implements PrestamoIDAO{
    private Usuario usuario;
    private ArrayList<Prestamo> listaPrestamos;

    public PrestamoDAO() {
        listaPrestamos = new ArrayList();
    }
    

    @Override
    public void create(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }

    @Override
    public void delete(Libro libro) {
        for (int i=0; i<listaPrestamos.size();i++){
            Prestamo prestamoBuscado = listaPrestamos.get(i);
            if (prestamoBuscado.getLibro().equals(libro)){
                listaPrestamos.remove(i);
                break;
            }
        }       
    }

    @Override
    public List<Prestamo> list() {
        return listaPrestamos;
    }
    
}
