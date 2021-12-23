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
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        char letra;
        int counter = 0;

        System.out.println("Introduce un texto y luego una letra:");
        cadena = teclado.nextLine();
        letra = teclado.nextLine().charAt(0);

        for (int i = 0; i <= cadena.length() - 1; i++) {
            if (cadena.charAt(i) == letra) {
                counter += 1;
            }
        }
        System.out.printf("Hay %d %s en el texto\n", counter, letra);
    }

}
