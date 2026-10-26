/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12sobrenfalten;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex12SobrenFalten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Introdueix el preu: ");
       double preu = lector.nextDouble();
       System.out.print("Introdueix la quantitat pagada: ");
       double paga = lector.nextDouble();
       double calcul;
       if (preu>paga)
       {
           calcul = preu - paga;
           System.out.println("Sobren " + calcul + " €");
       }
       else if (preu<paga)
       {
           calcul = paga - preu;
           System.out.println("Falten " + calcul + " €");
       }
       else
       {
           System.out.println("Has pagat just");
       }

    }
    
}
