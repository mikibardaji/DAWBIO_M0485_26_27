/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10temperaturacorporal;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex10TemperaturaCorporal {

    /**
     * Simula que vas mesurant la temperatura d’un pacient.
El programa ha de demanar valors (float) fins que la temperatura sigui 40.5 o més, i després mostrar quants intents han calgut. 
Introdueix temperatura: 35.9
Introdueix temperatura: 36.2
Introdueix temperatura: 40.6
Han calgut 3 mesures.
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double temperatura;
       int intents=0;
       do
       {
            System.out.print("Quina temperatura: ");
            temperatura = sc.nextDouble();
            intents++;
       }while (temperatura<=40.5);
        System.out.println("Has recogido " + intents + " muestras... ");
    }
    
}
