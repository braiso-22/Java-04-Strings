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
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //a
        String cadena;
        System.out.println("Introduce una palabra");
        cadena = teclado.nextLine();
        System.out.println(cadena.toLowerCase().concat(" ").concat(cadena.toUpperCase()));

        //b
        if (cadena.contains("x")) {
            System.out.println("Tu cadena tiene x");
        }
        //c
        if (cadena.length() > 10) {
            System.out.println("Tiene más de 10 caracteres");
        }
        //d
        if (cadena.substring(4).contains("x")) {
            System.out.println("Tiene la x después de la 4ª letra");
        }
        //e
        String cadena2 = cadena.substring(0, 5);
        System.out.println(cadena2);
        //f
        cadena2 = cadena.substring(cadena.length() - 5, cadena.length());
        System.out.println(cadena2);
        //g
        if (cadena.equals("hola")) {
            System.out.println("Has escrito hola");
        }
        //h
        int numero = Integer.parseInt(cadena);
        System.out.println(numero);

        //i
        cadena2 = Integer.toHexString(numero);
        System.out.println(cadena2);
        //j
        if (cadena.contains("prueva")) {
            cadena = cadena.replace("prueva", "prueba");
        }
        System.out.println(cadena);
        //k
        if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
            System.out.println("El primer caracter y el último son el mismo");
        }
        //l
        int num = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                num += 1;
            }
        }
        System.out.printf("Hay %d digitos\n", num);
        //m
        boolean palindromo = true;
        for (int i = 1; i <= cadena.length() / 2; i++) {
            if (cadena.charAt(i - 1) != cadena.charAt(cadena.length() - i)) {
                palindromo = false;
                break;
            }
        }
        if (palindromo) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
        //n
        char primeraPosicion = cadena.charAt(0);
        char ultimaPosicion = cadena.charAt(cadena.length() - 1);
        String nueva = ultimaPosicion + cadena.substring(1, cadena.length() - 1) + primeraPosicion;

        System.out.println(nueva);

    }

}
