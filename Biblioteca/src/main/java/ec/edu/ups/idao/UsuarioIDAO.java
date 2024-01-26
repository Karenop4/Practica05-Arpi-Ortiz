/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author arpi
 */
public interface UsuarioIDAO {
    public void create(Usuario usuario);
    public void update(String id, Usuario usuario);
    public void delete(String identificacion);
    public Usuario read(String identificacion);
    public ArrayList <Usuario> list();    
    void leerArchivo();
    void actualizarArchivo();
}
