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

    public PrestamoDAO(String rutaPrestamo) {
        listaPrestamos = new ArrayList();
        this.rutaPrestamo = rutaPrestamo;
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
                if (partes.length == 13) {
                    //Libro
                    Libro libro = new Libro(Integer.parseInt(partes[0]), partes[1], partes[2], partes[3], Integer.parseInt(partes[4]), Boolean.parseBoolean(partes[5])); 
                    //Usuario
                    Usuario usuario = new Usuario(Integer.parseInt(partes[6]), partes[7], partes[8], partes[9], partes[10]);
                    //Fechas
                    Date fechaPrestamo = null;                  
                    Date fechaDevolucion = null;
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                        try {
                            fechaPrestamo = formatoFecha.parse(partes[11]);
                        } catch (ParseException e) {
                            System.out.println("Ocurrio un error!");

                        }                 
                        try {
                            fechaDevolucion = formatoFecha.parse(partes[12]);
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
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                String linea = String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s", String.valueOf(prestamo.getLibro().getCodigoBiblio()),prestamo.getLibro().getTitulo(), prestamo.getLibro().getAutor(), prestamo.getLibro().getGenero(), String.valueOf(prestamo.getLibro().getAnho()), String.valueOf(prestamo.getLibro().isDisponoible()),String.valueOf(prestamo.getUsuario().getCodigoBiblio()), prestamo.getUsuario().getIdentificacion(), prestamo.getUsuario().getNombre(), prestamo.getUsuario().getDireccion(), prestamo.getUsuario().getTelefono(), formato.format(prestamo.getFechaPrestamo()), formato.format(prestamo.getFechaDevolucion()));
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de la excepción, puedes ajustar según tus necesidades.
        }        
    }
    
}
