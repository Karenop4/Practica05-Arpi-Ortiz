/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.UsuarioIDAO;
import ec.edu.ups.modelo.Biblioteca;
import ec.edu.ups.modelo.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author karen
 */
public class UsuarioDAO implements UsuarioIDAO{
    
    private Biblioteca biblioteca;
    private  ArrayList <Usuario> listaUsuarios;
    private String rutaUsuarios;
    
    public UsuarioDAO(String rutaUsuarios) {
    	listaUsuarios = new ArrayList();
        this.rutaUsuarios = rutaUsuarios;
    }

    @Override
    public void create(Usuario usuario) {
            listaUsuarios.add(usuario);
    }

    @Override
    public void update(String id, Usuario usuario) {
        for (int i=0; i<listaUsuarios.size();i++){
            Usuario usuarioBuscado = listaUsuarios.get(i);
            if (usuarioBuscado.getIdentificacion().equals(id)){
                listaUsuarios.set(i, usuario);
                break;
            }
        }
    }

    @Override
    public void delete(String identificacion) {
        for (int i=0; i<listaUsuarios.size();i++){
            Usuario usuarioBuscado = listaUsuarios.get(i);
            if (usuarioBuscado.getIdentificacion().equals(identificacion)){
                listaUsuarios.remove(i);
                break;
            }
        }
    }

    @Override
    public Usuario read(String identificacion) {
        for (Usuario usuario : listaUsuarios){
            if(usuario.getIdentificacion().equals(identificacion)){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Usuario> list() {
        return listaUsuarios;
    }

    @Override
    public void leerArchivo() {
        listaUsuarios.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaUsuarios))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 5) {
                    int codigoBiblioteca = Integer.parseInt(partes[0]);
                    String id = partes[1];
                    String nombre = partes[2];
                    String direccion = partes[3];
                    String telefono = partes[4];
                    listaUsuarios.add(new Usuario(codigoBiblioteca, id, nombre, direccion, telefono));
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de la excepción
        }
    }

    @Override
    public void actualizarArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaUsuarios))) {
            for (Usuario usuario : listaUsuarios) {
                String linea = String.format("%d;%s;%s;%s;%s", usuario.getCodigoBiblio(), usuario.getIdentificacion(), usuario.getNombre(), usuario.getDireccion(), usuario.getTelefono());
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de la excepción, puedes ajustar según tus necesidades.
        }
    }


    
}
