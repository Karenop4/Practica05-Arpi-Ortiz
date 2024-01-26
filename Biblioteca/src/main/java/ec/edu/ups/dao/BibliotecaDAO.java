/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.BibliotecaIDAO;
import ec.edu.ups.modelo.Biblioteca;
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
public class BibliotecaDAO implements BibliotecaIDAO{
    private List <Biblioteca> bibliotecas;
    private String rutaBiblioteca;
    
    public BibliotecaDAO(String rutaBiblioteca){
        bibliotecas = new ArrayList();
        this.rutaBiblioteca = rutaBiblioteca;
    }
    
    @Override
    public void create(Biblioteca biblioteca) {
        bibliotecas.add(biblioteca);
    }

    @Override
    public Biblioteca read(int codigo) {
        for (Biblioteca biblioteca:bibliotecas){
            if(biblioteca.getCodigo()==codigo){
                return biblioteca;
            }
        }
        return null;
    }

    @Override
    public void update(int codigo, Biblioteca biblioteca) {
        for (int i=0; i<bibliotecas.size();i++){
            Biblioteca bibliotecaBuscada = bibliotecas.get(i);
            if (bibliotecaBuscada.getCodigo()==codigo){
                bibliotecas.set(i, biblioteca);
                break;
            }
        }
        
    }

    @Override
    public void delete(int codigo) {
        for (int i=0; i<bibliotecas.size();i++){
            Biblioteca bibliotecaBuscada = bibliotecas.get(i);
            if (bibliotecaBuscada.getCodigo()==codigo){
                bibliotecas.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Biblioteca> list() {
        return bibliotecas;
    }

    @Override
    public void leerArchivo() {
        System.out.println(rutaBiblioteca);
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaBiblioteca))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 4) {
                    int codigo = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    String direccion = partes[2];
                    String telefono = partes[3];
                    bibliotecas.add(new Biblioteca(codigo, nombre, direccion, telefono));
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de la excepción
        }
    }

    @Override
    public void actualizarArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaBiblioteca))) {
            for (Biblioteca biblioteca : bibliotecas) {
                String linea = String.format("%d;%s;%s;%s", biblioteca.getCodigo(), biblioteca.getNombre(), biblioteca.getDireccion(), biblioteca.getTelefono());
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de la excepción, puedes ajustar según tus necesidades.
        }
    }
    
}
