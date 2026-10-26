/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14canvidivisa;

import java.util.Scanner;

/**
 *
 * Desenvolupeu un programa que entri un import en euros, 
 * mostri un menú amb diferents monedes, llegeixi 
 * el nom de la moneda i mostri la conversió a la moneda escollida.
 */
public class EX14CanviDivisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         double euros,cambio;
         System.out.print("Cuantos euros tienes? ");
         euros = teclado.nextDouble();
         
        System.out.println("a - Dolar");
        System.out.println("b - Libra");
        System.out.println("c - Yen");
        
        teclado.nextLine(); //neteja  el enter provinent del nextDouble
        System.out.print("Esperando opción: ");
        char opcio = teclado.nextLine().charAt(0);

        switch (opcio) {
            case 'a':
                cambio = euros * 1.17;
                System.out.println("Tienes " + cambio + " dolares");
                break;
            case 'b':
                cambio = euros * 0.87;
                System.out.println("Tienes " + cambio + " libras");
                break;
            
            case 'c':
                cambio = euros * 174.00;
                System.out.println("Tienes " + cambio + " yenes");
                break;

            default:
                System.out.println("Opción incorrecta");
            }
        }

}