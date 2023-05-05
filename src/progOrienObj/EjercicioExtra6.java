/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progOrienObj;

import Clases.Rectangulo_;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y
         * un método "calcular_area" que calcule y devuelva el área del
         * rectángulo. Luego crea un objeto "rectangulo1" de la clase
         * "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
         */
        
        Rectangulo_ r1 = new Rectangulo_();
        Rectangulo_ rectangulo1 = new Rectangulo_();
        int lado1, lado2;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el lado 1: ");
        lado1 = leer.nextInt();
        System.out.println("Ingrese el lado 2: ");
        lado2 = leer.nextInt();
        r1.calcular_area(lado1, lado2);
        
        System.out.println("Ahora con un rectángulo de 4 x 6");
        rectangulo1.calcular_area(4, 6);
        
        
    }

}
