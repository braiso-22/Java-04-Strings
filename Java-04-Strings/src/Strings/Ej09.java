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
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, resul;
        int edad;
        System.out.println("Introduce tu nombre completo y tu edad: ");
        nombre = teclado.nextLine();
        edad = Integer.parseInt(teclado.nextLine());
        resul = String.format("Hola, me llamo %s y tengo %d años", nombre, edad);
        System.out.println(resul);
    }
}
