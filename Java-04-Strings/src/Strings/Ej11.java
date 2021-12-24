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
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*El programa busca los espacios en una cadena que introduzcas 
        y los borra, por lo que veo no aprecio ningún error*/
        
        Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();
        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;
        do {
            pos = cadenaSB.indexOf(" ");
            if (pos != -1) {
                cadenaSB.deleteCharAt(pos);
            }
        } while (pos != -1);
        System.out.println(cadenaSB);
    }

}
