/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Brais
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //a
        String cadena;
        System.out.println("Introduce una palabra");
        cadena = teclado.nextLine();
        System.out.println(cadena.toLowerCase().concat(" ").concat(cadena.toUpperCase()));
        
    }

}
