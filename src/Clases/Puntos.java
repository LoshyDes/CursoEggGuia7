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
public class Puntos {
    // Ejercicio Extra 2
    public int x1;
    public int x2;
    public int y1;
    public int y2;

    public Puntos() {
    }

    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la coordenada X del primer punto: ");
        this.x1= leer.nextInt();
        System.out.println("");
        System.out.print("Ingrese la coordenada Y del primer punto: ");
        this.y1= leer.nextInt();
        System.out.println("");
        
        System.out.print("Ingrese la coordenada X del segundo punto: ");
        this.x2= leer.nextInt();
        System.out.println("");
        System.out.print("Ingrese la coordenada Y del segundo punto: ");
        this.y2= leer.nextInt();
        System.out.println("");
        
        System.out.println("Punto 1: (" + x1 + ")(" + y1 + ")");
        System.out.println("Punto 2: (" + x2 + ")(" + y2 + ")");

    }
    
    public void distanciaPuntos() {
        
        System.out.println("La distancia entre los puntos es de : " 
                + Math.sqrt((Math.pow(this.x1-this.x2,2))
                        +(Math.pow(this.y1-this.y2,2))));
        
    }
}
