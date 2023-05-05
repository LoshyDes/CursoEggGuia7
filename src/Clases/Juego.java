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
public class Juego {
    // Ejercicio Extra 3
    private int numero1;
    private int numero2;

    public Juego() {
    }

    public Juego(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        int juego = 1;
        int J1W = 0, J2W = 0;
        do {
            System.out.print("Jugador 1 - Ingrese el número a adivinar: ");
            numero1 = leer.nextInt();
            System.out.println("");
            System.out.print("Jugador 1 - Ingrese la cantidad de intentos para adivinar: ");
            int numeroDeIntentos = leer.nextInt();
            System.out.println("");

            System.out.print("Jugador 2 - Ingrese un número para adivinar: ");
            numero2 = leer.nextInt();
            System.out.println("");
            if (numero2 == numero1) {
                System.out.println("Jugador 2 ha ganado");
                J2W++;
            } else {
                if (numero2 < numero1) {
                    System.out.println("Más alto");
                } else if (numero2 > numero1) {
                    System.out.println("Más bajo");
                }

                numeroDeIntentos--;
                System.out.println("Intentos restantes: " + numeroDeIntentos);
                while (numeroDeIntentos > 0) {
                    System.out.print("Jugador 2 - Ingrese nuevamente un número: ");
                    numero2 = leer.nextInt();
                    System.out.println("");

                    if (numero1 == numero2) {
                        System.out.println("Jugador 2 ganó.");
                        J2W++;
                        break;
                    } else {
                        numeroDeIntentos--;
                        if (numero2 < numero1) {
                            System.out.println("Más alto");
                        } else if (numero2 > numero1) {
                            System.out.println("Más bajo");
                        }
                        System.out.println("Intentos restantes: " + numeroDeIntentos);
                    }

                }
                if (numeroDeIntentos == 0) {
                    System.out.println("El jugador 2 se quedó sin intentos, perdió");
                    J1W++;
                }
                
            }
           
            System.out.print("Ponga 1 para seguir jugando, 2 para terminar el juego: ");
            juego = leer.nextInt();
            System.out.println("");
        } while (juego == 1);
        System.out.println("El juego ha terminado");
        System.out.println("Jugador 1 Wins: " + J1W 
                        + "\nJugador 2 Wins: " + J2W);

    }

}
