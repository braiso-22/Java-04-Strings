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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String email;
        String dominios;

        System.out.println("Introduce tu Email:");
        email = teclado.nextLine();

        dominios = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println(dominios);
    }

}
