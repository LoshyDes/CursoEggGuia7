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
public class Empleado {
    // Ejercicio Extra 5
    String nombre;
    int edad;
    double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void crearEmpleado() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        this.nombre = leer.next();
        System.out.println("Ingrese el salario del empleado: ");
        this.edad = leer.nextInt();
        System.out.println("Ingrese el salario del empleado: ");
        this.salario = leer.nextDouble();
    }

    public void calcular_aumento() {
        
        if (edad > 30) {
            System.out.println("Al empleado "+ this.nombre + "le corresponde un aumento de: " + this.salario * 0.1);
        } else {
            System.out.println("Al empleado "+ this.nombre + "le corresponde un aumento de: " + this.salario * 0.05);
        }
    }
}
