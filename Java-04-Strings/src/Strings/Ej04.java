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
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se va a generar una contraseña:");

        int rnd1,
                rnd2 = (int) (Math.random() * 6) + 5;

        String letras = "ABCDEFGHIJ",
                contraseña = new String();

        for (int i = 0; i < rnd2; i++) {
            rnd1 = (int) (Math.random() * 10);
            contraseña += letras.charAt(rnd1); //contraseña.concat(substring(rnd1, rnd1+1))
        }
        System.out.println(contraseña);
    }

}
