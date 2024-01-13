/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.interfaces;

import ec.edu.ups.controlador.BibliotecaControlador;

/**
 *
 * @author karen
 */
public interface BibliotecaListener {
    void onBibliotecaSeleccionada(BibliotecaControlador bibliotecaControlador, int codigo);
}
