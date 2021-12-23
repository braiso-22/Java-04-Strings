/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Brais
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se va a generar una contraseña:");

        int rnd1;
        int rnd2 = (int) (Math.random() * 6) + 5;

        String letras = "ABCDEFGHIJ";
        String contraseña = new String();

        while (contraseña.length() < rnd2) {
            rnd1 = (int) (Math.random() * 10);

            if (!contraseña.contains(letras.substring(rnd1, rnd1 + 1))) {
                contraseña += letras.charAt(rnd1); //contraseña.concat(substring(rnd1, rnd1+1))
            }
        }
        System.out.println(contraseña);
    }

}
