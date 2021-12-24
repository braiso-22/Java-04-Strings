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
public class Ej08b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ini, letra;
        int num;

        System.out.println("Introduce un texto, un número de la posición de una"
                + " letra y una letra para cambiar por la que hay en "
                + "esa posición");
        ini = teclado.nextLine();
        num = Integer.parseInt(teclado.nextLine());
        letra = teclado.nextLine().substring(0,1);

        StringBuilder texto = new StringBuilder(ini);
        texto.replace(num - 1, num, letra);

        System.out.println(texto);
    }

}
