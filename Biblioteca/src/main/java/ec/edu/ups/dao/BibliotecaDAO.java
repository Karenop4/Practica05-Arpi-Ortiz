/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.BibliotecaIDAO;
import ec.edu.ups.modelo.Biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karen
 */
public class BibliotecaDAO implements BibliotecaIDAO{
    private List <Biblioteca> bibliotecas;
    
    public BibliotecaDAO(){
        bibliotecas = new ArrayList();
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
    
}
