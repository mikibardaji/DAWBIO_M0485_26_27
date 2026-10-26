/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3condicionals;

import java.util.Scanner;

/**
 *
 * Programa que llegeix 2 números i en mostra el més gran.
 */
public class Ex3Condicionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        //mostrar "demanar numero1"
        System.out.print("demanar numero1: ");
        
        //esperar numero1
        numero1 = sc.nextInt();
        //mostrar "demanar numero2"
        System.out.print("demanar numero2: ");
        //esperar numero2
        numero2 = sc.nextInt();
        
        if (numero1 >= numero2)
            {
                System.out.println(numero1);
            }
        else
            {
                System.out.println(numero2);
            }
        // si numero1> numero2
            //mostrar numero1
        //sino
            //mostrar numero2
    }
    
}
