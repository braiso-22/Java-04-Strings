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
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contraseña,
                abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                hash = "FGHIJKLMNOPQRSTUVWXYZABCDE",
                cifrada = "";
        
        System.out.println("Introduce una contraseña en mayusculas y la cifro:");
        contraseña = teclado.nextLine();

        for (int i = 0; i <= contraseña.length() - 1; i++) {
            /*
            for (int j = 0; j < 26; j++) {
                if (contraseña.charAt(i) == abecedario.charAt(j)) {
                    cifrada = cifrada + hash.charAt(j);
                }
            }*/
            if (Character.isUpperCase(contraseña.charAt(i))) {
                cifrada += hash.charAt(abecedario.indexOf(contraseña.charAt(i)));
            } else {
                cifrada += contraseña.charAt(i);
            }

        }
        System.out.println("Tu contraseña cifrada es: " + cifrada);
    }

}
