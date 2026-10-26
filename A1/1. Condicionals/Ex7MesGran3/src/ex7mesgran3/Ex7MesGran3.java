/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7mesgran3;

import java.util.Scanner;

/**
 * Programa que llegeix tres números 
 * diferents i ens diu quin és el més gran.
 * @author mabardaji
 */
public class Ex7MesGran3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor1, valor2, valor3, grande=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Valor1 : ");
        valor1 = teclado.nextDouble();
        System.out.print("Valor2 : ");
        valor2 = teclado.nextDouble();
        System.out.print("Valor3 : ");
        valor3 = teclado.nextDouble();
        
//        if (valor1 >= valor2 && valor1 >= valor3)
//            {
//                System.out.println("El numero mas grande es " + valor1);
//            }
//        else if(valor2 >= valor3 && valor2 >= valor1)
//            {
//                System.out.println("El numero mas grande es " + valor2);
//            }
//        else if(valor3 >= valor1 && valor3 >= valor2)
//            {
//                System.out.println("El numero mas grande es " + valor3);
//            }
        if (valor1 >= valor2 && valor1 >= valor3)
            {
                grande =  valor1;
            }
        else if(valor2 >= valor3 && valor2 >= valor1)
            {
                grande =  valor2;
            }
        else if(valor3 >= valor1 && valor3 >= valor2)
            {
                grande =  valor3;
            }
        
        System.out.println("El numero mas grande es " +grande);
    }
    
}
