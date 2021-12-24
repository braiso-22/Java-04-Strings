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
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numFin = "", hexa;
        int numero, resto;
        System.out.println("Introduce un numero en decimal y lo paso"
                + " a hexadecimal");
        numero = teclado.nextInt();

        if (numero < 16) {
            switch (numero) {
                case 10:
                    hexa = "A";
                    break;
                case 11:
                    hexa = "B";
                    break;
                case 12:
                    hexa = "C";
                    break;
                case 13:
                    hexa = "D";
                    break;
                case 14:
                    hexa = "E";
                    break;
                case 15:
                    hexa = "F";
                    break;
                default:
                    hexa = Integer.toString(numero);
            }
            numFin = hexa;
        } else {

            while (numero >= 16) {
                resto = numero % 16;
                switch (resto) {
                    case 10:
                        hexa = "A";
                        break;
                    case 11:
                        hexa = "B";
                        break;
                    case 12:
                        hexa = "C";
                        break;
                    case 13:
                        hexa = "D";
                        break;
                    case 14:
                        hexa = "E";
                        break;
                    case 15:
                        hexa = "F";
                        break;
                    default:
                        hexa = Integer.toString(resto);
                }
                numFin = hexa + numFin;
                numero /= 16;

            }
            switch (numero) {
                case 10:
                    hexa = "A";
                    break;
                case 11:
                    hexa = "B";
                    break;
                case 12:
                    hexa = "C";
                    break;
                case 13:
                    hexa = "D";
                    break;
                case 14:
                    hexa = "E";
                    break;
                case 15:
                    hexa = "F";
                    break;
                default:
                    hexa = Integer.toString(numero);
            }
            numFin = hexa + numFin;

        }

        System.out.println(numFin);
    }

}
