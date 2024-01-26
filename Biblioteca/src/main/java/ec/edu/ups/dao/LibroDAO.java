/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.LibroIDAO;
import ec.edu.ups.modelo.Libro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karen
 */
public class LibroDAO implements LibroIDAO{
    private List <Libro> listaLibros;
    private String rutaLibro;
    
    public LibroDAO (String rutaLibro){
        listaLibros = new ArrayList();
        this.rutaLibro = rutaLibro;
    }

    @Override
    public void create(Libro libro) {
        listaLibros.add(libro);
    }

    @Override
    public Libro read(String titulo) {
        for (Libro libro:listaLibros){
            if(libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    @Override
    public void update(String titulo, Libro libro) {
        for (int i=0; i<listaLibros.size();i++){
            Libro libroBuscado = listaLibros.get(i);
            if (libroBuscado.getTitulo().equals(titulo)){
                listaLibros.set(i, libro);
                break;
            }
        }
    }

    @Override
    public void delete(String titulo) {
        for (int i=0; i<listaLibros.size();i++){
            Libro libroBuscado = listaLibros.get(i);
            if (libroBuscado.getTitulo().equals(titulo)){
                listaLibros.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Libro> list() {
        return listaLibros;
    }

    @Override
    public void leerArchivo() {
        listaLibros.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaLibro))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 6) {
                    int codigoBiblioteca = Integer.parseInt(partes[0]);
                    String titulo = partes[1];
                    String autor = partes[2];
                    int anho = Integer.parseInt(partes[3]);
                    String genero = partes[4];
                    boolean disponible = Boolean.parseBoolean(partes[5]);
                    listaLibros.add(new Libro(codigoBiblioteca,titulo, autor, genero, anho, disponible));
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de la excepción
        }
    }

    @Override
    public void actualizarArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaLibro))) {
            for (Libro libro : listaLibros) {
                String linea = String.format("%d;%s;%s;%d;%s;%b", libro.getCodigoBiblio(),libro.getTitulo(), libro.getAutor(), libro.getAnho(),libro.getGenero(), libro.isDisponoible());
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de la excepción, puedes ajustar según tus necesidades.
        }
    }
}
