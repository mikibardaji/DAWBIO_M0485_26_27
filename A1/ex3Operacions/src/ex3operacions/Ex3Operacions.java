/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3operacions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3Operacions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1,val2;
        int suma,resta,multi;
        double divi;
         Scanner sc = new Scanner(System.in);
         System.out.print("Pon el valor1 = ");
         val1 = sc.nextInt();
         System.out.print("Pon el valor2 = ");
         val2 = sc.nextInt();
         suma = val1 + val2;
         resta = val1 - val2;
         multi = val1 * val2;
         divi = (double) val1 / val2;
         System.out.println("La suma es " + suma);
         System.out.println("La resta es " + resta);
         System.out.println("La multiplicación es " + multi);
         System.out.println("La división es " + divi);
    }
    
}
