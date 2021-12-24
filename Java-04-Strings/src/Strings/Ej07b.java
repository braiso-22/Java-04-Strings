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
public class Ej07b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contraseña,
                abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                hash = "FGHIJKLMNOPQRSTUVWXYZABCDE",
                cifrada = "";

        int pos;
        char letra, cif;

        System.out.println("Introduce una contraseña y la cifro:");
        contraseña = teclado.nextLine();

        for (int i = 0; i <= (contraseña.length() - 1); i++) {
            letra = contraseña.charAt(i);

            if (Character.isAlphabetic(letra)) {
                pos = abecedario.indexOf(Character.toUpperCase(letra));
                cif = hash.charAt(pos);

                if (Character.isUpperCase(letra)) {
                    cifrada += cif;
                } else {
                    cif = Character.toLowerCase(cif);
                    cifrada += cif;
                }
            } else {
                cifrada += contraseña.charAt(i);
            }

        }
        System.out.println("Tu contraseña cifrada es: " + cifrada);
    }

}
