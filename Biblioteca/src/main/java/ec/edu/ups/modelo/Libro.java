/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

import ec.edu.ups.interfaces.IPrestable;

/**
 *
 * @author karen
 */
public class Libro implements IPrestable{
    private int codigoBiblio;
    private String titulo;
    private String autor;
    private String genero;
    private int anho;
    private boolean disponoible;
	
	
	//Constructores
    public Libro() {
		
    }

    public Libro(int codigoBiblio, String titulo, String autor, String genero, int anho, boolean disponoible) {
	this.codigoBiblio = codigoBiblio;
        this.titulo = titulo;
	this.autor = autor;
        this.genero = genero;
	this.anho = anho;
	this.disponoible = disponoible;
    }
	
    //Getters y Setters

    public int getCodigoBiblio() {
        return codigoBiblio;
    }

    public void setCodigoBiblio(int codigoBiblio) {
        this.codigoBiblio = codigoBiblio;
    }
    
    
    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = titulo;
    }

    public String getAutor() {
	return autor;
    }

    public void setAutor(String autor) {
	this.autor = autor;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
	this.anho = anho;
    }

    public boolean isDisponoible() {
	return disponoible;
    }

    public void setDisponoible(boolean disponoible) {
	this.disponoible = disponoible;
    }
	
    @Override
    public void prestar(Libro libro) {
	libro.setDisponoible(false);	
    }
    @Override
    public void devolver(Libro libro) {
	libro.setDisponoible(true);	
    }

    @Override
    public String toString() {
	return "Libro [titulo=" + titulo + ", autor=" + autor + ", anho=" + anho + ", disponoible=" + disponoible + "]";
    }
}
