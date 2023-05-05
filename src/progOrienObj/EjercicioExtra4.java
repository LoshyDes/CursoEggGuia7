/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progOrienObj;

import Clases.Cuenta;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
         * Luego, crea un método "retirar_dinero" que permita retirar una
         * cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo
         * nunca sea negativo después de realizar una transacción de retiro.
         */
        Scanner leer = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        
        c1.crearCuenta();
        
        System.out.println("Desea Retirar dinero de la cuenta? (1 para sí, 2 para no)");
        int pregunta = leer.nextInt();
        if (pregunta == 1) {
            c1.retirar_dinero();
        } else if (pregunta == 2) {
            System.out.println("Muchas gracias");
        }
        
    }

}
