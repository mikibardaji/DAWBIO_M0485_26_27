/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5condicional;

import java.util.Scanner;



/**
 * Programa que llegeix dos números i els visualitza en ordre ascendent.
 * @author mabardaji
 */
public class Ex5CondicionalCondicionalAscendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pon el valor 1: ");
        num1 = sc.nextDouble();
        System.out.println("Pon el valor 2: ");
        num2 = sc.nextDouble();
        
        if (num1>=num2)
            {
                System.out.println(num2 + " <= " + num1);
            }
        else 
            {
                System.out.println(num1 + " < " + num2 );
            }
        
    }
    
}
