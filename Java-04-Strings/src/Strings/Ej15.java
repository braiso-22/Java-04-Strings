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
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String cadena;
        //En este ejercicio cuando se refiere a posiciones
        //uso las posiciones de StringBuilder que empiezan por 0
        System.out.println("Introduce una cadena: ");
        cadena = a.nextLine();

        StringBuilder sb = new StringBuilder(cadena);

        for (int i = 1; i < sb.length(); i += 2) {
            sb.replace(i, i + 1, "*");
        }

        System.out.println(sb);
    }

}
