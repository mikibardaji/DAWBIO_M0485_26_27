/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6grauskelvin;

import java.util.Scanner;

/**
 * Programa que llegeixi un valor corresponent a una temperatura en graus Kelvin i 
 * escriviu la temperatura en graus Celsius. Despres que passi el Celsius 
 * a Farenheit (busqueu les formules a Google)
 * @author mabardaji
 */
public class Ex6GrausKelvin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kelvin, celsius, farenheit;
        final double KELVINACELSIUS = 273.15;
        
        System.out.println("Que temperatura en kelvin nos encontramos: ");
        kelvin = sc.nextDouble();
        //calculs
        celsius = kelvin - KELVINACELSIUS;
        farenheit = (double) (celsius*9/5)+32;
        
        
        System.out.println("Amb celsius es : " + celsius );
        System.out.println("Amb farenheit es : " + farenheit );
        
    }
    
}
