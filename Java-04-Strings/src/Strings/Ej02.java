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
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        System.out.println("Introduce el numero de tu DNI");
        num = teclado.nextInt();

        System.out.println("La letra de tu DNI es " + letras.charAt(num % 23));
    }

}
