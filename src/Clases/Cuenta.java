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
public class Cuenta {
    // Ejercicio Extra 4
    public double saldo;
    public String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        this.titular = leer.nextLine();
        System.out.println("");
        System.out.print("Ingrese el saldo de dicha cuenta: ");
        this.saldo = leer.nextInt();
        System.out.println("");

    }

    public void retirar_dinero() {
        Scanner leer = new Scanner(System.in);
        double saldoActual = this.saldo;
        double pregunta1 = 0, pregunta2 = 0;

        do {
            System.out.print("Ingrese el nombre del titular de la cuenta a retirar efectivo: ");
            String nombre = leer.nextLine();
            System.out.println("");
            if (nombre.equals(this.titular)) {
                System.out.println("Ingresó correctamente a la cuenta de: " + this.titular);
                do {
                  System.out.println("Su saldo actualmente es de: " + saldoActual);
                System.out.print("Ingrese la cantidad a retirar: ");
                double saldoRetirar = leer.nextDouble();
                if (saldoRetirar <= saldoActual) {
                    saldoActual -= saldoRetirar;
                    System.out.println("Usted retiró "
                            + saldoRetirar + " pesos, y le queda un saldo de: "
                            + saldoActual);
                } else {
                    System.out.println("Saldo insuficiente, ");
                } 
                    System.out.println("Desea retirar nuevamente? (1 para sí, 2 para no)");
                    pregunta1 = leer.nextDouble();
                    if (pregunta1 == 1) {
                        System.out.println("Se volverá a hacer la transacción");
                    } else if (pregunta1 == 2) {
                        System.out.println("Operación de retiro de saldo cancelada");
                        break;
                    }
                } while (saldoActual > 0);

            } else {
                System.out.println("La cuenta es incorrecta");
            }
            System.out.println("Desea salir de la operación? (1 para sí, 2 para no)");
            pregunta2 = leer.nextDouble();
            if (pregunta2 == 1) {
                System.out.println("Usted salió correctamente");
                break;
            } else if (pregunta2 == 2) {
                System.out.println("Usted continuará con la operación");
            }
        } while (saldoActual > 0);
        if (saldoActual == 0) {
            System.out.println("Su saldo es 0 pesos, no puede seguir con el retiro de efectivo");
        }

    }

}
