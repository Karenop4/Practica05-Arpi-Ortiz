/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.UsuarioIDAO;
import ec.edu.ups.modelo.Biblioteca;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author karen
 */
public class UsuarioDAO implements UsuarioIDAO{
    
    private Biblioteca biblioteca;
    private  ArrayList <Usuario> listaUsuarios;
    
    public UsuarioDAO() {
    	listaUsuarios = new ArrayList();
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


    
}
