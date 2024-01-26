/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.controlador.BibliotecaControlador;
import ec.edu.ups.idao.PrestamoIDAO;
import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Prestamo;
import ec.edu.ups.modelo.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author arpi
 */
public class PrestamoDAO implements PrestamoIDAO{
    private ArrayList<Prestamo> listaPrestamos;
    private String rutaPrestamo;
    private BibliotecaControlador bc;

    public PrestamoDAO(String rutaPrestamo, BibliotecaControlador bc) {
        listaPrestamos = new ArrayList();
        this.rutaPrestamo = rutaPrestamo;
        this.bc = bc;
    }
    

    @Override
    public void create(Usuario usuario, Prestamo prestamo) {
        listaPrestamos.add(prestamo);
        usuario.setListaPrestamos(listaPrestamos);
    }

    @Override
    public void delete(Usuario usuario, Libro libro) {
        for (int i=0; i<listaPrestamos.size();i++){
            Prestamo prestamoBuscado = listaPrestamos.get(i);
            if (prestamoBuscado.getLibro().equals(libro)){
                listaPrestamos.remove(i);
                break;
            }
        }
        usuario.setListaPrestamos(listaPrestamos);
    }

    @Override
    public List<Prestamo> list() {
        return listaPrestamos;
    }

    @Override
    public void leerArchivo() {
        listaPrestamos.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaPrestamo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 4) {
                    //Libro
                    Libro libro = new Libro();
                    String titulo = partes[0];
                    libro = bc.readLibro(titulo);  
                    //Usuario
                    Usuario usuario = new Usuario();
                    usuario = bc.readUsuario(partes[1]);
                    //Fechas
                    Date fechaPrestamo = null;                  
                    Date fechaDevolucion = null;
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                        try {
                            fechaPrestamo = formatoFecha.parse(partes[2]);
                        } catch (ParseException e) {
                            System.out.println("Ocurrio un error!");

                        }                 
                        try {
                            fechaDevolucion = formatoFecha.parse(partes[3]);
                        } catch (ParseException e) {
                            System.out.println("Ocurrio un error!");

                        }                          
                    listaPrestamos.add(new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion));
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de la excepción
        }
    }

    @Override
    public void actualizarArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaPrestamo))) {
            for (Prestamo prestamo : listaPrestamos) {
                String linea = String.format("%s;%s;%s;%s", prestamo.getLibro().getTitulo(),prestamo.getUsuario().getIdentificacion(), prestamo.getFechaPrestamo(), prestamo.getFechaDevolucion());
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de la excepción, puedes ajustar según tus necesidades.
        }        
    }
    
}
