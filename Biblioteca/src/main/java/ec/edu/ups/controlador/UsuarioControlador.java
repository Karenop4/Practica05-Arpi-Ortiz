/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.UsuarioIDAO;
import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author arpi
 */
public class UsuarioControlador {
	private UsuarioIDAO usuarioDao;
	private Usuario usuario;
	//Constructor

    public UsuarioControlador(UsuarioIDAO usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
    
    public void create(String identificacion, String nombre, String direccion, String telefono){
        Usuario usuario = new Usuario(identificacion, nombre, direccion, telefono);
        usuarioDao.create(usuario);
    }
    
    public Usuario read(String id){
        usuario = usuarioDao.read(id);
        return usuario;
    }
    
    public void delete(String id){
        usuarioDao.delete(id);
    }
    
    public void update(String identificacion, String nombre, String direccion, String telefono){
        usuario.setIdentificacion(identificacion);
        usuario.setNombre(nombre);
        usuario.setDireccion(direccion);
        usuario.setTelefono(telefono);
        usuarioDao.update(identificacion, usuario);
    }
    
    public List<Usuario> list(){
        return usuarioDao.list();
    }
}
