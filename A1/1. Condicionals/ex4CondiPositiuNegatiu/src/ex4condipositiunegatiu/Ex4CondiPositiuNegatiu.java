/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4condipositiunegatiu;

import java.util.Scanner;

/**
 * Programa que llegeix un número i 
 * diu si és positiu, si és zero, o bé i és negatiu.
 * @author mabardaji
 */
public class Ex4CondiPositiuNegatiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        //mostrar "pedir valor1"
        System.out.print("pedir valor1: ");
        //esperar valor1
        numero1 = sc.nextInt();
        
        
        if (numero1>0)
            {
                //si valor1 > 0
                //mostrar "positiu"
                System.out.println("Numero positivo");
            }
        else if (numero1 < 0)
            {
                //sino si valor1 < 0
                //mostrar "negatiu"
                System.out.println("Numero negativo");
            }
        else //if (numero1==0)
            {
                System.out.println("Mostrar Zero");
            }
        //sino si valor1 == 0
            //mostrar " es zero"
    }
    
}
