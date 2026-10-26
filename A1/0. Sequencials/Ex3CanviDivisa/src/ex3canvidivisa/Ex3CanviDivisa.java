/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3canvidivisa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3CanviDivisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double montonDinero, cambioDivisa, divisa;
        Scanner lector = new Scanner(System.in);
        System.out.print("Quants diners tens? ");
        montonDinero = lector.nextDouble();
        System.out.print("Valor de la divisa? ");
        cambioDivisa = lector.nextDouble();
        divisa = montonDinero * cambioDivisa;
        System.out.println("Els diners que tens " + divisa + " moneda");
        
    }
    
}
