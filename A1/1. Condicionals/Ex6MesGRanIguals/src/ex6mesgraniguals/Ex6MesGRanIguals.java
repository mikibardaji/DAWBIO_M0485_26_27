/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6mesgraniguals;

import java.util.Scanner;

/**
 * Programa que llegeix dos números i ens diu quin és el més gran o si són
 * iguals.
 *
 * @author mabardaji
 */
public class Ex6MesGRanIguals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cual es el valor 1: ");
        num1 = sc.nextInt();
        System.out.print("Cual es el valor 2: ");
        num2 = sc.nextInt();

        if (num1 > num2) { //ALT + Shif + F para tabular codigo
            System.out.println("El mas grande es " + num1);
        } else if (num2 > num1) {
            System.out.println("El mas grande es " + num2);
        } else {
            System.out.println("Los numeros son iguales " + num1 + " = " + num2);
        }
    }

}
