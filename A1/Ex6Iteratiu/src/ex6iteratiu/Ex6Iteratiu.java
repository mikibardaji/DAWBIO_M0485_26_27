/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6iteratiu;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex6Iteratiu {

    /**
     * El programa llegeix 10 valors de tensió arterial (no nuls) i, en acabar, 
     * mostra un missatge indicant si s’ha detectat algun valor crític —és a dir, 
     * si algun valor ha estat negatiu, cosa que indicaria un error de mesura o 
     * un pacient fictici. 
     */
    public static void main(String[] args) {
         Scanner lector =new Scanner(System.in);
         double tensio;
         boolean negatiu = false;
         int contNegatiu = 0;
         for (int i = 1; i <= 5; i++) {
             System.out.print("-Inserta tensio arterial: mostra nº" + i + " : ");
             tensio = lector.nextDouble();
             if (tensio  <= 0)
             {
                 negatiu = true; //se activa el indiucador y nadie lo desactiva
                 contNegatiu++; 
             }
        } //salida bucle
         int mostra=1;
         negatiu = false;
         contNegatiu = 0;
         while (mostra <=10 && negatiu==false) // contNegatiu == 0
         {
             System.out.print("-Inserta tensio arterial: mostra nº" + mostra + " : ");
             tensio = lector.nextDouble();
             if (tensio  <= 0)
             {
                 negatiu = true; //se activa el indiucador y nadie lo desactiva
                 contNegatiu++; 
             }
             mostra++;
         }
         
        if (contNegatiu!=0)
        {
            System.out.println("Hay algun registro erroneo");
            System.out.println("Hay " + contNegatiu + " registros leidos erroneos");
        }
        if (negatiu == true)
            {
                System.out.println("Hay algun registro erroneo");
            }
        else
            {
                System.out.println("LEcturas todas ok");
            }
    }
    
}
