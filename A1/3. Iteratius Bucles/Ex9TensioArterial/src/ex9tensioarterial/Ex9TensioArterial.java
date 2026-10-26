/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9tensioarterial;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex9TensioArterial {

    /**
     *     9. Demana a l’usuari les pulsacions (batecs per minut) d’un pacient durant 5 minuts, i calcula la mitjana. Valores aleatorios entre 30 y 150.
Exemple de sortida:
Introdueix pulsacions minut 1: 80
...
Mitjana = 78.6 bpm
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        Random generaLatidosAleatorios = new Random();
        int latidos, acumLatidos=0, minutos;
        double media;
        for (minutos = 1; minutos <= 5; minutos++) { //minutos es variable contadora (vueltas, eventos, sucesos)
            latidos = generaLatidosAleatorios.nextInt(30, 151);
          
            System.out.println("Latidos minuto " + minutos + ": " + latidos);
            System.out.print("Aprieta para obtener el siguiente minuto");
            
            sc.nextLine();
            acumLatidos = acumLatidos + latidos;//variable acumulativa = acum = acum +-*/ (otra variable o calculo)
        }
        
       System.out.println("Total acumulado: " + acumLatidos);
        media = (double) acumLatidos/(minutos-1); //resto 1 porque al salir del bucle, los minutos valen 6
        System.out.println("Media: " + media);
    }
    
}
