/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progOrienObj;

import Clases.Cancion;

/**
 *
 * @author LogiC
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Desarrollar una clase Cancion con los siguientes atributos: título y
         * autor. Se deberá definir además dos constructores: uno vacío que
         * inicializa el título y el autor a cadenas vacías y otro que reciba
         * como parámetros el título y el autor de la canción. Se deberán además
         * definir los métodos getters y setters correspondientes.
         */
        
        Cancion c1 = new Cancion();
        
        c1.crearCancion();
        
        System.out.println(c1.toString());
    }

}
