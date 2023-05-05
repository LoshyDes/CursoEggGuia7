/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class Cancion {
    //Ejercicio Extra 1
    private String título;
    private String autor;

    public Cancion() {
    }

    public Cancion(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void crearCancion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el título de la canción: ");
        this.título = leer.nextLine();
        System.out.println("");
        System.out.print("Ingrese el autor de la canción: ");
        this.autor = leer.nextLine();
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Cancion:" 
                + "\nT\u00edtulo: " + título 
                + "\nAutor: " + autor ;
    }
    
    
}
