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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ulti = "";
        System.out.println("Introduce 10 palabras");

        for (int i = 1; i <= 10; i++) {
            ulti += teclado.nextLine().charAt(0);
        }
        System.out.println(ulti);
    }

}
