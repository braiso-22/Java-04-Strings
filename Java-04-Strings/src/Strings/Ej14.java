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
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String cadena;
        
        System.out.println("Introduce una cadena: ");
        cadena = a.nextLine();
        
        StringBuilder sb = new StringBuilder (cadena);
                
        if(sb.length()>2) sb.deleteCharAt(2);
        
        if(sb.length()>=5) sb.insert(4, 'x');
        
        if(sb.length()>0)sb.replace(0,1, "z");
        
        if(sb.length()>5)sb.delete(4, 10);
        
        sb.reverse();
        
        String cadena2 = sb.toString();
        
        System.out.println(cadena2);
    }
    
}
