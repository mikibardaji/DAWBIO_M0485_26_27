/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7millasametros;

import java.util.Scanner;

/**
 * Programa que transforma las milles nàutiques a metres.
 * 
 */
public class Ex7MillasAMetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MILLA_A_METRO = 1852;
        double milla, metres;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantas millas has recorrido con tu yate? ");
        milla = sc.nextDouble();
        
        metres = milla * MILLA_A_METRO;
        
        System.out.println("Has navegado " + metres + " metres... ");
    }
    
}
