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
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto, resul = "";
        char letra;
        int num;

        System.out.println("Introduce un texto, un número de la posición de una"
                + " letra y una letra para cambiar por la que hay en "
                + "esa posición");
        texto = teclado.nextLine();
        num = Integer.parseInt(teclado.nextLine());
        letra = teclado.nextLine().charAt(0);

        for (int i = 0; i <= (texto.length() - 1); i++) {
            if (i == num - 1) {
                resul += letra;
            } else {
                resul += texto.charAt(i);
            }
        }

        System.out.println(resul);
    }

}
