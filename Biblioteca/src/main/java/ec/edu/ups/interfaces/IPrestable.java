/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.interfaces;

import ec.edu.ups.modelo.Libro;

/**
 *
 * @author karen
 */
public interface IPrestable {
    public void prestar (Libro libro);
    public void devolver (Libro libro);
}
