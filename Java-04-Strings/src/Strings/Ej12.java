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
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String numero = new String();
        boolean repite,
                numerico,
                digitos;

        do {
            System.out.println("Introduce un número de 6 cifras diferentes:");
            numero = a.nextLine();
            digitos = numero.length() == 6;
            numerico = true;
            repite = false;
            if (digitos) {
                for (int i = 0; i < numero.length(); i++) {
                    if (!(Character.isDigit(numero.charAt(i)))) {
                        numerico = false;
                        break;
                    }
                    for (int j = 0; j < i; j++) {
                        if (numero.charAt(j) == numero.charAt(i)) {
                            repite = true;
                            break;
                        }
                    }
                }
            }

        } while (repite == true || numerico == false || digitos == false);

        System.out.println(numero + " sirve");
    }

}
